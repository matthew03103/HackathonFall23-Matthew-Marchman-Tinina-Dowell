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
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setMaxWeight(long maxWeight) {
        super.setMaxWeight(maxWeight);
    }


    @Override
    public double volume() {
        return getLength() * getHeight() * getWidth();
    }

}