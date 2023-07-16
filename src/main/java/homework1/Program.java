package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        HotDrink hotDrink1 = new HotDrink("capuchino", 10, 95 );
        HotDrink hotDrink2 = new HotDrink("latte", 15, 90 );
        HotDrink hotDrink3 = new HotDrink("green tea", 8, 85 );
        HotDrink hotDrink4 = new HotDrink("black tea", 7, 87 );
        // пример полиморфизма -  в коллекцию типа "Базовый класс" помещаем экземпляр дочернего класса
        List<Product> hotDrinkList = new ArrayList<>();
        hotDrinkList.add(hotDrink1);
        hotDrinkList.add(hotDrink2);
        hotDrinkList.add(hotDrink3);
        hotDrinkList.add(hotDrink4);

        HotDrinkVendingMachine hotDrinkVendingMachine1 = new HotDrinkVendingMachine(hotDrinkList);
        Product item = hotDrinkVendingMachine1.getProduct("latte");
        System.out.println(item);


    }
}
