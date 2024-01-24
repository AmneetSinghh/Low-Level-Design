package MachineCoding_HLD.SocialMedia.implementation.service;

import MachineCoding_HLD.SocialMedia.implementation.model.Company;

public interface CompanyService {
    void addCompany();
    void editCompany(Company company);
    void deleteCompany(Company company);
    Company getByName (String name);
}
