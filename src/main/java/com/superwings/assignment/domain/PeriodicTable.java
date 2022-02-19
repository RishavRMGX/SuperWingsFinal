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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChemicalSymbol() {
        return chemicalSymbol;
    }

    public void setChemicalSymbol(String chemicalSymbol) {
        this.chemicalSymbol = chemicalSymbol;
    }

    public String getChemicalName() {
        return chemicalName;
    }

    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
    }

    public Double getAtomicWeight() {
        return atomicWeight;
    }

    public void setAtomicWeight(Double atomicWeight) {
        this.atomicWeight = atomicWeight;
    }
}
