// Абстрактный класс создателя, определяющий фабричный метод
public abstract class Creator {
    public abstract Product createProduct();

    public void userProduct() {
        Product product = createProduct();
        System.out.println("Использование продукта...");
        product.doSomething();
    }
}
