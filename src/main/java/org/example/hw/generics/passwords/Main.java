package org.example.hw.generics.passwords;

public class Main {
    public static void main(String[] args) {
        CheckPassword chp = new CheckPassword();
        PasswordUser pu = new PasswordUser("23f5g434gbn4bbf65");
        chp.verify(pu);
        pu.setPassw("23f5");
        chp.verify(pu);
        PasswordAdmin pa = new PasswordAdmin("g57fc39k76");
        chp.verify(pa);
        pa.setPassw("g");
        chp.verify(pa);

    }
}