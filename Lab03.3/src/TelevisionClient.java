public class TelevisionClient {
    public static void main(String[] args) {

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(80);
        tv1.turnOn();
        tv1.turnOff();
        System.out.println(tv1);

        Television tv2 = new Television("LG", 50);
        tv2.turnOn();
        tv2.turnOff();
        System.out.println(tv2);

    }
}
