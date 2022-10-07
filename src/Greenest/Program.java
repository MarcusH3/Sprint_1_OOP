package Greenest;

import javax.swing.*;

public class Program {

    public Program (){
        JOptionPane.showMessageDialog(null, "Välkommen till växthotellet Greenest, tryck på escape eller cancel för att avsluta");
        String hotellVäxt = växtVal();  // Sparar växt som variabel
        while (!hotellVäxt.equalsIgnoreCase("quit")) {
            printNäringsMängd(hotellVäxt);  // skriver ut hur myket näring växt ska ha
            hotellVäxt = växtVal();
        }
    }
    private static void printNäringsMängd(String name) {
        Kaktus Igge = new Kaktus("Igge", 0.20);
        KöttätandeVäxt meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Palm laura = new Palm("Laura", 5);
        Palm putte = new Palm("Putte", 1);
        if (name.equalsIgnoreCase(Igge.getNamn())) {
            Igge.näringsMängd();
        } else if (name.equalsIgnoreCase(laura.getNamn())) {
            laura.näringsMängd();
        } else if (name.equalsIgnoreCase(putte.getNamn())) {
            putte.näringsMängd();
        } else if (name.equalsIgnoreCase(meatloaf.getNamn())) {
            meatloaf.näringsMängd();
        } else {
            JOptionPane.showMessageDialog(null, "Det finns ingen växt  vid det namnet på hotellet," +
                    " nuvarande växter är: \nLaura" +
                    "\nPutte" +
                    "\nMeatloaf" +
                    "\nIgge");
        }
    }

    private static String växtVal() {
        try {
            String name = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (name.length() > 0 && !name.isBlank()) {
                return name;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Du tryckte på cancel. Programmet avslutas");
            return "quit";
        }
        return "";
    }
}



