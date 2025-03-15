package app.e_library.service;

import app.e_library.domain.Librarian;
import app.e_library.repository.LibrarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibrarianService {
    private final LibrarianRepository librarianRepository;

    @Autowired
    public LibrarianService(LibrarianRepository librarianRepository) {
        this.librarianRepository = librarianRepository;
    }

    public void createLibrarian(Librarian librarian) {
        librarianRepository.save(librarian);
    }

    public List<Librarian> getLibrarians() {
        return librarianRepository.findAll();
    }

    public Librarian getLibrarian(Long id) {
        return librarianRepository.findById(id).orElse(null);
    }

    public Librarian getLibrarian(String username) {
        Optional<Librarian> librarian = librarianRepository.findByUsername(username);
        return librarian.orElse(null);
    }

    public void updateLibrarian(Librarian librarian) {
        librarianRepository.save(librarian);
    }

    public void deleteLibrarian(Long id) {
        librarianRepository.deleteById(id);
    }
}
