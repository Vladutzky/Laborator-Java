package ex4;

public class Persoana {
    private String nume;
    private int varsta;
    private int id;
    private static int nrPersoane;


    static {
        nrPersoane = 0;
    }

    {
        id = ++nrPersoane;
    }


    public Persoana() {
    }


    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }


    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getId() {
        return id;
    }
}

