package InnerClasses;

public class Main {
    public static void main(String[] args) {
        Outside out = new Outside();
        Outside.Inside inside = out.new Inside();
        inside.Greeting();


    }


}
