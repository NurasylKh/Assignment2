package Models;

public class Student extends Person { // Student is a subclass of Person
    double gpa;

    public Student(){
        super();
        gpa = 0;
    }
    public Student(String name, String surname, double gpa){ //constructor that takes 3 arguments
        super(name, surname);
        setGpa(gpa);
    }

    @Override
    public String getSurname() { //getter method
        return super.getSurname();
    }

    @Override
    public int getId() { //getter method
        return super.getId();
    }

    @Override
    public String getName() { //getter method
        return super.getName();
    }

    public double getGpa() { //getter method
        return gpa;
    }

    @Override
    public void setName(String name) { //setter method
        super.setName(name);
    }

    @Override
    public void setSurname(String surname) { //setter method
        super.setSurname(surname);
    }

    public void setGpa(double gpa) { //setter method
        this.gpa = gpa;
    }

    @Override
    public String toString() { //representation of object as a String
        return "Student: " + super.toString();
    }

    @Override
    public String getPosition() { //getter method
        return "Student";
    }

    @Override
    public double getPaymentAmount() { //getter method
        return gpa > 2.67 ? 36660.0 : 0;
    }

    @Override public int compareTo(Person person){ //method that goes through a collection of persons and compares two values
        if(getPaymentAmount() == person.getPaymentAmount()) return 0;
        else if (getPaymentAmount() > person.getPaymentAmount()) return 1;
        else return -1;
    }
}
