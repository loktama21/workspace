public class ArrayExampleClient {
    public static void main(String[] args) {
        ArrayExample myFriend = new ArrayExample();
        myFriend.convertAndDisplayNamesToUpperCase();

        int[] numbers = {3, 5, 1, 10};
        System.out.println("\n" + ArrayExample.findLargestNumberFromArray(numbers));

        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Lok");
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Lok",  "Rajan", "Mira");
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Lok",  "Rajan", "Mira");
    }
}
