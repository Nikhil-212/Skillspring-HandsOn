public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        // Wrapped coffee receives additional features in subclasses.
        this.coffee = coffee;
    }
}
