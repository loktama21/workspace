public class StringMethodsExample1 {
    public static void main(String[] args) {

        String quote1 = "Hello Java!";

        //contains()
        System.out.println("---contains() example ----");
        System.out.println(quote1.contains("llo"));

        //endsWith()
        System.out.println("---endsWith() example ----");
        System.out.println(quote1.endsWith("a!"));

        //equals
        System.out.println("---equals() example ----");
        System.out.println(quote1.equals("Hello J"));

        //equalsIgnoreCase
        System.out.println("---equalsIgnoreCase() example ----");
        System.out.println(quote1.equalsIgnoreCase("hello java!"));

        //indexOf
        System.out.println("---indexOf() example ----");
        System.out.println(quote1.indexOf("J"));

        //length()
        System.out.println("---length() example ----");
        System.out.println(quote1.length());

        //split()
        System.out.println("---Split example ----");
        String[] str = quote1.split("a", 3);
        for (String a : str)
            System.out.println(a);

        //startsWith(
        System.out.println("---startsWith() example ----");
        System.out.println(quote1.startsWith("He"));

        //strip()
        System.out.println("---strip() example ----");
        System.out.println(quote1.strip()); //---

        //substring()
        System.out.println("---subString() example ----");
        System.out.println(quote1.substring(6));

        //toLowerCase()
        System.out.println("---toLowerCase() example ----");
        System.out.println(quote1.toLowerCase());

        //toUpperCase
        System.out.println("---toUpperCase() example ----");
        System.out.println(quote1.toUpperCase());



    }
}
