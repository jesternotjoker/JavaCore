package org.example.hw.generics.passwords;

public class PasswordAdmin extends Password {
    public PasswordAdmin(String passw) {
        super(passw);
    }

    @Override
    public String toString() {
        return "PasswordAdmin{" +
                "passw='" + passw + '\'' +
                '}';
    }

    @Override
    public boolean check() {
        return this.passw.length() > 3 && this.passw.length() <= 16;
    }
}
