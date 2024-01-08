package org.example;

public class Main {
    public static void main(String[] args) {
        ListEmployee list = new ListEmployee("MyList");

        list.addEmployee(new Employee("Иван", "9230860569", 10));
        list.addEmployee(new Employee("Пётр", "9052360178", 12));
        list.addEmployee(new Employee("Николай", "9043965895", 3));
        list.addEmployee(new Employee("Игорь", "9234670965", 9));
        list.addEmployee(new Employee("Катерина", "9235980148", 8));

        System.out.println(list.findEmployeesByWorkExperience(8));
        System.out.println(list.findEmployeeByID("1002"));
        System.out.println(list.findEmployeesPhoneNumberByName("Николай"));
    }
}