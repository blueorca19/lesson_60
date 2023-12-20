package task_7.o.correct;

public class RetailProductService implements ProductService {
    @Override
    public void generateArtikle(Product product) {
        product.setArtikel("R - " + product.getName());
    }
}
