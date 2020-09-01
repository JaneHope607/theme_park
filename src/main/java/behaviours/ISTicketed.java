package behaviours;

import people.Visitor;

public interface ISTicketed {

    public double defaultPrice();
    public double priceFor(Visitor visitor);
}