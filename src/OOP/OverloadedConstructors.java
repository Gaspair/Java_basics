package OOP;

public class OverloadedConstructors {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Thicc crust", "tomato", "mozzarela", "peperoni");
        Pizza pizza2 = new Pizza("Thicc crust", "tomato", "mozzarela");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);
    }
}
