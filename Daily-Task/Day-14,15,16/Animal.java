public class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog sounds Woof!");
    }
}
   class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Cat sounds Meow!");
    }
}
    class Cow extends Animal{
    @Override
    void makeSound() {
        System.out.println("Cow sounds Moo!");
    }
}


    class AnimalSound {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myCow = new Cow();

        myDog.makeSound();
        myCat.makeSound();
        myCow.makeSound();
    }
}
