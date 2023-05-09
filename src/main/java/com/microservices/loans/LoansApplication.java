package com.microservices.loans;

import com.microservices.loans.dao.LoanRepository;
import com.microservices.loans.model.Loan;
import jakarta.annotation.PostConstruct;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoansApplication {

    @Autowired private LoanRepository loanRepository;

    public static void main(String[] args) {
        SpringApplication.run(LoansApplication.class, args);
    }

    @PostConstruct
    public void init() {
        loanRepository.save(new Loan(1L, new BigDecimal("1000.00")));
        loanRepository.save(new Loan(2L, new BigDecimal("2000.00")));
        loanRepository.save(new Loan(3L, new BigDecimal("3000.00")));
        loanRepository.save(new Loan(4L, new BigDecimal("4000.00")));
    }
}
