import java.lang.*;

class StringPractice{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";
        String str4 = new String("hello");

        // Comparing strings using equals() method
        System.out.println("Comparing str1 and str2: " + str1.equals(str2)); // false
        System.out.println("Comparing str1 and str3: " + str1.equals(str3)); // true

        // Comparing strings using == operator
        System.out.println("Comparing str1 and str2 with ==: " + (str1 == str2)); // false
        System.out.println("Comparing str1 and str3 with ==: " + (str1 == str3)); // true (because of string interning)

        //ignoring case while comparing strings
        System.out.println("Comparing str1 and str4 with equalsIgnoreCase: " + str1.equalsIgnoreCase(str4)); // true

        // Concatenating strings
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatenated); // Hello World

        // Using String methods
        System.out.println("Length of concatenated string: " + concatenated.length()); // 11
        System.out.println("Substring of concatenated string: " + concatenated.substring(0, 5)); // Hello
        
        // finds the string length and prints the last character
        String str5 = "Java Programming";
        int length = str5.length();
        char lastChar = str5.charAt(length - 1);
        System.out.println("Last character of str5: " + lastChar); // g

        // using indexOf to find the position of a character and lastIndexOf to find the last occurrence of a character
        String str6 = "Hello World";
        int position = str6.indexOf('o');
        int lastPosition = str6.lastIndexOf('o');
        System.out.println("First occurrence of 'o' in str6: " + position); // 4
        System.out.println("Last occurrence of 'o' in str6: " + lastPosition); // 7

        //string method contains
        System.out.println("Does str6 contain 'World'? " + str6.contains("World")); // true
        System.out.println("Does str6 contain 'Java'? " + str6.contains("Java")); // false

        //string concatenation using concat() method
        String str7 = "Java";   
        String str8 = " Programming";
        String concatenatedStr = str7.concat(str8);
        System.out.println("Concatenated string using concat(): " + concatenatedStr); // Java Programming

        //without concatenation, we can also use + operator to concatenate strings
        String concatenatedStr2 = str7 + str8;
        System.out.println("Concatenated string using + operator: " + concatenatedStr2); // Java Programming

        //string matches method to check if a string matches a regular expression
        String str9 = "abc123";
        boolean matches1 = str9.matches("[a-z]+\\d+");
        boolean matches2 = str9.matches("[A-Z]+\\d+");
        boolean matches3 = str9.matches("[a-zA-Z]+\\d+");
        boolean matches4 = str9.matches("[a-z]{3}");

        System.out.println("Does str9 match [A-Z]+\\d+? " + matches2); // false

        System.out.println("Does str9 match [a-z]+\\d+? " + matches1); // true
        System.out.println("Does str9 match [a-zA-Z]+\\d+? " + matches3); // true
        System.out.println("Does str9 match [a-z]{3}? " + matches4); // false

        //email validation using matches method
        String email = "checkingexample@gmail.com";

        boolean isValid1 = email.matches(".*gmail.*");
        boolean isValid2 = email.matches("\\w*gmail(.*)"); // This regex checks if the email starts with any word characters followed by "gmail" and then any characters after that
        System.out.println("Is the email valid1? " + isValid1); // true
        System.out.println("Is the email valid2? " + isValid2); // true

    
    }
}