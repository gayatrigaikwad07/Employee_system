package EmployeeSystem.EmployeeSystem.Repositary;

import EmployeeSystem.EmployeeSystem.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
