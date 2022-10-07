package Greenest;

import javax.swing.*;

public class KöttätandeVäxt extends Växter implements HotellMetoder{ // Här förekommer polymorfislm. Köttätande växt växt tillika köttätandeväxt.

    protected Näring näring = Näring.PROTEINDRYCK;

    public Näring getNäring(){return näring; }

    public void setNäring (Näring n) {näring = n;}

    public KöttätandeVäxt(String namn, double Växtlängd){
            super(namn, Växtlängd);
        }
        @Override
        public String getNamn() {
            return super.getNamn();
        }

        @Override
        public double getVäxtLängd() {
            return super.getVäxtLängd();
        }

        @Override
        public void näringsMängd() {
            double NäringsmängdProteinDryck = 0.1 +  (getVäxtLängd() * 0.2);
            JOptionPane.showMessageDialog(null, " Köttätande växten " + this.getNamn() + "behöver" + NäringsmängdProteinDryck + " cl " + getNäring().näringsTyp + " per dag ") ;

        }
    }



