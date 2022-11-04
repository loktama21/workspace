public class SmallDog extends Dog{

    String smallBreed;

    public SmallDog(String breed, String smallBreed) {
        super(breed);
        this.smallBreed = smallBreed;
    }

    public SmallDog(String name, int age, String breed, String smallBreed) {
        super(name, age, breed);
        this.smallBreed = smallBreed;
    }
    @Override
    public void eat(){
        System.out.println(this.smallBreed + " loves to eat different food.");
    }

//    public void bark(){
//        System.out.println("I am a small breed barking .....");
//    }

    public String getSmallBreed() {
        return smallBreed;
    }

    public void setSmallBreed(String smallBreed) {
        this.smallBreed = smallBreed;
    }

    @Override
    public String toString() {
        return "SmallDog{" +
                "smallBreed='" + smallBreed + '\'' +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
