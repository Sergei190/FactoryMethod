// Использования фабричного метода
public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.userProduct(); // Создание и использование ConcreteProductA

        Creator creatorB = new ConcreteCreatorB();
        creatorB.userProduct(); // Создание и использование ConcreteCreatorB
    }
}
