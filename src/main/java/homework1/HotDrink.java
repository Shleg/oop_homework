package homework1;

public class HotDrink extends Product {
    private int temperature;


    public HotDrink(String name, double cost, int temperature) {
        super(name, cost);
        setTemperature(temperature);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name: '" + super.getName() + "\', " +
                "temperature: " + this.temperature + " градусов, " +
                "cost: " + super.getCost() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotDrink)) {
            return false;
        }

        HotDrink that = (HotDrink) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && getTemperature() == that.getTemperature();
    }
}