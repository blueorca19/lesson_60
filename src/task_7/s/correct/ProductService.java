package task_7.s.correct;

public class ProductService {
    public void generateArtikle(Product product) {
        product.setArtikel("A - " + product.getName());
    }
}
