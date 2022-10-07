package Greenest;

public enum Näring {
    KRANVATTEN (" Kranvatten "),
    MINERALVATTEN(" Mineralvatten "),
    PROTEINDRYCK("Protein dryck");


    public final String näringsTyp;
    Näring(String n){
        this.näringsTyp = n;
    }
}
