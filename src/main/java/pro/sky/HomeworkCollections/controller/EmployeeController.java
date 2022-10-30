package pro.sky.HomeworkCollections.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HomeworkCollections.model.Employee;
import pro.sky.HomeworkCollections.service.EmployeeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee")

public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping
    public String welcome() {
        return "<mark><b>Добро пожаловать.</b></mark>";
    }

    @GetMapping("/printAll")
    public List<Employee> printAll() {
        return employeeService.printAll();
    }

    @GetMapping("/completeCollection")
    public boolean completeCollection() {
        return employeeService.completeCollection();
    }

    @GetMapping("/remove")
    public boolean remove(@RequestParam String name,
                          @RequestParam String surname) {
        return employeeService.remove(name, surname);
    }

    @GetMapping("/search")
    public Employee search(@RequestParam String name,
                           @RequestParam String surname) {
        return employeeService.search(name, surname);
    }

    @GetMapping("/add")
    public boolean add(@RequestParam String name,
                       @RequestParam String surname) {
        return employeeService.add(name, surname);
    }

    
}
