package app.e_library.controller;

import app.e_library.domain.Library;
import app.e_library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/library")
public class LibraryController {
    private final LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping
    public void createLibrary(@RequestBody Library library) {
        libraryService.createLibrary(library);
    }

    @GetMapping
    public List<Library> getLibraries() {
        return libraryService.getLibraries();
    }

    @GetMapping("/{id}")
    public Library getLibrary(@PathVariable Long id) {
        return libraryService.getLibrary(id);
    }

    @GetMapping("/name/{name}")
    public Library getLibrary(@PathVariable String name) {
        return libraryService.getLibrary(name);
    }

    @PostMapping("/{id}")
    public void updateLibrary(@RequestBody Library library) {
        libraryService.updateLibrary(library);
    }

    @DeleteMapping("/{id}")
    public void deleteLibrary(@PathVariable Long id) {
        libraryService.deleteLibrary(id);
    }
}
