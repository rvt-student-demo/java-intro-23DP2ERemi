package lv.rvt;
public class Person {

    Private String name;
    Private int age;
    Private int weight;
    Private int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }
    public Person(String name) {
        this(name, );
        //here the code of the second constructor is run, and the age is set to 0
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightDivByHundred = this.height / 100.0;
        return this.weight / (heightDivByHundred * heightDivByHundred);
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
   