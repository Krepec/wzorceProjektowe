public class App {
    public static void main(String[] args) {

        ExampleSingleton exampleSingleton = ExampleSingleton.createSingleton(); // wzorzec projektowy singleton uzywamy  kiedy chcemy utworzyc tylko jeden obiekt danej klasy np jeden woźny w szatni
        ExampleSingleton exampleSingleton2 = ExampleSingleton.createSingleton();


        System.out.println(exampleSingleton);
        System.out.println(exampleSingleton2);

        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        pizzaBuilder              // wzorzec projektowy bulder uzywamy do tworzenia obiektw tak jak w tym przypadku gdzie kucharz tworzy nam pizze ze skladnikow wymaganych (ser, ciasto) oraz opcjonalnych(salami,papryka itp), używamy tam gdzie nie chcemy tworzyc duzej ilosci konstruktorow
                .newPizza()
                .addOliwki()
                .addPapryka()
                .addSalami()
                .buildPizza();




    }

}
