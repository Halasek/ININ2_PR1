package com.company;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    private Car car;

    Human() {
        this.salary = 1200.0;
    }

    void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("Dane zostały wysłane do systemu księgowego");
            System.out.println("Koniecnie odbierz aneks do umowy od pani Hani");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać");
            this.salary = salary;
            System.out.println("nowe wynagrodzenie: " + this.salary);
        } else {
            System.out.println("Chyba Cię pogieło");

        }
    }

    Double getSalary() {
        Date dateandTime = new Date();
        System.out.println(dateandTime);
        System.out.println("wynagrodzenie: " + this.salary);
        return this.salary;
    }
    void setCar(Car newCar){
        if(this.salary > newCar.value){
            this.car = newCar;
            System.out.println("Gratulacje, kupiłeś za gotówkę");
        }else if(this.salary > newCar.value/12){
            this.car = newCar;
            System.out.println("Kupiłes na raty");
        }else {
            System.out.println("Nie ma takiego kupowania!");
            System.out.println("Do roboty!");
            System.out.println("Zmień pracę, weź kredyt!");
        }
    }
    Car getCar() {
        return this.car;
    }
}

