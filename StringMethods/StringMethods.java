package StringMethods;

public class StringMethods {
    public static void main(String[] args) {
        String str = "This is a new String";
        
        String s = new String("Hello");
        System.out.println(str.equals(s));

        //use the length() method
        System.out.println(str.length());

        //use the indexOf()method
        System.out.println(str.indexOf("H"));

        //used the toUpperCase() method
        System.out.println(str.toUpperCase());

        //used the toLowerCase()method
        System.out.println(str.toLowerCase());

        //used the charAt(int index)method
        System.out.println(str.charAt(5));

        //used to test if another String is equivalent regardless of capitalization
        System.out.println(str.equalsIgnoreCase("THiS Is A nEW STRinG"));

        //substring returns a smaller sction of the original String starting at the specified index
        System.out.println(str.substring(4));
    }
}