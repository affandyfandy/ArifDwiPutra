package come.fsoft.lecture5.findomvc.service;

import come.fsoft.lecture5.findomvc.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);
}
