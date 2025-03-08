package co.edu.unicauca.academicprojectsprototype.access;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Sector;
import co.edu.unicauca.academicprojectsprototype.domain.services.CompanyService;
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

public class CompanySqliteRepository implements ICompanyRepository {

    private Connection conn;

    @Override
    public boolean save(Company newCompany) {
        try {
            //Validate product
            if (newCompany == null || newCompany.getNit().isBlank() || newCompany.getName().isBlank()) {
                return false;
            }
            
            this.connect();
            this.initializeDatabase();
            String sql = "INSERT INTO COMPANY (NIT, NAME, PHONE, PAGEWEB, SECTOR, EMAIL, PASSWORD ) "
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newCompany.getNit());
            pstmt.setString(2, newCompany.getName());
            pstmt.setString(3, newCompany.getPhone());
            pstmt.setString(4, newCompany.getPageWeb());
            pstmt.setString(5, newCompany.getSector().toString());
            pstmt.setString(6, newCompany.getEmail());
            pstmt.setString(7, newCompany.getPassword());
            pstmt.executeUpdate();
            
            this.disconnect();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CompanyService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Company> listAll() {
        List<Company> companies = new ArrayList<>();
        try {
            this.connect();
            
            String sql = "SELECT NIT, NAME, PHONE, PAGEWEB, SECTOR, EMAIL, PASSWORD FROM COMPANY";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                Company newCompany = new Company();
                newCompany.setNit(rs.getString("NIT"));
                newCompany.setName(rs.getString("NAME"));
                newCompany.setPhone(rs.getString("PHONE"));
                newCompany.setPageWeb(rs.getString("PAGEWEB"));
                newCompany.setSector(Sector.valueOf(rs.getString("SECTOR").toUpperCase()));
                newCompany.setEmail(rs.getString("EMAIL"));
                newCompany.setPassword(rs.getString("PASSWORD"));
                
                companies.add(newCompany);
            }
            
            this.disconnect();
            
        } catch (SQLException ex) {
            Logger.getLogger(CompanyService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return companies;
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
            Logger.getLogger(CompanyService.class.getName()).log(Level.SEVERE, null, ex);
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
    String sql = "CREATE TABLE IF NOT EXISTS company (" +
                    "nit TEXT PRIMARY KEY, " +
                    "name TEXT NOT NULL, " +
                    "phone TEXT, " +
                    "pageWeb TEXT, " +
                    "sector TEXT, " +
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