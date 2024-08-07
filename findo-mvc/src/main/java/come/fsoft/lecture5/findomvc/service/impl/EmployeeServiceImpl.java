package come.fsoft.lecture5.findomvc.service.impl;

import come.fsoft.lecture5.findomvc.model.Employee;
import come.fsoft.lecture5.findomvc.repository.EmployeeRepository;
import come.fsoft.lecture5.findomvc.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Employee findById(int theId) {
        return employeeRepository.findById(theId).orElseThrow();
    }

    @Override
    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }

}
