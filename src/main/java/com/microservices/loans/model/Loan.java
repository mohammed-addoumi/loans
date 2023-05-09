package com.microservices.loans.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "loan")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Loan {

    @Id private Long id;
    private BigDecimal amount;
}
