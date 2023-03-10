public class Main {
    public static void main(String[] args) {
        try
        {
            int result=10/0;//Aritmetik hata
        }catch (ArithmeticException e)
        {
            System.out.println("An error occured: "+e.getMessage());
        }
        finally {
            System.out.println("Program completed.");
        }
    }
}