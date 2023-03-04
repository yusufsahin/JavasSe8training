public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("string sb: " + sb);
        sb.append(" world");
        System.out.println("string sb: " + sb);

        sb.append("!").append(" are").append(" you?");
        System.out.println("string sb: " + sb);

        sb.insert(12, " How");
        System.out.println("string sb: " + sb);

        // Get length
        System.out.println("Length: " + sb.length());
        // Get SubString
        System.out.println("Sub: " + sb.substring(0, 5));


        /*
        char letter = 'a';
        String string1 = "Hello";
        String string2 = "World";
        String string3 = "";
        String dontDoThis = new String ("Bad Practice");
        string3 = string1 + string2; // Concatenate strings
        System.out.println("Output: " + string3 + " " + letter);
        */

    }
}