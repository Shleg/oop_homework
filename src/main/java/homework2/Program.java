package homework2;

public class Program {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Vasya");
        Human human2 = new Human("Dima");
        Human human3 = new Human("Masha");

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);

        market.update();

    }
}
