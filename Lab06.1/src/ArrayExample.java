//Example 1 - Array of Strings
public class ArrayExample {
    String[] myFriends = {"Anil", "Roshan", "Raj"};

    public void convertAndDisplayNamesToUpperCase() {
        for (String myFriend : myFriends) {
            System.out.print(myFriend.toUpperCase() + " ");
        }
    }

    //Example 2 - array of int
//    public static int[] findOddNumbersFromArray(int[] numbers) {
//        int[] newInt;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] != 0) {
//                newInt.append(numbers[i]);
//            }
//        }
//        return newInt;
//    }

    //Example 3 - array of int
    public static int findLargestNumberFromArray(int[] numbers) {
        int largeNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largeNumber) {
                largeNumber = numbers[i];
            }
        }
        return largeNumber;
    }

 //Exercise 4 - varargs
    public static void
    convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs(
            String myName, String... myFriends){
        for(String friend: myFriends){
            System.out.println(friend + " ");
        }
    }

}

