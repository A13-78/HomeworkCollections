package pro.sky.HomeworkCollections.service;

import org.springframework.stereotype.Service;
import pro.sky.HomeworkCollections.exception.EmployeeNotFoundException;
import pro.sky.HomeworkCollections.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> printAll() {
        return employees;
    }

    @Override
    public boolean completeCollection() {
        employees.add(new Employee("Достоевский", "Фёдор"));
        employees.add(new Employee("Толстой", "Лев"));
        employees.add(new Employee("Гоголь", "Николай"));
        employees.add(new Employee("Лермонтов", "Михаил"));
        employees.add(new Employee("Пушкин", "Александр"));
        employees.add(new Employee("Некрасов", "Николай"));
        employees.add(new Employee("Тургенев", "Иван"));
        employees.add(new Employee("Тютчев", "Фёдор"));
        employees.add(new Employee("Чехов", "Антов"));
        employees.add(new Employee("Крылов", "Иван"));
        return true;
    }

    @Override
    public boolean remove(String name, String surname) {
        Employee forRemove = new Employee(name, surname);
        if (employees.remove(forRemove)) {
            return true;
        }
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }

    @Override
    public Employee search(String name, String surname) {
        Employee employeeForSearch = new Employee(name, surname);
        if (employees.contains(employeeForSearch)) {
            return employeeForSearch;
        }
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }

    @Override
    public boolean add(String name, String surname) {
        Employee forRemove = new Employee(name, surname);
        if (employees.contains(forRemove)) {
            throw new EmployeeNotFoundException("Такой сотрудник уже есть!");
        }
        return employees.add(new Employee(name, surname));
    }
}
