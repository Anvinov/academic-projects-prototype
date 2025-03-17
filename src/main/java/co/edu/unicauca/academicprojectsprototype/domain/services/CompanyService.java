package co.edu.unicauca.academicprojectsprototype.domain.services;

import co.edu.unicauca.academicprojectsprototype.access.ICompanyRepository;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import java.util.List;

public class CompanyService implements ICompanyService {

    private ICompanyRepository repository;

    public CompanyService(ICompanyRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public List<Company> getAllCompanies() {
        return repository.listAll();
    }

    @Override
    public boolean saveCompany(Company newCompany) {
        return repository.save(newCompany);
    }

    @Override
    public Company search(String id) {
        return repository.Search(id);
    }

}
