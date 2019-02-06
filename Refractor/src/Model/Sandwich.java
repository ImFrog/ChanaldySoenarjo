package Model;

public class Sandwich extends Item {
    private Size size;

    public Sandwich(String name, Size size) {
        super(name, size.getPrice());
        this.size = size;
    }

    @Override
    public double getPrice() {
        return size.getPrice();
    }

    public enum Size {
        SMALL(6.5), MEDIUM(8.0), LARGE(10.5);

        private double price;

        Size(double price) {
            this.price = price;
        }

        double getPrice() {
            return price;
        }
    }
}