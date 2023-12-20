package task_7.o.incorrect;


public class ProductService {
    public void generateArtikle(Product product, boolean forRetail) {
        if (forRetail) {
            product.setArtikel("R - " + product.getName());
        } else {
            product.setArtikel("W - " + product.getName());

        }
    }
}
