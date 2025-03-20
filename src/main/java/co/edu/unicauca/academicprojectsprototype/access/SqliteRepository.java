/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

import co.edu.unicauca.academicprojectsprototype.domain.services.CompanyService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anvig
 */
public class SqliteRepository {
    
    protected Connection conn;
    
    protected void connect() {
        // SQLite connection string
        //String url = "jdbc:sqlite:.\\\\miDatabase.db";
        //String url = "jdbc:sqlite:C:\\Users\\anvig\\OneDrive\\Documentos\\NetBeansProjects\\Principios SOLID\\miDatabase.db";
        //String url = "jdbc:sqlite:C:\\Users\\lopez\\OneDrive\\Escritorio\\Cosas\\Uni\\2025 -1\\L. Software II\\Proyecto\\AcademicProjects\\DataBase\\MyDataBase.db";
        String url = "jdbc:sqlite:C:/Users/andre/OneDrive/Documentos/Unicauca/Semestre 6/Ingeniería de Software II/Proyecto/academic-projects-prototype/database.db";
        //String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\database\\database.db";
        
        
        //String absolutePath = new File(DB_PATH).getAbsolutePath();
        //String url = "jdbc:sqlite:" + absolutePath;
        try {
            conn = DriverManager.getConnection(url);
            //System.out.println("Conexión exitosa a la base de datos en: " + absolutePath);
        } catch (SQLException ex) {
            System.out.println("Error al conectar a la base de datos: " + ex.getMessage());
            Logger.getLogger(CompanyService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
