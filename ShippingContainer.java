public class ShippingContainer extends Container{




        // Constructor for ShippingContainer
        public ShippingContainer() {

            super.setLength(40);
            super.setWidth(8);
            super.setHeight(8);
            super.setWeight(59200);
        }

    public static void fillArray(String[][][] container, Box box) {

        int counter = 0;
        long maxWeight = 59200;
        long temp = box.getWeight();
        boolean full = false;


        // these 3 for loops fill the array with boxes.
        //length

        if (maxWeight > temp){
            for (int i = 0; i < 48; i++) {
                //  System.out.println();

                //height
                for (int j = 0; j < 5; j++) {
                    //      System.out.println();
                    //width
                    for (int k = 0; k < 40; k++) {

                        container[i][j][k] = "box " + counter + " ";
                        counter++;
                    }
                }
            }

        }
    }



    public static void printArray(String[][][] container){
        //length
        for (int i = 0; i < 48; i++){
            System.out.println();

            //height
            for (int j = 0; j < 5; j++) {
                System.out.println();
                //width
                for (int k = 1; k < 40; k++) {
                    System.out.print(container[i][j][k]);

                }
            }
        }
    }


}
