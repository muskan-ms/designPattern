package org.example.factoryPattern;

public class DeveloperClient {

    public static void main(String[] args) {

        final Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        assert employee != null;
        p(employee.salary());
    }

    public static void p(Object o){
        System.out.println(o.toString());
    }
}
