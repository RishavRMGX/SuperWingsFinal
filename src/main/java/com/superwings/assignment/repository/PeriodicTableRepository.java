package com.superwings.assignment.repository;

import com.superwings.assignment.domain.PeriodicTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodicTableRepository extends JpaRepository<PeriodicTable, Long> {}
