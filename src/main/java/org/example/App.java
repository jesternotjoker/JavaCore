package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        String name1 = "Tom";
        String name2 = "Tom";
        String name3 = new String("Tom");


        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
