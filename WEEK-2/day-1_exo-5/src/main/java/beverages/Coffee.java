package beverages;

public class Coffee extends Beverage {

    public Coffee(Boolean withCinnamon, Boolean withMilk, Boolean withCream) {
        super(1.20, withCinnamon, withMilk, withCream);
    }

    public Coffee(){
        super(1.20);
    }
}
