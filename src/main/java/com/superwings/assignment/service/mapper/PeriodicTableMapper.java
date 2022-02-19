package com.superwings.assignment.service.mapper;

import com.superwings.assignment.domain.Authority;
import com.superwings.assignment.domain.PeriodicTable;
import com.superwings.assignment.domain.User;
import com.superwings.assignment.service.dto.AdminUserDTO;
import com.superwings.assignment.service.dto.PeriodicTableDTO;
import com.superwings.assignment.service.dto.UserDTO;
import java.util.*;
import java.util.stream.Collectors;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class PeriodicTableMapper {

    public PeriodicTableDTO toDTO(PeriodicTable periodicTable) {
        if (periodicTable == null) {
            return null;
        } else {
            PeriodicTableDTO periodicTableDTO = new PeriodicTableDTO();
            periodicTableDTO.setId(periodicTable.getId());
            periodicTableDTO.setChemicalSymbol(periodicTable.getChemicalSymbol());
            periodicTableDTO.setChemicalName(periodicTable.getChemicalName());
            periodicTableDTO.setAtomicWeight(periodicTable.getAtomicWeight());
            return periodicTableDTO;
        }
    }

    public PeriodicTable toEntity(PeriodicTableDTO periodicTableDTO) {
        if (periodicTableDTO == null) {
            return null;
        } else {
            PeriodicTable periodicTable = new PeriodicTable();
            periodicTable.setId(periodicTableDTO.getId());
            periodicTable.setChemicalSymbol(periodicTableDTO.getChemicalSymbol());
            periodicTable.setChemicalName(periodicTableDTO.getChemicalName());
            periodicTable.setAtomicWeight(periodicTableDTO.getAtomicWeight());
            return periodicTable;
        }
    }
}
