package Ex2;

public class MyNumber {

    public static int computeRandomInt(int start, int end){
        int diff = end - start;
        return ((int) (Math.random() * diff)) + start;
    }
}

class Main{
    public static void main(String[] args) {
        int test = MyNumber.computeRandomInt(3, 5);
        System.out.println(test);
    }
}
