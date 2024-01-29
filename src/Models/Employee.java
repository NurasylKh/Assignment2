package Models;

public class Employee extends Person{ //declaring class // Employee is a subclass of Person
    String position;
    double salary;
    public Employee(){ //creating constructor
        super(); // calling superclass s constructor
        position = "Position";
        salary = 0;
    }
    public Employee(String name, String surname, String position, double salary){ // creating constructor that takes 3 arguments
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public int getId() { // getter method
        return super.getId();
    }

    @Override
    public String getName(){ // getter method
        return super.getName();
    }

    @Override
    public String getSurname() { // getter method
        return super.getSurname();
    }

    public String getPosition() { //getter method
        return position;
    }

    public double getSalary(){ //getter method
        return salary;
    }

    @Override
    public void setName(String name) { //setter method
        super.setName(name);
    }

    @Override
    public void setSurname(String surname) { //setter method
        super.setSurname(surname);
    }

    public void setPosition(String position) { //setter method
        this.position = position;
    }

    public void setSalary(double salary) { //setter method
        this.salary = salary;
    }

    @Override
    public String toString() { //representaion of object as String
        return "Employee: " + super.toString();
    }

    @Override
    public double getPaymentAmount() { //getter method
        return salary;
    }

    @Override
    public int compareTo(Person person) { // it goes through a collection of persons and compares two values
        if(salary == person.getPaymentAmount()) return 0;
        else if(salary > person.getPaymentAmount()) return 1;
        else return -1;
    }
}
