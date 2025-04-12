package ex3;

import java.util.Arrays;

public class Persoana {
    private String nume;
    private int varsta;
    private double[] venit; // venit pentru 12 luni
    private static int nrPersoane = 0;
    private int id; // ID unic pentru fiecare persoana

    // Bloc static de init
    static {
        nrPersoane = 0;
        System.out.println("Bloc static: nrPersoane initializat la 0");
    }

    // Bloc nestatic
    {
        id = ++nrPersoane;
        System.out.println("Bloc de inițializare: ID atribuit: " + id);
    }

    // Constructor implicit
    public Persoana() {
        this.nume = "Necunoscut";
        this.varsta = 0;
        this.venit = new double[12]; // 12 luni
    }

    // Constructor parametrizat
    public Persoana(String nume, int varsta, double[] venit) {
        this.nume = nume;
        this.varsta = varsta;
        // Deep copy a array-ului venit
        this.venit = new double[12];
        for (int i = 0; i < Math.min(venit.length, 12); i++) {
            this.venit[i] = venit[i];
        }
    }

    // Constructor de copiere
    public Persoana(Persoana other) {
        this.nume = other.nume;
        this.varsta = other.varsta;
        // Deep copy al array-ului venit
        this.venit = new double[12];
        for (int i = 0; i < other.venit.length; i++) {
            this.venit[i] = other.venit[i];
        }
        // ID-ul se atribuie din nou prin blocul nestatic, deci nu copiem id-ul existent
    }

    // Getteri și setteri
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
    public double[] getVenit() {
        return venit;
    }
    public void setVenit(double[] venit) {
        // Realizam deep copy
        this.venit = new double[12];
        for (int i = 0; i < Math.min(venit.length, 12); i++) {
            this.venit[i] = venit[i];
        }
    }
    public double getVenitLuna(int luna) {
        if (luna >= 0 && luna < venit.length) {
            return venit[luna];
        }
        return 0;
    }
    public void setVenitLuna(int luna, double suma) {
        if (luna >= 0 && luna < venit.length) {
            this.venit[luna] = suma;
        }
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", venit=" + Arrays.toString(venit) +
                '}';
    }


    public static void main(String[] args) {
        // Testare constructor implicit
        Persoana p1 = new Persoana();
        p1.setNume("Felix ?");
        p1.setVarsta(30);
        p1.setVenit(new double[]{1000, 1100, 1200, 1300, 1400, 1500, 1600, 1700, 1800, 1900, 2000, 2100});
        System.out.println(p1);

        // Testare constructor parametrizat
        double[] venitMaria = {2000, 2100, 2200, 2300, 2400, 2500, 2600, 2700, 2800, 2900, 3000, 3100};
        Persoana p2 = new Persoana("Otilia Margulescu", 28, venitMaria);
        System.out.println(p2);

        // Testare constructor de copiere
        Persoana p3 = new Persoana(p2);
        p3.setNume("Cealalta Otilia");
        p3.setVenitLuna(0, 5000);
        System.out.println("Dupa modificare:");
        System.out.println("Original: " + p2);
        System.out.println("Copie: " + p3);
    }
}
