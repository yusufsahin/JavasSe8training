import basic.CacheShirt;
import basic.Shirt;
import basic.SimpleCache;

public class Main {
    public static void main(String[] args) {

        SimpleCache simpleCache= new SimpleCache();

        simpleCache.add("AA");
        simpleCache.add("BA");
        simpleCache.add("BB");

        System.out.println(simpleCache.get());

        Shirt shirt= new Shirt("A-Shirt");

        CacheShirt cacheShirt =new CacheShirt();

        cacheShirt.add(shirt);

        System.out.println(cacheShirt.get().getName());
    }
}