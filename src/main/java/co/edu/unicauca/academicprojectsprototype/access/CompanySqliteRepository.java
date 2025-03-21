package co.edu.unicauca.academicprojectsprototype.access;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Sector;
import co.edu.unicauca.academicprojectsprototype.domain.services.CompanyService;
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

public class CompanySqliteRepository extends SqliteRepository implements ICompanyRepository {

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
            Messages.showMessageDialog("Empresa creada correctamente", "Empresa creada");
            return true;
        } catch (SQLException ex) {
            Messages.showMessageDialog("Error al registrar empresa:" + ex.getMessage(), "Error crear empresa");
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

    @Override
    public void initializeDatabase() {
        String sql = "CREATE TABLE IF NOT EXISTS COMPANY ("
                + "nit TEXT PRIMARY KEY, "
                + "name TEXT NOT NULL, "
                + "phone TEXT, "
                + "pageWeb TEXT, "
                + "sector TEXT, "
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
    public Company Search(String id) {
        try {
            this.connect();

            String sql = "SELECT NIT, NAME, PHONE, PAGEWEB, SECTOR, EMAIL, PASSWORD FROM COMPANY WHERE NIT = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Company searchCompany = new Company();
                searchCompany.setNit(rs.getString("NIT"));
                searchCompany.setName(rs.getString("NAME"));
                searchCompany.setPhone(rs.getString("PHONE"));
                searchCompany.setPageWeb(rs.getString("PAGEWEB"));
                searchCompany.setSector(Sector.valueOf(rs.getString("SECTOR").toUpperCase()));
                searchCompany.setEmail(rs.getString("EMAIL"));
                searchCompany.setPassword(rs.getString("PASSWORD"));

                rs.close();
                pstmt.close();
                this.disconnect();
                return searchCompany;
            }

            rs.close();
            pstmt.close();
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(CompanyService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Company SearchTitle(String title) {
        System.out.println("Buscando empresa con nombre: " + title);
    try {
        this.connect();
        String sql = "SELECT NIT, NAME, PHONE, PAGEWEB, SECTOR, EMAIL, PASSWORD FROM COMPANY WHERE NAME = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, title);
        ResultSet rs = stmt.executeQuery();

        if (!rs.next()) {
            System.out.println("No se encontró empresa con el nombre: " + title);
            return null;
        }

        Company company = new Company();
        company.setNit(rs.getString("NIT"));
        company.setName(rs.getString("NAME"));
        company.setPhone(rs.getString("PHONE"));
        company.setPageWeb(rs.getString("PAGEWEB"));
        company.setSector(Sector.valueOf(rs.getString("SECTOR").toUpperCase()));
        company.setEmail(rs.getString("EMAIL"));
        company.setPassword(rs.getString("PASSWORD"));

        this.disconnect();
        return company;

    } catch (SQLException ex) {
        Logger.getLogger(CompanyService.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }
}
