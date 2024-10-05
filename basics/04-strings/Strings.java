public class Strings {
    public static void main(String[] args) {
        
        String txt = "Hello, World!";

        System.out.println("The lenght of the string is: " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        
        System.out.println("Index of 'World' in the string: " + txt.indexOf("World"));
        System.out.println("String contains 'Wolrd': " + txt.contains("World"));
        System.out.println("String ends with '!': " + txt.endsWith("!"));
        
    }    
}
