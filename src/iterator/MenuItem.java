package iterator;

public class MenuItem {

    String name;
    String description;
    boolean vegtarian;
    double price;

    public MenuItem(String name, String description, boolean vegtarian, double price) {
        this.name = name;
        this.description = description;
        this.vegtarian = vegtarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegtarian() {
        return vegtarian;
    }

    public void setVegtarian(boolean vegtarian) {
        this.vegtarian = vegtarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegtarian=" + vegtarian +
                ", price=" + price +
                '}';
    }
}
