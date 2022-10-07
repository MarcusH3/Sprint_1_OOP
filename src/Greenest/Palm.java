package Greenest;

import javax.swing.*;

public class Palm extends Växter implements HotellMetoder{  //Här förekommer polymorfislm. Palm växt tillika palm.

    protected Näring näring = Näring.KRANVATTEN;

    public Näring getNäring(){return näring; }

    public void setNäring (Näring n) {näring = n;}

    public Palm(String namn, double Växtlängd){
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
        double NäringsmängdKranvatten = 0.5 * getVäxtLängd();
        JOptionPane.showMessageDialog(null, " Palmen " + this.getNamn() +
                " behöver " + NäringsmängdKranvatten + (" l" ) + getNäring().näringsTyp + " per dag ") ;

    }
}

