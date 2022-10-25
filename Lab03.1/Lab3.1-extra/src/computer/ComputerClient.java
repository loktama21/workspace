package computer;

import java.sql.SQLOutput;

class ComputerClient {
    public static void main(String[] args) {
        /*ComputerUsingIntPrimitives computerUsingInt = new ComputerUsingIntPrimitives();
        computerUsingInt.add(100, 10);
        computerUsingInt.subtract(300, 30);
        computerUsingInt.multiply(25, 25);
        computerUsingInt.divide(2500, 25);

        ComputerUsingLongPrimitives computerUsingLong = new ComputerUsingLongPrimitives();
        long longSum = computerUsingLong.add(100L, 15L);
        System.out.println("Sum: " + longSum);
        long longSubtract = computerUsingLong.subtract(300L, 100L);
        System.out.println("Subtract: " + longSubtract);*/

        //Exercise 3 -
        ComputerUsingOverloadedMethods computerUsingOverloaded = new ComputerUsingOverloadedMethods();
        int addInt = computerUsingOverloaded.add(10, 20);
        long addLong = computerUsingOverloaded.add(10L, 20L);
        int subtractInt = computerUsingOverloaded.subtract(30, 20);
        long subtractLong = computerUsingOverloaded.subtract(30L, 20L);
        System.out.println("Add integers: " + addInt);
        System.out.println("Add long: " + addLong);
        System.out.println("Subtract integers: " + subtractInt);
        System.out.println("Subtract long: " + subtractLong);
    }
}
