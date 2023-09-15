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
    public double volume() {
        return getLength() * getHeight() * getWidth();
    }
}
