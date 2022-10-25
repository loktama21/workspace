package computer;

class ComputerUsingIntPrimitives {

    int firstNum;
    int secondNum;

    int add (int x, int y){
        System.out.println("Sum: " + (x + y));
        return x + y;
    }

    int subtract(int x, int y){
        System.out.println("Subtract: " + (x - y));
    return x - y;
    }

    int multiply(int x, int y){
        System.out.println("Multiply: " + x * y);
        return x * y;
    }

    int divide(int x, int y){
        System.out.println("Divide: " + x / y + "\n");
        return x / y;
    }
}
