package Ex1;

public class ComputerUsingIntPrimitives {

    public static int numberOfTimesXyzMethodIsInvoked;

    public static int add (int x, int y){
        getNumberOfTimesXyzMethodIsInvoked();
        return x + y;
    }

    public static int getNumberOfTimesXyzMethodIsInvoked() {
        return numberOfTimesXyzMethodIsInvoked++;
    }
}
