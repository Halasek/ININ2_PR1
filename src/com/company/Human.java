package com.company;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    Car car;

    Human() {
        this.salary = 1200.0;
    }

    void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("Dane zostały wysłane do systemu księgowego");
            System.out.println("Koniecnie odbierz aneks do umowy od pani Hani");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać");
            this.salary = salary;
        }else{
            System.out.println("Wypłata: " + this.salary + "Wypłata nie może być ujemna");

        }
    }

    Double getSalary() {
        Date dateandTime = new Date();
        System.out.println(dateandTime);
        System.out.println("wynagrodzenie: " + this.salary);
        return this.salary;
    }
}
