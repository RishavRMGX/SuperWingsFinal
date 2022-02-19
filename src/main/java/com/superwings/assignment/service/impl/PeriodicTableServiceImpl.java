package com.superwings.assignment.service.impl;

import com.superwings.assignment.domain.PeriodicTable;
import com.superwings.assignment.repository.PeriodicTableRepository;
import com.superwings.assignment.service.PeriodicTableService;
import com.superwings.assignment.service.dto.PeriodicTableDTO;
import com.superwings.assignment.service.mapper.PeriodicTableMapper;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PeriodicTableServiceImpl implements PeriodicTableService {

    @Autowired
    PeriodicTableRepository periodicTableRepository;

    @Autowired
    PeriodicTableMapper periodicTableMapper;

    @Override
    public Page<PeriodicTableDTO> getPeriodicTable(Pageable pageable) {
        Page<PeriodicTable> periodicTables = periodicTableRepository.findAll(pageable);
        return periodicTables.map(periodicTableMapper::toDTO);
    }

    @Override
    public PeriodicTableDTO getElement(Long atomicNumber) {
        Optional<PeriodicTable> periodicTable = periodicTableRepository.findById(atomicNumber);
        if (periodicTable.isPresent()) {
            return periodicTableMapper.toDTO(periodicTableRepository.findById(atomicNumber).orElse(null));
        }
        throw new RuntimeException("Element Not Found");
    }

    @Override
    public PeriodicTableDTO addElement(PeriodicTableDTO periodicTableDTO) {
        return periodicTableMapper.toDTO(periodicTableRepository.save(periodicTableMapper.toEntity(periodicTableDTO)));
    }
}
