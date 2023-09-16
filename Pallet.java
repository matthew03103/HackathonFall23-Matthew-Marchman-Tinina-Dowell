 public static String [][][] container=new String[48][5][40];
    public static Box box = new Box(1, 5, 2, 5);


    public Pallet() {

            super.setLength(48);
            super.setWidth(40);
            super.setHeight(5);
            super.setWeight(59200);

        }



    public static void fillArray(String[][][] container, Box box) {

        int counter = 0;
        long maxWeight = 59200;
        long temp = box.getWeight();
        boolean full = false;

        //length

        if (maxWeight > temp){
            for (int i = 0; i < 48/box.getLength(); i++) {
                //  System.out.println();

                //height
                for (int j = 0; j < 5/box.getHeight(); j++) {
                    //      System.out.println();
                    //width
                    for (int k = 0; k < 40/box.getWidth(); k++) {
                        counter++;
                        container[i][j][k] = "box " + counter + " ";
                    }
                }
            }

        }
    }



    public static void printArray(String[][][] container){
        //length
        for (int i = 0; i < 48/box.getLength(); i++){
            System.out.println();

            //height
            for (int j = 0; j < 5/ box.getHeight(); j++) {
                System.out.println();
                //width
                for (int k = 0; k < 40/ box.getWidth(); k++) {
                    System.out.print(container[i][j][k]);

                }
            }
        }
    }



}

