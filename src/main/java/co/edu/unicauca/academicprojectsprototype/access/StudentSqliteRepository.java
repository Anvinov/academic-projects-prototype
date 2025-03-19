/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import co.edu.unicauca.academicprojectsprototype.domain.services.StudentService;
import co.edu.unicauca.academicprojectsprototype.infra.Messages;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anvig
 */
public class StudentSqliteRepository extends SqliteRepository implements IStudentRepository {

    @Override
    public void initializeDatabase() {
        String sql = "CREATE TABLE IF NOT EXISTS student ("
                + "code TEXT PRIMARY KEY, "
                + "name TEXT NOT NULL, "
                + "phone TEXT, "
                + "email TEXT, "
                + "password TEXT"
                + ")";
        try {
            Statement statement = conn.createStatement();
            statement.execute(sql);
            System.out.println("Database initialized successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public boolean save(Student newStudent) {
        try {
            //Validate product
            if (newStudent == null || newStudent.getCode().isBlank() || newStudent.getName().isBlank()) {
                return false;
            }

            this.connect();
            this.initializeDatabase();
            String sql = "INSERT INTO STUDENT (CODE, NAME, PHONE, EMAIL, PASSWORD ) "
                    + "VALUES ( ?, ?, ?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newStudent.getCode());
            pstmt.setString(2, newStudent.getName());
            pstmt.setString(3, newStudent.getPhone());
            pstmt.setString(4, newStudent.getEmail());
            pstmt.setString(5, newStudent.getPassword());
            pstmt.executeUpdate();

            this.disconnect();
            Messages.showMessageDialog("Estudiante registrado exitosamente", "Estudiante Registrado");
            return true;
        } catch (SQLException ex) {
            Messages.showMessageDialog("Error al registrar estudiante" + ex.getMessage(), "Error registrar estudiante");
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Student search(String code) {
        Student searchStudent = null;
        try {
            this.connect();

            String sql = "SELECT CODE, NAME, PHONE, EMAIL, PASSWORD FROM STUDENT WHERE CODE = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, code);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) { 
                searchStudent = new Student();
                searchStudent.setCode(rs.getString("CODE"));
                searchStudent.setName(rs.getString("NAME"));
                searchStudent.setPhone(rs.getString("PHONE"));
                searchStudent.setEmail(rs.getString("EMAIL"));
                searchStudent.setPassword(rs.getString("PASSWORD"));
            }

            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, "Error al buscar estudiante", ex);
        }
        return searchStudent; 
    }

    @Override
    public List<Student> listAll() {
        List<Student> students = new ArrayList<>();
        try {
            this.connect();

            String sql = "SELECT CODE, NAME, PHONE, EMAIL, PASSWORD FROM STUDENT";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Student newStudent = new Student();
                newStudent.setCode(rs.getString("CODE"));
                newStudent.setName(rs.getString("NAME"));
                newStudent.setPhone(rs.getString("PHONE"));
                newStudent.setEmail(rs.getString("EMAIL"));
                newStudent.setPassword(rs.getString("PASSWORD"));

                students.add(newStudent);
            }

            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

}
