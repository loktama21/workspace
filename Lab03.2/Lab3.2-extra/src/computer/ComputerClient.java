package computer;

class ComputerClient {
    public static void main(String[] args) {
        ComputerUsingIntPrimitives computerUsingInt = new ComputerUsingIntPrimitives();
        int addResult = computerUsingInt.add(100, 10);
        int subtractResult = computerUsingInt.subtract(300, 30);
        int multiplyResult = computerUsingInt.multiply(25, 25);
        int divideResult = computerUsingInt.divide(2500, 25);

        System.out.println(addResult);
        System.out.println(subtractResult);
        System.out.println(multiplyResult);
        System.out.println(divideResult);
    }
}
