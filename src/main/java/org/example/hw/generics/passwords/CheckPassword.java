package org.example.hw.generics.passwords;

public class CheckPassword {

    public <T> void verify(T passwprd){
        if (passwprd instanceof PasswordUser || passwprd instanceof PasswordAdmin){
            if (passwprd instanceof PasswordUser && ((PasswordUser) passwprd).check()) System.out.println("Вы прошли проверку пароля");
            else if (passwprd instanceof PasswordAdmin && ((PasswordAdmin) passwprd).check()) System.out.println("Вы прошли проверку пароля");
            else System.out.println("Вы не прошли проверку пароля");
        }

    }

}
