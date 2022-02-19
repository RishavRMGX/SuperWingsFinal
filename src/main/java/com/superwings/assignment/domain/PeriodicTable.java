package com.superwings.assignment.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "periodic_table")
@Data
public class PeriodicTable {

    @Id
    @Column(name = "atomic_number", nullable = false)
    private Long id;

    @Column(name = "chemical_symbol", nullable = false)
    private String chemicalSymbol;

    @Column(name = "chemical_name", nullable = false)
    private String chemicalName;

    @Column(name = "atomic_weight", nullable = false)
    private Double atomicWeight;
}
