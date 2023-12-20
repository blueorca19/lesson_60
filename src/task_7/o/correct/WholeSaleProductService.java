package task_7.o.correct;

public class WholeSaleProductService implements ProductService {
    @Override
    public void generateArtikle(Product product) {
        product.setArtikel("W -" + product.getName());
    }
}
