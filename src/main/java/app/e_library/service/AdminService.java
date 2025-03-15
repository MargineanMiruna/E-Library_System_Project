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

    public Admin getAdmin(String username) {
        Optional<Admin> admin = adminRepository.findByUsername(username);
        return admin.orElse(null);
    }

    public void updateAdmin(Admin admin) {
        adminRepository.save(admin);
    }

    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}
