class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

class Bird extends Animal {
    String featherColor;

    Bird(String name, int age, String featherColor) {
        super(name, age);
        this.featherColor = featherColor;
    }

    void display() {
        super.display();
        System.out.println("Feather color: " + featherColor);
    }

    void fly() {
        System.out.println(name + " is flying!");
    }
}

class Fish extends Animal {
    String scaleType;

    Fish(String name, int age, String scaleType) {
        super(name, age);
        this.scaleType = scaleType;
    }

    void display() {
        super.display();
        System.out.println("Scale type: " + scaleType);
    }

    void swim() {
        System.out.println(name + " is swimming!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Bird bird = new Bird("Parrot", 2, "Green");
        Fish fish = new Fish("Goldfish", 1, "Smooth");

        System.out.println("Bird details:");
        bird.display();
        bird.fly();

        System.out.println("\nFish details:");
        fish.display();
        fish.swim();
    }
}
