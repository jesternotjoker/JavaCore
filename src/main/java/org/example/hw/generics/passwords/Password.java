package org.example.hw.generics.passwords;

public abstract class Password {
    String passw;

    public Password(String passw) {
        this.passw = passw;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public abstract boolean check();
}
