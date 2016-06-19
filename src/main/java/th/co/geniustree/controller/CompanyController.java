/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import th.co.geniustree.domain.Department;
import th.co.geniustree.domain.Employee;

/**
 *
 * @author neng
 */
public class CompanyController {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("company");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        Department hr = new Department();
//        hr.setDeptName("Human Resource");
//
//        Department developement = new Department();
//        developement.setDeptName("Developement");
//
//        Employee papper = new Employee();
//        papper.setEmpName("Paper Pott");
//        papper.setSalary(100000.00D);
//        papper.setDepartment(hr);
//
//        Employee tony = new Employee();
//        tony.setEmpName("Tony Stark");
//        tony.setSalary(10000000.00D);
//        tony.setDepartment(developement);
//
//        Employee happy = new Employee();
//        happy.setEmpName("Happy");
//        happy.setSalary(50000D);
//        happy.setDepartment(hr);
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(hr);
//        entityManager.persist(developement);
//        entityManager.persist(tony);
//        entityManager.persist(papper);
//        entityManager.persist(happy);
//        entityManager.getTransaction().commit();
        
//        Employee employee = entityManager.find(Employee.class, 3);
//        System.out.println(employee);
        
//        Employee tony = entityManager.find(Employee.class, 3);
//        tony.setEmpName("Antony Edward Stark");
//        
//        entityManager.getTransaction().begin();
//        entityManager.persist(tony);
//        entityManager.getTransaction().commit();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e where e.department.deptId = 1", Employee.class);
        List<Employee> employees = query.getResultList();
        
        if(employees != null) {
            for(Employee emp: employees) {
                System.out.println(emp.toString());
            }
        }
//        entityManager.getTransaction().begin();
//        entityManager.remove(employee);
//        entityManager.getTransaction().commit();
    }
}
