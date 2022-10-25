public class WrapperExample {
    public static int convertStringToIntPrimitive(String toBeConvertedString){
        return Integer.parseInt(toBeConvertedString);
    }
    public static int convertStringToIntegerObject(String toBeConvertedString){
        return Integer.valueOf(toBeConvertedString);
    }
}

class Main1 {
    public static void main(String[] args) {
        int intP = WrapperExample.convertStringToIntPrimitive("45");
        System.out.println(intP);

        Integer intObj = WrapperExample.convertStringToIntegerObject("60");
        System.out.println(intObj);
    }
}