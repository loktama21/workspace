// Exercise 2
public class MyOwnPrintLn {

    public void myOwnPrintLn(String x){
        System.out.println(x);
    }

    public void myOwnPrintLn(int x){
        System.out.println(x);
    }

    public void myOwnPrintLn(double x){
        System.out.println(x);
    }

}

class Main{
    public static void main(String[] args) {
        MyOwnPrintLn myOwnPrint = new MyOwnPrintLn();
        myOwnPrint.myOwnPrintLn("Hello");
        myOwnPrint.myOwnPrintLn(50);
        myOwnPrint.myOwnPrintLn(25.55);
    }
}
