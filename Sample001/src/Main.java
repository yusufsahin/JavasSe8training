public class Main {
    public static void main(String[] args) {
        String s1 = new String("Test");
        String s2 = new String("Test"); if (s1==s2)
            System.out.println("Same"); if (s1.equals(s2))
            System.out.println("Equals");


        /*int[] nums = {100, 200, 300};

        System.out.println(average(nums));*/
    }
    public static  float average (int[] values) {
        float result = 0;
        for (int i = 1; i < values.length; i++)
            result += values[i]; return (result/values.length);
    }
}