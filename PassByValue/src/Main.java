public class Main {
    public static void main(String[] args) {
       String s1="abc";

       String s2=changeString(s1);

       System.out.println(s2);
        int k=5;
       changeNumber2(k);
       System.out.println(k);
        /* StringBuilder name = new StringBuilder("Ali");
        System.out.println("Önce: " + name);
        changeName(name);
        System.out.println("Sonra: " + name);
*/

        /*  int number = 10;
        System.out.println("Önce: " + number);
        changeNumber(number);
        System.out.println("Sonra: " + number);


        /*int x = 3;
       */
       /*
        int y = x;
        x = 5;
        System.out.println("x = " + x); // Çıktı: x = 5
        System.out.println("y = " + y); // Çıktı: y = 3*/


    }

    public static String changeString(String a)
    {
        return a+"test";
    }
    public static void changeName(StringBuilder n) {
        n.append(" Can");
    }
    public static void changeNumber(int num) {
        num = 20;
    }

    public static  void  changeNumber2(int num)
    {
         num=num+2;

    }
}