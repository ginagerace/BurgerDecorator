public class GrilledOnions extends BurgerDecorator{

    private double cost = 2.00;

    public GrilledOnions(Burger b){
        super(b);
    }

    @Override
    public double makeBurger() {
        return burger.makeBurger() + addGrilledOnions();
    }

    private double addGrilledOnions(){
        System.out.println("+ Grilled Onions $" + cost);
        return cost;
    }
}
