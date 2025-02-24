package beverages;


public class HotChocolate extends Beverage {

    public HotChocolate(Boolean withCinnamon, Boolean withMilk, Boolean withCream) {
        super(1.45, withCinnamon, withMilk, withCream);
    }

    public HotChocolate() {
        super(1.45);
    }
}
