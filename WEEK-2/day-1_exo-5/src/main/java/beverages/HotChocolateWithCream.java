package beverages;

public class HotChocolateWithCream extends HotChocolate {

    public HotChocolateWithCream(boolean withCinnamon) {
        super(withCinnamon, false, true);
    }
    public HotChocolateWithCream() {
        super(false, false, true);
    }
}
