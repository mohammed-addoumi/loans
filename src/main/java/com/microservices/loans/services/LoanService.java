package com.microservices.loans.services;

import com.microservices.loans.dao.LoanRepository;
import com.microservices.loans.model.Loan;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanService {

    private final LoanRepository loanRepository;

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }
}
