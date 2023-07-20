package homework2;

public interface ActorBehaivour {
    void setMakeOrder(boolean statusActorOrder);
    void setTakeOrder(boolean statusActorOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
}
