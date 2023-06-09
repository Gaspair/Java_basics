package OOP.Interfaces;

public class Fish implements Prey,Predator{
    @Override
    public void hunt() {
        System.out.println("This is fish is hunting smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("This is fish is fleeing largers fish");

    }
}
