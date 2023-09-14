public class Pallet extends Container{
    Pallet() {
    double length = 48;
    double height = 5;
    double width = 40;
    long maxWeight = 4600;
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
