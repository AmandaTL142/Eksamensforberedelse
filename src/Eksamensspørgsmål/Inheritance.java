package Eksamensspørgsmål;

abstract class Animal {
    private String name;
    private int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sound(){
    }
}

class Dog extends Animal{
private String race;

    Dog(String name, int age, String race) {
        super(name, age);
        this.race = race;
    }

}
