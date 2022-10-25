public class TelevisionValidationTest {
    public static void main(String[] args) {
        //validating the volume
        Television tv = new Television();
        tv.setVolume(0);
        tv.setBrand("Samsung");
        System.out.println(tv);

        tv.setVolume(-1);
        tv.setBrand("LG");
        System.out.println(tv);

        tv.setVolume(90);
        tv.setBrand("INVALID");
        System.out.println(tv);

    }
}
