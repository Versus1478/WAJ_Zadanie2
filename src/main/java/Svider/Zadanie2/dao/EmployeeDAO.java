package Svider.Zadanie2.dao;

import Svider.Zadanie2.entity.Employee;
import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
