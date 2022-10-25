package PizzaHouse;

public class MyPizzaHouse {
    public static void main(String[] args) {

    }

    private void prepare(){
        System.out.println("preparing pizza .... ");
    }

    private void addToppings(){
        System.out.println("Adding toppings .... ");
    }
    private void bake(){
        System.out.println("Baking pizza ..... ");
    }

    public void makepizza(){
        prepare();
        addToppings();
        bake();
    }
}
