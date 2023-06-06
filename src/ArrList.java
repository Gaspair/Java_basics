import java.util.ArrayList;

public class ArrList {
//    public static void main(String[] args) {
//        ArrayList<String> food = new ArrayList<String>();
//
//        food.add("pizza");
//        food.add("hamburger");
//        food.add("hotdog");
//
//        food.set(0,"sushi");
//        food.remove(2);
//        food.clear();
//
//        for (int i = 0; i < food.size(); i++){
//            System.out.println(food.get(i));
//        }
//    }


    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();


        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> productsList = new ArrayList();
        productsList.add("tomatoes");
        productsList.add("zucchini");
        productsList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("coffee");
        drinksList.add("soda");

    groceryList.add(bakeryList);
    groceryList.add(productsList);
    groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(drinksList);
        System.out.println(productsList);
    }
}
