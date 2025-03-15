package app.e_library.service;

import app.e_library.domain.Library;
import app.e_library.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
    private final LibraryRepository libraryRepository;

    @Autowired
    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public void createLibrary(Library library) {
        libraryRepository.save(library);
    }

    public List<Library> getLibraries() {
        return libraryRepository.findAll();
    }

    public Library getLibrary(Long id) {
        return libraryRepository.findById(id).orElse(null);
    }

    public Library getLibrary(String name) {
        Optional<Library> library = libraryRepository.findByName(name);
        return library.orElse(null);
    }

    public void updateLibrary(Library library) {
        libraryRepository.save(library);
    }

    public void deleteLibrary(Long id) {
        libraryRepository.deleteById(id);
    }
}
