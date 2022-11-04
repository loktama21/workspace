public class AnimalClient {
    public static void main(String[] args) {
//        Animal animal0 = new Animal("Jacky", 8);
//        Animal animal1 = new Dog("Toby", 5, "chihuahua");
//        Dog dog = new Dog("Lulu", 2, "Dashund");

//        System.out.println(animal0);
//        System.out.println(String.valueOf(animal1));
//        System.out.println(dog);

//        animal0.eat();
//        animal1.eat();
//        dog.eat();
//        dog.bark();

        SmallDog smallDog1 = new SmallDog("Lok", 5, "ABC", "XYZ");
        System.out.println(smallDog1);

        smallDog1.eat();
        smallDog1.bark();

    }
}
