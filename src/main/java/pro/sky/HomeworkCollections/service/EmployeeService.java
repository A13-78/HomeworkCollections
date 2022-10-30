package pro.sky.HomeworkCollections.service;

import pro.sky.HomeworkCollections.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> printAll();
    public boolean completeCollection();
    public boolean remove(String name, String surname);
    public Employee search(String name, String surname);
    public boolean add(String name, String surname);


}
