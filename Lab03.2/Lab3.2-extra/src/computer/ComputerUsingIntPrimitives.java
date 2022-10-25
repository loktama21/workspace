package computer;

public class ComputerUsingIntPrimitives {

    private int firstNum;
    private int secondNum;

    public int add (int x, int y){
        return x + y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public int multiply(int x, int y){
        return x * y;
    }

    public int divide(int x, int y){
        return x / y;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    @Override
    public String toString() {
        return "ComputerUsingIntPrimitives{" +
                "firstNum=" + firstNum +
                ", secondNum=" + secondNum +
                '}';
    }
}
