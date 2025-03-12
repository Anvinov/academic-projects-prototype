/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import co.edu.unicauca.academicprojectsprototype.domain.services.StudentService;
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
public class StudentSqliteRepository implements IStudentRepository{

    private Connection conn;

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
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
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
    
    private static final String DB_PATH = "database/database.db";
    
    public void connect() {
        // SQLite connection string
        //String url = "jdbc:sqlite:.\\\\miDatabase.db";
        //String url = "jdbc:sqlite:C:\\Users\\anvig\\OneDrive\\Documentos\\NetBeansProjects\\Principios SOLID\\miDatabase.db";
        String url = "jdbc:sqlite:C:\\Users\\lopez\\OneDrive\\Escritorio\\Cosas\\Uni\\2025 -1\\L. Software II\\Proyecto\\AcademicProjects\\DataBase\\MyDataBase.db";
   
        //String absolutePath = new File(DB_PATH).getAbsolutePath();
        //String url = "jdbc:sqlite:" + absolutePath;
        try {
            conn = DriverManager.getConnection(url);
            //System.out.println("Conexión exitosa a la base de datos en: " + absolutePath);
        } catch (SQLException ex) {
            System.out.println("Error al conectar a la base de datos: " + ex.getMessage());
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
    @Override
    public void initializeDatabase () {
    String sql = "CREATE TABLE IF NOT EXISTS student (" +
                    "code TEXT PRIMARY KEY, " +
                    "name TEXT NOT NULL, " +
                    "phone TEXT, " +
                    "email TEXT, " +
                    "password TEXT" +
                    ")";
    try 
    {
        Statement statement = conn.createStatement();
        statement.execute(sql);
        System. out.println ("Database initialized successfully.");
    }
        catch (SQLException e) {
        e.printStackTrace () ;
        }
    }
    
}
