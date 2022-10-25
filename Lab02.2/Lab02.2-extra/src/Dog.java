class Dog {
    String name;
    int age = 3;

    void bark() {
        System.out.println(name + " is barking!");
    }

    void eat() {
        System.out.println("He is " + age + " years old. And he likes to eat a lot!");
    }

}

class Main {

    public static void main(String[] args){

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "Lucy";
        dog2.name = "Rocky";
        dog2.age = 5;

        dog1.bark();
        dog1.eat();

        //System.out.println();

        dog2.bark();
        dog2.eat();
    }
}


