package app.e_library.controller;

import app.e_library.domain.Book;
import app.e_library.domain.Loan;
import app.e_library.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/loan")
public class LoanController {
    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping
    public void createLoan(@RequestBody Loan loan) {
        loanService.createLoan(loan);
    }

    @GetMapping
    public List<Loan> getLoans() {
        return loanService.getLoans();
    }

    @GetMapping("/{id}")
    public Loan getLoan(@PathVariable Long id) {
        return loanService.getLoan(id);
    }

    @GetMapping("/book/{book}")
    public Loan getLoanByBorrower(@PathVariable Book book) {
        return loanService.getLoan(book);
    }

    @PostMapping("/{id}")
    public void updateLoan(@RequestBody Loan loan) {
        loanService.updateLoan(loan);
    }

    @DeleteMapping("/{id}")
    public void deleteLoan(@PathVariable Long id) {
        loanService.deleteLoan(id);
    }
}
