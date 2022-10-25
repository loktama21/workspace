package computer;

class ComputerClient {
    public static void main(String[] args) {
        ComputerUsingIntPrimitives computerUsingInt = new ComputerUsingIntPrimitives();
        computerUsingInt.add(100, 10);
        computerUsingInt.subtract(300, 30);
        computerUsingInt.multiply(25, 25);
        computerUsingInt.divide(2500, 25);

        ComputerUsingLongPrimitives computerUsingLong = new ComputerUsingLongPrimitives();
        long longSum = computerUsingLong.add(100L, 15L);
        System.out.println("Sum: " + longSum);
        long longSubtract = computerUsingLong.subtract(300L, 100L);
        System.out.println("Subtract: " + longSubtract);
    }
}
