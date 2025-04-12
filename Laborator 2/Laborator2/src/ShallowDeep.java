import java.util.Arrays;
class PersoanaShallow {
    private String nume;
    private int varsta;
    private double[] venit;

    public PersoanaShallow(String nume, int varsta, double[] venit) {
        this.nume = nume;
        this.varsta = varsta;

        this.venit = venit;
    }


    public PersoanaShallow(PersoanaShallow other) {
        this.nume = other.nume;
        this.varsta = other.varsta;

        this.venit = other.venit;
    }

    public void setVenit(int luna, double suma) {
        if (luna >= 0 && luna < venit.length) {
            venit[luna] = suma;
        }
    }

    public double getVenit(int luna) {
        if (luna >= 0 && luna < venit.length)
            return venit[luna];
        return 0;
    }

    @Override
    public String toString() {
        return "PersoanaShallow{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", venit=" + Arrays.toString(venit) +
                '}';
    }
}


class PersoanaDeep {
    private String nume;
    private int varsta;
    private double[] venit;

    public PersoanaDeep(String nume, int varsta, double[] venit) {
        this.nume = nume;
        this.varsta = varsta;

        this.venit = new double[venit.length];
        for (int i = 0; i < venit.length; i++) {
            this.venit[i] = venit[i];
        }
    }

    // Constructor de copiere (deep copy)
    public PersoanaDeep(PersoanaDeep other) {
        this.nume = other.nume;
        this.varsta = other.varsta;
//      this.venit = other.venit;
        this.venit = new double[other.venit.length];
        for (int i = 0; i < other.venit.length; i++) {
            this.venit[i] = other.venit[i];
        }
    }

    public void setVenit(int luna, double suma) {
        if(luna >= 0 && luna < venit.length) {
            venit[luna] = suma;
        }
    }

    public double getVenit(int luna) {
        if(luna >= 0 && luna < venit.length)
            return venit[luna];
        return 0;
    }

    @Override
    public String toString() {
        return "PersoanaDeep{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", venit=" + Arrays.toString(venit) +
                '}';
    }

}

public class ShallowDeep {
    public static void main(String[] args) {
         double[] venitInitial = {2000.25, 3000.50, 4000.75};
         PersoanaShallow ps1 = new PersoanaShallow("Ana", 25, venitInitial);
         PersoanaShallow ps2 = new PersoanaShallow(ps1);
         ps2.setVenit(1, 5000);

        System.out.println("Shallow copy:");
        System.out.println("Original: " + ps1);
        System.out.println("Copia: " + ps2);


        // Demonstrarea deep copy
        double[] venitInitialDeep = {2000.25, 3000.50, 4000.75};
        PersoanaDeep pd1 = new PersoanaDeep("Ion", 30, venitInitialDeep);
        PersoanaDeep pd2 = new PersoanaDeep(pd1);


        pd2.setVenit(1, 5000);

        System.out.println("\nDeep");
        System.out.println("Original: " + pd1);
        System.out.println("Copy: " + pd2);


    }
}
