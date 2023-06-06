public class Arrays {
    //    public static void main(String[] args){
////        String [] cards = {"Camaro", "Corvette", "Silverado", "Tesla"};
////
//
//
//        String[] cars = new String[4];
//
//        cars[0] = "Camaro";
//        cars[1] = "Corvette";
//        cars[2] = "Silverado";
//        cars[3] = "Tesla";
//
//        for(int i = 0; i<cars.length; i++){
//            System.out.println(cars[i]);
//        }
//    }
    public static void main(String[] args) {
//            2d array
        String[][] cars = new String[3][3];


        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ford";
        cars[1][2] = "Chrysler";
        cars[2][0] = "Tesla";
        cars[2][1] = "Honda";
        cars[2][2] = "Mazda";


        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }

        }
    }
}

