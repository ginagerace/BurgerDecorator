public class BurgerDecorator implements Burger{

    protected Burger burger;

    public BurgerDecorator(Burger b){
        this.burger = b;
    }

    @Override
    public double makeBurger() {
        return 0.00;
    }
}
