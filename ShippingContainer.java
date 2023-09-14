public class ShippingContainer extends Container{
    ShippingContainer() {
        double length = 40;
        double height = 8.5;
        double width = 8;
        long maxWeight = 59200;
        setLength(length);
        setHeight(height);
        setWidth(width);
        setMaxWeight(maxWeight);

    }


    @Override
    public double volume() {
        return getLength() * getHeight() * getWidth();
    }

}
