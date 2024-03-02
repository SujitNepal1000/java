class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void Name() {
        System.out.println("The name of the animal is: " + this.name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void Name() {
        System.out.println("The name of the Cat is: " + this.name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void Name() {
        System.out.println("The name of the Dog is: " + this.name);
    }
}

public class que2 {
    public static void main(String[] args) {
        Animal animal = null;
        animal = new Cat("Kat");
        animal.Name();
        animal = new Dog("scooby");
        animal.Name();
    }
}