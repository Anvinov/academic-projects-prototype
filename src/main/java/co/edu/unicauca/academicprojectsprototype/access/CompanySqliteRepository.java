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

            String sql = "INSERT INTO COMPANIES (NIT, NAME, PHONE, PAGE_WEB, SECTOR, EMAIL, PASSWORD ) "
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
            
            String sql = "SELECT NIT, NAME, PHONE, PAGE_WEB, SECTOR, EMAIL, PASSWORD FROM COMPANIES";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                Company newCompany = new Company();
                newCompany.setNit(rs.getString("NIT"));
                newCompany.setName(rs.getString("NAME"));
                newCompany.setPhone(rs.getString("PHONE"));
                newCompany.setPageWeb(rs.getString("PAGE_WEB"));
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
    
    public void connect() {
        // SQLite connection string
        //String url = "jdbc:sqlite:.\\\\miDatabase.db";
        String url = "jdbc:sqlite:C:\\Users\\anvig\\OneDrive\\Documentos\\NetBeansProjects\\Principios SOLID\\miDatabase.db";

        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException ex) {
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

}