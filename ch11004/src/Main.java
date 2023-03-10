public class Main {
    public static void main(String[] args) {
       MyClass obj=new MyClass();

       obj.myMethod(-5);
    }
}
/*
javac Main.java
java -ea MyClass
java -ea Main
Exception in thread "main" java.lang.AssertionError: x must be positive
        at MyClass.myMethod(MyClass.java:5)
        at Main.main(Main.java:5


 */