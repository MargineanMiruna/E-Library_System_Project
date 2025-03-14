//package app.e_library.configuration;
//
//import app.e_library.model.Admin;
//import app.e_library.repository.AdminRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class AdminConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(AdminRepository adminRepository) {
//        return args -> {
//            Admin admin1 = new Admin("Miruna-Elena", "Marginean", "mmiruna10", "miruna.marginean@gmail.com", "admin1.");
//            Admin admin2 = new Admin("Alin Gabriel", "Ratiu", "ralin12", "alin.ratiu@gmail.com", "admin2.");
//            adminRepository.saveAll(List.of(admin1, admin2));
//        };
//    }
//}
