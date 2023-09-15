public class Main {

    public static Pallet p1=new Pallet();
    public static String [][][] container=new String[p1.getLength()][p1.getHeight()][p1.getWidth()];









    public static void printArray(String[][][] container){

        //length
        for (int i = 0; i < p1.getLength(); i++){
            System.out.println();

            //height
            for (int j = 0; j < p1.getHeight() ; j++) {
                System.out.println();
                //width
                for (int k = 1; k < p1.getWidth(); k++) {
                    System.out.print(container[i][j][k]);
                }
            }
        }
    }


    public static void fillArray(String[][][] container){
        int counter =0;
        //length
        for (int i = 0; i < p1.getLength(); i++) {
          //  System.out.println();

            //height
            for (int j = 0; j <p1.getHeight() ; j++) {
          //      System.out.println();
                //width
                for (int k = 0; k < p1.getWidth(); k++) {


                    container[i][j][k]="box "+counter+" ";
                    counter++;
                }

            }
        }
    }



    public static void main(String[] args) {





      fillArray(container);
      printArray(container);
    }
}

