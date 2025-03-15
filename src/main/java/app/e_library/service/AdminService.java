package app.e_library.service;

import app.e_library.domain.Admin;
import app.e_library.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public void createAdmin(Admin admin) {
        adminRepository.save(admin);
    }

    public List<Admin> getAdmins() {
        return adminRepository.findAll();
    }

    public Admin getAdmin(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    public Admin getAdminByUsername(String username) {
        Optional<Admin> admin = adminRepository.findByUsername(username);
        return admin.orElse(null);
    }

    public Admin getAdminByEmail(String email) {
        Optional<Admin> admin = adminRepository.findByEmail(email);
        return admin.orElse(null);
    }

    public void updateAdmin(Admin admin) {
        adminRepository.save(admin);
    }

    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }

    public Long getId(Admin admin) {
        return admin.getId();
    }

    public String getFirstName(Admin admin) {
        return admin.getFirstName();
    }

    public String getLastName(Admin admin) {
        return admin.getLastName();
    }

    public String getUsername(Admin admin) {
        return admin.getUsername();
    }

    public String getEmail(Admin admin) {
        return admin.getEmail();
    }

    public String getPassword(Admin admin) {
        return admin.getPassword();
    }
}
