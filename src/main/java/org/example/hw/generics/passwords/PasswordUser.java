package org.example.hw.generics.passwords;

public class PasswordUser extends Password {

    public PasswordUser(String passw) {
        super(passw);
    }

    @Override
    public String toString() {
        return "PasswordUser{" +
                "passw='" + passw + '\'' +
                '}';
    }

    @Override
    public boolean check() {
        return this.passw.length() > 10 && this.passw.length() <= 33;
    }
}
