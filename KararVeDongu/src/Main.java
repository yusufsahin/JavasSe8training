import java.util.Scanner;


class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
class  Fish extends Animal{}
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Dog(), new Cat(),new Fish()};
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("Bu bir köpektir.");
            } else if (animal instanceof Cat) {
                System.out.println("Bu bir kedidir.");
            } else {
                System.out.println("Bu bir hayvandır.");
            }
        }


       /* int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
        for (int i = 0; i <numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
       /* Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("Bir sayı giriniz (0 girerek çıkabilirsiniz): ");
            num = input.nextInt();
            System.out.println("Girilen sayı: " + num);
        } while (num != 0);
*/
       /* Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int factorial = 1;
        while (number > 0) {
            factorial *= number;
            number--;
        }
        System.out.println("Faktöriyel: " + factorial);
*/
/*
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }*/
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Bir gün numarası giriniz: ");
        int day = input.nextInt();
        String dayName;
        switch (day) {
            case 1:
                dayName = "Pazartesi";
                break;
            case 2:
                dayName = "Salı";
                break;
            case 3:
                dayName = "Çarşamba";
                break;
            case 4:
                dayName = "Perşembe";
                break;
            case 5:
                dayName = "Cuma";
                break;
            case 6:
                dayName = "Cumartesi";
                break;
            case 7:
                dayName = "Pazar";
                break;
            default:
                dayName = "Geçersiz Gün Numarası";
                break;
        }
        System.out.println(dayName);

*/


        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("Pozitif Sayı");
        } else {
            System.out.println("Negatif Sayı");
        }*/
    }
}
/*
import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int factorial = 1;
        while (number > 0) {
            factorial *= number;
            number--;
        }
        System.out.println("Faktöriyel: " + factorial);
    }
}

* */