package homework2;

public class Human extends Actor  {

    public Human(String name) {
        super(name);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(boolean statusHumanOrder) {
        this.isMakeOrder = statusHumanOrder;
    }

    @Override
    public void setTakeOrder(boolean statusHumanOrder) {
        this.isTakeOrder = statusHumanOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return this.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return this.isTakeOrder;
    }
}
