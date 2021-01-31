package com.kodilla.patterns2.adapter.company;

import static org.junit.jupiter.api.Assertions.*;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryAdapterTest {

    @Test
    public void testTotalSalary() {
        // Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();

        // When
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());

        // Then
        System.out.println(totalSalary);
        assertEquals(totalSalary, 27750, 0);
    }
}