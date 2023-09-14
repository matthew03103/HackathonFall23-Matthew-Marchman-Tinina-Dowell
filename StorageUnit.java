public class StorageUnit extends Container{
    StorageUnit() {
        double length = 20;
        double height = 8;
        double width = 10;

        setLength(length);
        setHeight(height);
        setWidth(width);


    }


    @Override
    public double volume() {
        return getLength() * getHeight() * getWidth();
    }
}
