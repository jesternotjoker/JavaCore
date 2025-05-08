package org.example.oop.oop1;

public interface WritingCode {
    public  static  final  int s = 10;

    void writeCode();


    default void checkingCode(String code) {
        System.out.println(code + " проверяется");
        ss();
    }

    private void ss(){
        System.out.println("ss");
    }
}
