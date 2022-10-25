import java.util.EnumSet;

enum MyFamily {
    LOK, ACHALA, RAJAN, MIRA
}

class Main{
    public static void main(String[] args) {

        for(MyFamily family: MyFamily.values()){
            System.out.println(family);
        }

        System.out.println();

        for(MyFamily family : EnumSet.range(MyFamily.RAJAN, MyFamily.MIRA)){
            System.out.println(family);
        }
    }
}
