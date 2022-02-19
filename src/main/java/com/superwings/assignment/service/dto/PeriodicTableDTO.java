package com.superwings.assignment.service.dto;

import javax.persistence.Column;
import lombok.Data;

@Data
public class PeriodicTableDTO {

    private Long id;

    private String chemicalSymbol;

    private String chemicalName;

    private Double atomicWeight;
}
