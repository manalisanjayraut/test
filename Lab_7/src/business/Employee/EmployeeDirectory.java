/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Employee;

import business.Doctor.DoctorDirectorty;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
    private DoctorDirectorty docDirectory;
    
    

    public DoctorDirectorty getDocDirectory() {
        return docDirectory;
    }

    public void setDocDirectory(DoctorDirectorty docDirectory) {
        this.docDirectory = docDirectory;
    }

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
        docDirectory = new DoctorDirectorty();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    
}