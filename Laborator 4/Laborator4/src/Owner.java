public class Owner {
    String nume;

    public Owner(String nume) {
        this.nume = nume;
    }

    public Owner(Owner owner) {
        this.nume = owner.nume;
    }


    @Override
    public String toString() {
        return "Owner{" +
                "nume='" + nume + '\'' +
                '}';
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
