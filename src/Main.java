public class Main {
    public static void main(String[] args) {
        /*
        Zvire k = new KotlarSecurity();
        Zvire p = new Pes();
        k.info();
        p.info();
         */

        Zvire[] arr = {new Kocka(), new KotlarSecurity()};

        for (Zvire z : arr) {
            z.info();
        }

    }
}