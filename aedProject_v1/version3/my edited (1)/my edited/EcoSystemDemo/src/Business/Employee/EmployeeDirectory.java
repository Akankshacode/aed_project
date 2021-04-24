/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name,String Phone, String Email, String Address){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setAddress(Address);
        employee.setEmail(Email);
        employee.setPhone(Phone);
           employee.setFlag(true);
        employeeList.add(employee);
        
        return employee;
    }
    public Boolean findEmployee(String Name)
    {
        for(Employee emp:employeeList)
        {
            if(Name.equals(emp.getName()))
                return true;
        }
    return false;
    }
    
       public void deleteEmployee(Employee employee){
              employeeList.remove(employee);
    }
}