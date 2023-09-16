public class BoxTruck extends Container{

    public static Pallet pallet = new Pallet();

    //String [Width][Length]
    public static String[][] boxTruck = new String[8][24];
    public BoxTruck() {

        super.setLength(24);
        super.setWidth(8);
        super.setHeight(8);
        super.setWeight(26000);

    }
    public static void addPallet(String[][] truck){
        int counter=0;
        for (int i = 0; i < 8/ pallet.getWidth(); i++) {
            for (int j = 0; j < 24/ pallet.getLength(); j++) {
                counter++;
                boxTruck[j][i] = "Pallet "+ counter;
            }
        }
    }
    public static void printPallet(String[][] truck) {
        int counter = 0;
        for (int i = 0; i < 24 / pallet.getLength(); i++) {
                System.out.println();

            for (int j = 0; j < 8 / pallet.getWidth(); j++) {
                counter++;
                System.out.println(boxTruck[i][j]);
            }

        }
    }

    public static void main(String[] args) {
        addPallet(boxTruck);
        printPallet(boxTruck);
    }
}
