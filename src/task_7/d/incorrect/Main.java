package task_7.d.incorrect;

public class Main {
    public static void main(String[] args) {
        ProductRepositoryMap repository = new ProductRepositoryMap();
        ProductService service = new ProductService(repository);

        System.out.println(service.getAll());
        System.out.println(service.getByName("Banana"));
    }
}
