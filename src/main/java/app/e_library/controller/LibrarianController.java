package app.e_library.controller;

import app.e_library.domain.Librarian;
import app.e_library.service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/librarian")
public class LibrarianController {
    private final LibrarianService librarianService;

    @Autowired
    public LibrarianController(LibrarianService librarianService) {
        this.librarianService = librarianService;
    }

    @PostMapping
    public void createLibrarian(@RequestBody Librarian librarian) {
        librarianService.createLibrarian(librarian);
    }

    @GetMapping
    public List<Librarian> getLibrarians() {
        return librarianService.getLibrarians();
    }

    @GetMapping("/{id}")
    public Librarian getLibrarian(@PathVariable Long id) {
        return librarianService.getLibrarian(id);
    }

    @GetMapping("/username/{username}")
    public Librarian getLibrarianByName(@PathVariable String username) {
        return librarianService.getLibrarian(username);
    }

    @PostMapping("/{id}")
    public void updateLibrarian(@RequestBody Librarian librarian) {
        librarianService.updateLibrarian(librarian);
    }

    @DeleteMapping("/{id}")
    public void deleteLibrarian(@PathVariable Long id) {
        librarianService.deleteLibrarian(id);
    }
}