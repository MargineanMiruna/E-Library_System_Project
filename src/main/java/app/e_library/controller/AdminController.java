package app.e_library.controller;

import app.e_library.model.Admin;
import app.e_library.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/admin")
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping
    public void createAdmin(@RequestBody Admin admin) {
        adminService.createAdmin(admin);
    }

    @GetMapping
    public List<Admin> getAdmins() {
        return adminService.getAdmins();
    }

    @GetMapping("/{id}")
    public Admin getAdmin(@PathVariable Long id) {
        return adminService.getAdmin(id);
    }

    @GetMapping("/{username}")
    public Admin getAdmin(@PathVariable String username) {
        return adminService.getAdmin(username);
    }

    @PutMapping("/{id}")
    public void updateAdmin(@RequestBody Admin admin) {
        adminService.updateAdmin(admin);
    }

    @DeleteMapping("/{id}")
    public void deleteAdmin(@PathVariable Long id) {
        adminService.deleteAdmin(id);
    }
}
