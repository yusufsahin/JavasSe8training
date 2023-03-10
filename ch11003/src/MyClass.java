public class MyClass {

    public  void  myMethod(int x) throws  MyException{
        if(x<0)
        {
            throw  new MyException("x must be positive");
        }
        ///code...
    }
}
