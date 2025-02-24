package beverages;


public class Tea extends Beverage {

    public Tea(Boolean withCinnamon, Boolean withMilk, Boolean withCream) {
        super(1.5, withCinnamon, withMilk, withCream);
    }

    public Tea(){
        super(1.5);
    }
}
