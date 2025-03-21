/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Project;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import co.edu.unicauca.academicprojectsprototype.domain.services.CompanyService;
import co.edu.unicauca.academicprojectsprototype.domain.services.CoordinatorService;
import co.edu.unicauca.academicprojectsprototype.domain.services.ProjectService;
import co.edu.unicauca.academicprojectsprototype.domain.services.StudentService;
import co.edu.unicauca.academicprojectsprototype.infra.Messages;
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
public class ProjectSqliteRepository extends SqliteRepository implements IProjectRepository {

    private CompanyService companyService;
    private StudentService studentService;

    public ProjectSqliteRepository(CompanyService companyService, StudentService studentService) {
        this.companyService = companyService;
        this.studentService = studentService;
    }

    @Override
    public void initializeDatabase() {
        String sql = "CREATE TABLE IF NOT EXISTS PROJECT ("
                + "TITLE TEXT PRIMARY KEY, "
                + "DESCRIPTION TEXT NOT NULL, "
                + "COMPANY TEXT NOT NULL, "
                + "STUDENT TEXT, "
                + "STATE TEXT NOT NULL)";

        try {
            Statement statement = conn.createStatement();
            statement.execute(sql);
            System.out.println("Database initialized successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean save(Project newProject) {
        try {
            //Validate product
            if (newProject == null || newProject.getTitle().isBlank()) {
                return false;
            }

            this.connect();
            this.initializeDatabase();
            String sql = "INSERT INTO PROJECT (TITLE, DESCRIPTION, COMPANY, STUDENT, STATE ) "
                    + "VALUES ( ?, ?, ?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newProject.getTitle());
            pstmt.setString(2, newProject.getDescription());
            pstmt.setString(3, newProject.getCompany().getName());
            if (newProject.getStudent() == null) {
                pstmt.setString(4, "No tiene");
            } else {
                pstmt.setString(4, newProject.getStudent().getName());
            }

            pstmt.setString(5, newProject.getState());
            pstmt.executeUpdate();

            this.disconnect();
            Messages.showMessageDialog("Project created successfully", "Project created");
            return true;
        } catch (SQLException ex) {
            Messages.showMessageDialog("Error registering the project:" + ex.getMessage(), "Error registering project");
            Logger.getLogger(CoordinatorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Project> listAll() {
        List<Project> projects = new ArrayList<>();

        try {
            this.connect();

            String sql = "SELECT TITLE, DESCRIPTION, COMPANY, STUDENT, STATE FROM PROJECT";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Project newProject = new Project();
                newProject.setTitulo(rs.getString("TITLE"));
                newProject.setDescription(rs.getString("DESCRIPTION"));
                newProject.setTituloEmpresa(rs.getString("COMPANY"));
                newProject.setNombreEstudiante(rs.getString("STUDENT"));
                newProject.setState(rs.getString("STATE"));
                projects.add(newProject);
            }

            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(CoordinatorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return projects;
    }

    @Override
    public Project Search(String title) {
        System.out.println("Buscando proyecto con nombre: " + title);
        try {
            this.connect();
            String sql = "SELECT TITLE, DESCRIPTION, COMPANY, STUDENT, STATE FROM PROJECT WHERE TITLE = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, title);
            ResultSet rs = stmt.executeQuery();

            if (!rs.next()) {
                System.out.println("No se encontró proyecto con el nombre: " + title);
                return null;
            }

            Project SearchProject = new Project();
            SearchProject.setTitulo(rs.getString("TITLE"));
            SearchProject.setDescription(rs.getString("DESCRIPTION"));
            SearchProject.setTituloEmpresa(rs.getString("COMPANY"));
            SearchProject.setNombreEstudiante("STUDENT");
            SearchProject.setState(rs.getString("STATE"));

            this.disconnect();
            return SearchProject;

        } catch (SQLException ex) {
            Logger.getLogger(CompanyService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean update(Project proyecto) {
        try {
            this.connect();
            String sql = "UPDATE PROJECT SET STUDENT = ?, STATE = ? WHERE TITLE = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, proyecto.getStudent().getName());
            pstmt.setString(2, proyecto.getState());
            pstmt.setString(3, proyecto.getTitle());
            pstmt.executeUpdate();
            this.disconnect();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error actualizando el proyecto: " + ex.getMessage());
        }
        return false;
    }

}
