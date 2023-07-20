package homework2;

public abstract class Actor implements ActorBehaivour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    abstract String getName();

    public Actor(String name) {
        this.name = name;
    }
}
