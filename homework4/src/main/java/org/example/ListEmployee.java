package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ListEmployee {
    private String name;
    private List<Employee> employeesList;

    ListEmployee(String name) {
        this.name = name;
        this.employeesList = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        this.employeesList.add(e);
    }

    public Employee findEmployeeByID(String ID){
        for (Employee e : this.employeesList) {
            if (e.getID().equals(ID)) {
                return e;
            }
        }
        return null;
    }

    public List<Employee> findEmployeesByWorkExperience(Integer workExperience){
        List<Employee> result = new ArrayList<>();
        for (Employee e : this.employeesList) {
            if (Objects.equals(e.getWorkExperience(), workExperience)) {
                result.add(e);
            }
        }
        return result;
    }
    public HashMap<String,String> findEmployeesPhoneNumberByName(String name){
        HashMap<String,String> result = new HashMap<>();
        for (Employee e : this.employeesList) {
            if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                result.put("ID"+ e.getID() + e.getName(),e.getPhoneNumber());
            }
        }
        return result;
    }

}
