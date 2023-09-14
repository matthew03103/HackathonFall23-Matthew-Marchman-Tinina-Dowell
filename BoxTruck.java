public class BoxTruck extends Container{


    BoxTruck() {
        double length = 24;
        double height = 8;
        double width = 8;
        long maxWeight = 26000;
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
