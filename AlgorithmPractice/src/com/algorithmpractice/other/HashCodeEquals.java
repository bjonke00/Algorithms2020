package com.algorithmpractice.other;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEquals {

    static Map<Employee, Integer> employeeIntegerMap = new HashMap();

    public static void main(String []args){
        //ex1
        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee(1);
        employeeIntegerMap.put(emp1, 1);
        employeeIntegerMap.put(emp2, 1);
        System.out.println(employeeIntegerMap.size());

        //ex2
        System.out.println(emp1.equals(emp2));
    }

    public static class Employee{
        int id;

        public Employee(int id){
            this.id = id;
        }

        //ex2 just need equals for just comparing objects with equals, if the employee has same id they are equal
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id;
        }

        //ex1 need hashcode and equals for distinguishing employee hash codes in using hashmap or hashset
        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
