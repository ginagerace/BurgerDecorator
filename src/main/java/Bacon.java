public class Bacon extends BurgerDecorator {

    private double cost = 2.00;

    public Bacon(Burger b){
        super(b);
    }

    @Override
    public double makeBurger() {
        return burger.makeBurger() + addBacon();
    }

    private double addBacon(){
        System.out.println("+ Bacon $" + cost);
        return cost;
    }
}
