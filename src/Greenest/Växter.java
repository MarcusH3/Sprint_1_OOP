package Greenest;

public class Växter {
    private String namn; /* Här sker inkapsling för klassen växter som ärvs ar respektive växt
    eftersom att varje växt ärver denna klass kan även metoderna anropas för respektive växtnamn och växtlängd för att därefter användas vid beräkning av näringsmängd.*/
    private double växtLängd;

    protected Näring näring = Näring.KRANVATTEN;

    public Växter(String namn, double växtLängd){
        if(!namn.isEmpty()&& växtLängd>0) {
            this.namn = namn;
            this.växtLängd = växtLängd;
        } else{
            System.out.println("Felaktig inmatning");
        }
    }
    public String getNamn(){
        return namn;
    }
    public double getVäxtLängd(){
        return växtLängd;
    }

    public Näring getNäring() {
        return näring;
    }

    public void setNäring(Näring näring) {
        this.näring = näring;
    }
}
