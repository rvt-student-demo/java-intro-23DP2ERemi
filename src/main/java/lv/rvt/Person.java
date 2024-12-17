package lv.rvt;



public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age; 
        this.weight = weight; 
        this.height = height; 
    }
    public String toCsvRow(){
        return this.name + ", " + this.age + ", " + this.height + ", " + this.weight ;
    }

    public Person(String name) {
        this(name, 0, 0, 0);
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
        if (this.height == 0) {
            throw new IllegalArgumentException("Height cannot be zero.");
        }
        double heightDivByHundred = this.height / 100.0;
        return this.weight / (heightDivByHundred * heightDivByHundred);
    }

    @Override
    public String toString() {
        return (this.name != null ? this.name : "Unknown") + ", age " + this.age + " years";
    }
}
