public class RoastedPeppers extends BurgerDecorator {

    private double cost = 2.00;

    public RoastedPeppers(Burger b){
        super(b);
    }

    @Override
    public double makeBurger() {
        return burger.makeBurger() + addRoastedPeppers();
    }

    private double addRoastedPeppers(){
        System.out.println("+ Roasted Peppers $" + cost);
        return cost;
    }
}
