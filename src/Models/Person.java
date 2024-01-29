package Models;

import interfaces.Payable;

public abstract class Person implements Payable, Comparable<Person>{ //declaring abstact class
    static int idCounter = 1;
    int id;
    String name, surname;

    public Person(){ // creating default constructor
        id = idCounter++;
        name = "Name";
        surname = "Surname";
    }
    public Person(String name, String surname){ // creating constructor that takes 2 arguments
        id = idCounter++;
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) { //setter method
        this.name = name;
    }
    public void setSurname(String surname){ // setter method
        this.surname = surname;
    }
    public int getId(){ //getter method
        return id;
    }
    public String getName(){ //setter method
        return name;
    }
    public String getSurname(){ //getter method
        return surname;
    }

    @Override public String toString(){ //representation of objecta as a String
        return id + ". " + name + " " + surname;
    }
    public abstract String getPosition(); //getter method
    public String printData(){ //method that increments
        return toString() + " earns " + getPaymentAmount() + " tenge.";
    }
}
