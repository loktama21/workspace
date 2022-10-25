import java.util.Arrays;

public class TestClient {
    public static void main(String[] args) {
        String myString = "Life is good";
        char[] myChar = new char[myString.length()];

        for (int i = 0; i < myString.length(); i++) {
            myChar[i] = myString.charAt(i);
        }
        System.out.println(Arrays.toString(myChar));
    }
}

