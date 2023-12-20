package task_7.d.incorrect;

public class Product {
    private String name;
    private String artikel;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArtikel(String artikel) {
        this.artikel = artikel;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", artikel='" + artikel + '\'' +
                '}';
    }
}

