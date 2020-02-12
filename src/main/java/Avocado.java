public class Avocado extends BurgerDecorator {

    private double cost = 2.00;

    public Avocado(Burger b){
        super(b);
    }

    @Override
    public double makeBurger() {
        return burger.makeBurger() + addAvocado();
    }

    private double addAvocado(){
        System.out.println("+ Avocado $" + cost);
        return cost;
    }
}
