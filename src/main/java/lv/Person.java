package lv;

public class Person {
    private String name;
    private int age;


    public Person(String name) {
        this.name = name;
        this.age = 0;
        
    }
    public void printPerson(){
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    } 
}
