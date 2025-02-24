package beverages;

public class CoffeeWithMilkAndCream extends Coffee {

    public CoffeeWithMilkAndCream(boolean withCinnamon) {
        super(withCinnamon, true, true);
    }

    public CoffeeWithMilkAndCream() {
        super(false, true, true);
    }
}
