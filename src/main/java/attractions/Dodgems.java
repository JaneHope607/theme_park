package attractions;

import behaviours.IReviewed;
import behaviours.ISTicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ISTicketed {

    private double price;

    public Dodgems(String name, int rating) {

        super(name, rating);
        this.price = 4.50;
    }

    @Override
    public double defaultPrice() {
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return this.price / 2;
        } else {
            return this.defaultPrice();
        }
    }
}