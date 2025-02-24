package beverages;

public abstract class Beverage {
    public double price(){
        double price = basePrice;
        if (withCinnamon){
            price += cinnamonPrice;
        }
        if (withMilk){
            price += milkPrice;
        }
        if (withCream){
            price += creamPrice;
        }
        return price;
    }
    boolean withCinnamon;
    boolean withMilk;
    boolean withCream;
    final double cinnamonPrice = 0.05;
    final double milkPrice = 0.10;
    final double creamPrice = 0.15;
    double basePrice;

    public Beverage(double basePrice, Boolean withCinnamon, Boolean withMilk, Boolean withCream) {
        this.withCinnamon = withCinnamon != null && withCinnamon;
        this.withMilk = withMilk != null && withMilk;
        this.withCream = withCream != null && withCream;
        this.basePrice = basePrice;
    }

    public Beverage(double basePrice) {
        withCinnamon = false;
        withMilk = false;
        withCream = false;
        this.basePrice = basePrice;
    }
}
