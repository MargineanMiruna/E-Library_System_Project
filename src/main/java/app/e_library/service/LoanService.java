package app.e_library.service;

import app.e_library.domain.Book;
import app.e_library.domain.Customer;
import app.e_library.domain.Loan;
import app.e_library.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
    private final LoanRepository loanRepository;

    @Autowired
    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public void createLoan(Loan loan) {
        loanRepository.save(loan);
    }

    public List<Loan> getLoans() {
        return loanRepository.findAll();
    }

    public Loan getLoan(Long id) {
        return loanRepository.findById(id).orElse(null);
    }

    public Loan getLoan(Book book) {
        Optional<Loan> loan = loanRepository.findByBook(book);
        return loan.orElse(null);
    }

    public void updateLoan(Loan loan) {
        loanRepository.save(loan);
    }

    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }
}
