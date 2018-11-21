package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.entities.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	@PersistenceContext
	private  EntityManager em; 
	

	public Employee save(Employee employee) {

		em.persist(employee);
		em.flush();
		return employee;
	}

	@Override
	public List<Employee> loadAll() {
		// TODO Auto-generated method stub
		
		TypedQuery<Employee> resultList = em.createQuery("SELECT e FROM Employee e", Employee.class); //This is jpa query
		return  resultList.getResultList();
	}

}
