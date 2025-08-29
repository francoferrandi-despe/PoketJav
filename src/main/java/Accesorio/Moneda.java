package Accesorio;

import java.util.Random;

public class Moneda {
    private static final Random random = new Random();
    public static boolean lanzar() {
        return random.nextBoolean(); // true = cara, false = seca
    }
}