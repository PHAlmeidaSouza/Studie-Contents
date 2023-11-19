package entities;

public class Product {

    private String nomes;
    private String emails;

    public Product(String nomes, String emails) {
        this.nomes = nomes;
        this.emails = emails;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String toString() {
        return nomes + ", " + emails;
    }
}
