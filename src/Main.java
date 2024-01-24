import Models.Employee;
import Models.Person;
import Models.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Person e1 = new Employee("Jack", "Rojers", "Developer", 5420);
        Person e2 = new Employee("Mark", "Markov", "Manager", 4200);
        Person e3 = new Employee("Walter", "White", "Chemist", 1150000);
        Person e4 = new Employee("Jack", "Sparrow", "Pirate", 163450);
        Person e5 = new Employee("Neil", "Armstrong", "Astronaut", 360500);

        Person s1 = new Student("Jessie", "Pinkman", 2.81);
        Person s2 = new Student("Mikey", "Mouse", 2.17);
        Person s3 = new Student("Sponge", "Bob", 2.02);
        Person s4 = new Student("Patrick", "Star", 3.14);
        Person s5 = new Student("Jackie", "Chan", 3.83);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(e1);
        persons.add(e2);
        persons.add(e3);
        persons.add(e4);
        persons.add(e5);
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s4);
        persons.add(s5);

        Collections.sort(persons);
        print(persons);
    }

    static void print(Iterable<Person> persons){

        for (Person person : persons){
            System.out.println(person.printData());
        }
    }
}