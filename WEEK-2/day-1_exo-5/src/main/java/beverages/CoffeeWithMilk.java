package beverages;

public class CoffeeWithMilk extends Coffee {

    public CoffeeWithMilk(boolean withCinnamon) {
        super(withCinnamon, true, false);
    }
    public CoffeeWithMilk() {
        super(false, true, false);
    }
}
