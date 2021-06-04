package Comparable;
/*
Create a class called Person
Each person has the following attributes: Name, height, age.
Implement the comparable interface, with a natural ordering such that:
•An older person is sorted higher in the natural ordering
•If two persons are the same age, the taller person is sorted higher in the natural ordering

Create a list of persons
Print them from lowest to highest in the natural ordering
 */


import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person>{
    String name;
    int height;
    int age;

    //Constructor
    public Person(String name, int height, int age){
        this.name = name;
        this.height = height;
        this.age = age;
    }


    @Override
    public int compareTo(Person other) {
        if(age != other.age){
            return age - other.age;
        } else {
            return height - other.height;
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> workplace = new ArrayList<>();
        Person p1 = new Person("William",192,23);
        Person p2 = new Person("Sarah",170,27);
        Person p3 = new Person("Karen",170,41);
        Person p4 = new Person("Draco",163,23);

        workplace.add(p1);
        workplace.add(p2);
        workplace.add(p3);
        workplace.add(p4);

        System.out.println("Før sortering: " + workplace);
        Collections.sort(workplace);
        Collections.reverse(workplace);
        System.out.println("Efter sortering: " + workplace);
    }

    @Override
    public String toString() {
        return name;
    }
}
