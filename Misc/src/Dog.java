public class Dog extends Animal{
    String breed;

    public Dog(String breed) {
        setBreed(breed);
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void eat(){
        System.out.println(this.name + " loves eating pizza.");
    }

    public void bark(){
        System.out.println(this.name + " loves barking to big dogs.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                super.toString();
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}
