// ta klasa to simnleton moge stworzyc tylko jedna instancje tej klasy
public class ExampleSingleton {

    private static ExampleSingleton singleInstance; // enum jest najlepszym singletonem

    private ExampleSingleton() {
    }

    static public ExampleSingleton createSingleton() {

        if (singleInstance == null) {
            singleInstance = new ExampleSingleton();
        }

        return singleInstance;
    }
}
