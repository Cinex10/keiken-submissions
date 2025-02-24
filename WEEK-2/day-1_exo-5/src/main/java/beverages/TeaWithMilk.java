package beverages;

public class TeaWithMilk extends Tea {

    public TeaWithMilk(boolean withCinnamon) {
        super(withCinnamon, true, false);
    }
    public TeaWithMilk() {
        super(false, true, false);
    }

}
