public class StringAndStringBuilder {
    public String constructMyAddressUsingString(){
        return new String("100 " + " Hartwell Dr");
    }

    public String constructMyAddressUsingStringBuilder(){
        StringBuilder myAddress = new StringBuilder(200);
        return myAddress.append("100 ")
                .append("Hartwell Dr").toString();
    }
}

class Main{
    public static void main(String[] args) {
        StringAndStringBuilder sb = new StringAndStringBuilder();
        String sb1 = sb.constructMyAddressUsingString();
        String sb2 = sb.constructMyAddressUsingStringBuilder();
        System.out.println(sb1);
        System.out.println(sb2);

        boolean test1 = sb1 == sb2;
        boolean test2 = sb1.equals(sb2);
        System.out.println(test1);
        System.out.println(test2);

    }
}
