package Greenest;

import javax.swing.*;

public class Kaktus extends Växter implements HotellMetoder { /// Här förekommer polymorfislm. Kaktus växt tillika kaktus.

        protected Näring näring = Näring.MINERALVATTEN;
    public Näring getNäring(){return näring; }

    public void setNäring (Näring n) {näring = n;}


        public Kaktus(String namn, double Växtlängd){
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
            double NäringsmängdMineralvatten = 0.2 ;
            JOptionPane.showMessageDialog(null, " Kaktusen " + this.getNamn() + " behöver " + NäringsmängdMineralvatten + " l " + getNäring().näringsTyp +" per dag ") ;

        }
    }



