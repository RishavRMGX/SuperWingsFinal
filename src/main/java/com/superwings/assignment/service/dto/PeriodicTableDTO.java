package com.superwings.assignment.service.dto;

import javax.persistence.Column;
import lombok.Data;

@Data
public class PeriodicTableDTO {

    private Long id;

    private String chemicalSymbol;

    private String chemicalName;

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
