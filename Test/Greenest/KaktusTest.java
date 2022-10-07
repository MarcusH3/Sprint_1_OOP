package Greenest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {

    public Kaktus kaktus = new Kaktus("Igge", 0.2);

    @Test
    public final void getNamn() {
        assert(kaktus.getNamn() == "Igge");
        assert(kaktus.getNamn() != "Kim");
        assert(kaktus.getNamn() == "Tommy");

    }
}
/* Här testas koden för att se att den fungerar. Initialt skapas ett fel medvetet på rad 15 föra tt se
att säkerställa att koden varken endast ger korrekt kod- Därefter ändras koden för att säkerställa att progrmamet
släpper igenom rätt reslutat.*/