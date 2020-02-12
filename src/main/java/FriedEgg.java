public class FriedEgg extends BurgerDecorator{

    private double cost = 2.00;

    public FriedEgg(Burger b){
        super(b);
    }

    @Override
    public double makeBurger() {
        return burger.makeBurger() + addFriedEgg();
    }

    private double addFriedEgg(){
        System.out.println("+ Fried Egg $" + cost);
        return cost;
    }
}
