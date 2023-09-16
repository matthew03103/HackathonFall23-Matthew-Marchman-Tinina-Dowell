public class StorageUnit extends Container{

    public static Pallet p1=new Pallet();
    public static String [][][] container=new String[p1.getLength()][p1.getHeight()][p1.getWidth()];
    public static Box box = new Box(1, 5, 2, 5);

    public StorageUnit() {

        super.setLength(20);
        super.setWidth(10);
        super.setHeight(8);

    }
    public static void fillArray(String[][][] container, Box box) {

        int counter = 0;
        long maxWeight = 59200;
        long temp = box.getWeight();
        boolean full = false;



        //length

        if (maxWeight > temp){
            for (int i = 0; i < p1.getLength()/box.getLength(); i++) {
                //  System.out.println();

                //height
                for (int j = 0; j < p1.getHeight()/box.getHeight(); j++) {
                    //      System.out.println();
                    //width
                    for (int k = 0; k < p1.getWidth()/box.getWidth(); k++) {
                        counter++;
                        container[i][j][k] = "box " + counter + " ";
                    }
                }
            }

        }
    }



    public static void printArray(String[][][] container){
        //length
        for (int i = 0; i < p1.getLength()/box.getLength(); i++){
            System.out.println();

            //height
            for (int j = 0; j < p1.getHeight()/ box.getHeight(); j++) {
                System.out.println();
                //width
                for (int k = 0; k < p1.getWidth()/ box.getWidth(); k++) {
                    System.out.print(container[i][j][k]);

                }
            }
        }
    }

    public static void main(String[] args) {
        fillArray(container, box);
        printArray(container);
    }


}
