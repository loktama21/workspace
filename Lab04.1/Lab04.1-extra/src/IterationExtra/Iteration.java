package IterationExtra;

public class Iteration {
    //for loop
    public void displayNumbersUsingForLoop(int start, int end){
        for(start = start; start < end; start++){
            System.out.println(start);
        }
    }

    //while loop
    public void displayNumbersUsingWhile(int start, int end){
        start = start;
        while(start < end){
            System.out.println(start);
            start++;
        }
    }

    //do while loop
    public void displayNumbersUsingDoWhile(int start, int end){
        start = start;
        do{
            System.out.println(start);
            start++;
        } while(start < end);
    }

    //for loop with if
    public void displayEvenNumbersOnlyUsingForLoop(int start, int end){
        for(start = start; start <= end; start++){
            if(start % 2 != 0){
                continue;
            }
            System.out.println(start);
        }
    }
}

class Main{
    public static void main(String[] args) {
        Iteration it = new Iteration();
        //testing for loop
        it.displayNumbersUsingForLoop(2, 7);
        System.out.println();

        //test while loop
        it.displayNumbersUsingWhile(2, 7);
        System.out.println();

        //do-while
        it.displayNumbersUsingDoWhile(2, 7);
        System.out.println();

        //for loop with if
        it.displayEvenNumbersOnlyUsingForLoop(2, 20);

    }
}
