public class ShippingContainer extends Container{

    public static String [][][] container=new String[40][8][8];
    public static Box box = new Box(1, 5, 2, 5);

        // Constructor for ShippingContainer
        public ShippingContainer() {

            super.setLength(40);
            super.setWidth(8);
            super.setHeight(8);
            super.setWeight(59200);
        }

    // these 3 for loops fill the array with boxes.

    public static void fillArray(String[][][] container, Box box) {

        int counter = 0;
        long maxWeight = 59200;
        long temp = box.getWeight();
        boolean full = false;



        //length

        if (maxWeight > temp){
            for (int i = 0; i < 40/box.getLength(); i++) {
                //  System.out.println();

                //height
                for (int j = 0; j < 8/box.getHeight(); j++) {
                    //      System.out.println();
                    //width
                    for (int k = 0; k < 8/box.getWidth(); k++) {
                        counter++;
                        container[i][j][k] = "box " + counter + " ";
                    }
                }
            }

        }
    }



    public static void printArray(String[][][] container){
        //length
        for (int i = 0; i < 40/box.getLength(); i++){
            System.out.println();

            //height
            for (int j = 0; j < 8/ box.getHeight(); j++) {
                System.out.println();
                //width
                for (int k = 0; k < 8/ box.getWidth(); k++) {
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
