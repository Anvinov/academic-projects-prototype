/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

import State.Coordinator.PendienteCoordi;
import State.Coordinator.RechazadoCoordi;
import State.Coordinator.VerificadoCoordi;
import State.ICoordinatorState;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Coordinator;
import co.edu.unicauca.academicprojectsprototype.domain.services.CoordinatorService;
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
public class CoordinatorSqliteRepository extends SqliteRepository implements ICoordinatorRepository {

    @Override
    public boolean save(Coordinator newCoordinator) {
        try {
            //Validate product
            if (newCoordinator == null || newCoordinator.getCode().isBlank() || newCoordinator.getName().isBlank()) {
                return false;
            }

            this.connect();
            this.initializeDatabase();
            String sql = "INSERT INTO COORDINATOR (CODE, NAME, PHONE, EMAIL, ACADEMIC_PROGRAM, PASSWORD, STATE ) "
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newCoordinator.getCode());
            pstmt.setString(2, newCoordinator.getName());
            pstmt.setString(3, newCoordinator.getPhone());
            pstmt.setString(4, newCoordinator.getEmail());
            pstmt.setString(5, newCoordinator.getProgramaAcademico());
            pstmt.setString(6, newCoordinator.getPassword());
            pstmt.setString(7, newCoordinator.getEstado().toString());
            pstmt.executeUpdate();

            this.disconnect();
            Messages.showMessageDialog("Company created successfully", "Company created");
            return true;
        } catch (SQLException ex) {
            Messages.showMessageDialog("Error registering the company:" + ex.getMessage(), "Error registering company");
            Logger.getLogger(CoordinatorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public void initializeDatabase() {
        String sql = "CREATE TABLE IF NOT EXISTS COORDINATOR ("
                + "CODE TEXT PRIMARY KEY, "
                + "NAME TEXT NOT NULL, "
                + "PHONE TEXT, "
                + "EMAIL TEXT, "
                + "ACADEMIC_PROGRAM TEXT, "
                + "PASSWORD TEXT, "
                + "STATE TEXT"
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
    public List<Coordinator> listAll() {
        List<Coordinator> coordinators = new ArrayList<>();
        try {
            this.connect();

            String sql = "SELECT CODE, NAME, PHONE, EMAIL, ACADEMIC_PROGRAM, PASSWORD, STATE FROM COORDINATOR";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Coordinator newCoordinator = new Coordinator();
                newCoordinator.setCode(rs.getString("CODE"));
                newCoordinator.setName(rs.getString("NAME"));
                newCoordinator.setPhone(rs.getString("PHONE"));
                newCoordinator.setEmail(rs.getString("EMAIL"));
                newCoordinator.setProgramaAcademico(rs.getString("ACADEMIC_PROGRAM"));
                newCoordinator.setPassword(rs.getString("PASSWORD"));
                newCoordinator.setEstado(obtenerEstado(rs.getString("STATE"), newCoordinator));

                coordinators.add(newCoordinator);
            }

            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(CoordinatorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return coordinators;
    }

    @Override
    public Coordinator Search(String code) {
        try {
            this.connect();
            String sql = "SELECT CODE, NAME, PHONE, EMAIL, ACADEMIC_PROGRAM, PASSWORD, STATE FROM COORDINATOR WHERE CODE = " + code;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            Coordinator searchCoordinator = new Coordinator();
            searchCoordinator.setCode(rs.getString("CODE"));
            searchCoordinator.setName(rs.getString("NAME"));
            searchCoordinator.setPhone(rs.getString("PHONE"));
            searchCoordinator.setEmail(rs.getString("EMAIL"));
            searchCoordinator.setProgramaAcademico(rs.getString("ACADEMIC_PROGRAM"));
            searchCoordinator.setPassword(rs.getString("PASSWORD"));
            searchCoordinator.setEstado(obtenerEstado(rs.getString("STATE"), searchCoordinator));

            this.disconnect();
            return searchCoordinator;

        } catch (SQLException ex) {
            Logger.getLogger(CoordinatorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    // Método para convertir un String en un objeto de estado
    public ICoordinatorState obtenerEstado(String estado, Coordinator coordinator) {
        switch (estado) {
            case "PENDIENTE":
                return new PendienteCoordi(coordinator);
            case "VERIFICADO":
                return new VerificadoCoordi(coordinator);
            case "RECHAZADO":
                return new RechazadoCoordi(coordinator);
            default:
                throw new IllegalArgumentException("Estado no válido: " + estado);
        }
    }

    @Override
    public boolean actualizarEstado(String code, ICoordinatorState nuevoEstado) {
        String sql = "UPDATE COORDINATOR SET state = ? WHERE code = ?";

        try {
            this.connect(); // Asegura que conn está inicializado
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, nuevoEstado.toString()); // Guardamos el estado como String
            pstmt.setString(2, code);

            int filasActualizadas = pstmt.executeUpdate(); // Ejecutamos la consulta
            if (filasActualizadas > 0) {
                System.out.println("Estado actualizado correctamente.");
                return true;
            } else {
                System.out.println("No se encontró el coordinador con el código: " + code);
            }

            pstmt.close(); // Cerramos el PreparedStatement

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
