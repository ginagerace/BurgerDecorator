public class BasicBurger implements Burger{
    private double cost = 6.50;

    @Override
    public double makeBurger() {
        System.out.println("Basic Cheeseburger $" + cost);
        return cost;
    }
}
