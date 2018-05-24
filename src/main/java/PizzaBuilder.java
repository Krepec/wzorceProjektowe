public class PizzaBuilder  {
    private Pizza pizza; // deklaracja
    //ctrl+q
    public PizzaBuilder newPizza(){
       pizza =  new Pizza("ser","ciasto"); // inicjalizacja
        return this;
    }

    public PizzaBuilder addSalami(){
        pizza.setSalami("salami");
             return this;
    }

    public PizzaBuilder addOliwki(){
        pizza.setOliwki("oliwki");
        return this;
    }

    public PizzaBuilder addPapryka(){
        pizza.setPapryka("papryka");
        return this;
    }

    public Pizza buildPizza(){
        return this.pizza;
    }
}
