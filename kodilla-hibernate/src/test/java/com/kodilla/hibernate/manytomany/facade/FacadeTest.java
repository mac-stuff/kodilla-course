package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FacadeTest {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private Facade facade;

    @Test
    void testShouldReturnCompanyByCharacters() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMasters);
        int dataMastersId = dataMasters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> companies = facade.searchCompanyByCharacters("Data Masters");

        //Then
        assertEquals(1, companies.size());

        //CleanUp
         companyDao.deleteById(softwareMachineId);
         companyDao.deleteById(dataMastersId);
         companyDao.deleteById(greyMatterId);
    }

    @Test
    void testShouldReturnEmployeeByCharacters() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clark");
        Employee lindaSmith = new Employee("Linda", "Smith");

        employeeDao.save(johnSmith);
        int jsId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int scId = stephanieClarckson.getId();
        employeeDao.save(lindaSmith);
        int lkId = lindaSmith.getId();

        //When
        List<Employee> employees = facade.searchEmployeeByCharacters("Smith");

        //Then
        assertEquals(2, employees.size());

        //CleanUp
        employeeDao.deleteById(jsId);
        employeeDao.deleteById(scId);
        employeeDao.deleteById(lkId);
    }
}
