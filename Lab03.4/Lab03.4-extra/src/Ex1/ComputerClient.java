package Ex1;

public class ComputerClient {
    public static void main(String[] args) {
        ComputerUsingIntPrimitives comp = new ComputerUsingIntPrimitives();

        ComputerUsingIntPrimitives.add(100, 10);
        ComputerUsingIntPrimitives.add(100, 10);

//        int sum1 = comp.add(100, 10);
//        System.out.println(comp.numberOfTimesXyzMethodIsInvoked + " " + sum1);
//
//        int sum2 = comp.add(100, 20);
//        System.out.println(ComputerUsingIntPrimitives.numberOfTimesXyzMethodIsInvoked + " " + sum2);
//
//        int sum3 = comp.add(100, 30);
//        System.out.println(ComputerUsingIntPrimitives.getNumberOfTimesXyzMethodIsInvoked() + " " + sum3);
        System.out.println(ComputerUsingIntPrimitives.getNumberOfTimesXyzMethodIsInvoked());
    }
}
