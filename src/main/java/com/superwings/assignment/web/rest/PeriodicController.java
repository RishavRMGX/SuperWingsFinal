package com.superwings.assignment.web.rest;

import com.superwings.assignment.service.PeriodicTableService;
import com.superwings.assignment.service.dto.PeriodicTableDTO;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/periodic")
public class PeriodicController {

    @Autowired
    PeriodicTableService periodicTableService;

    @GetMapping("/all")
    ResponseEntity<Object> getAllElement(Pageable pageable) {
        Page<PeriodicTableDTO> periodicTableDTO = periodicTableService.getPeriodicTable(pageable);

        Map<String, Object> response = new HashMap<>();
        response.put("result", pageable);
        response.put("msg", "Successful");

        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/add")
    ResponseEntity<Object> addElement(@RequestBody PeriodicTableDTO periodicTableDTO) {
        Map<String, Object> response = new HashMap<>();
        if (periodicTableDTO == null) {
            return ResponseEntity.notFound().build();
        }
        if (periodicTableDTO.getId() != null) {
            response.put("msg", "UnSuccessful");
            response.put("error", "Id Already Exist");
            return ResponseEntity.badRequest().body(response);
        } else {
            PeriodicTableDTO savedData = periodicTableService.addElement(periodicTableDTO);
            if (savedData == null) ResponseEntity.internalServerError();
            response.put("result", savedData);
            response.put("msg", "Successful");
            return ResponseEntity.ok().body(response);
        }
    }
}
