package basic;

public class SimpleCache {

    private String message;

    public void add (String message)
    {
        this.message=message;
    }

    public  String  get()
    {
        return this.message;
    }
}
