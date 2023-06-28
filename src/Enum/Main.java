package Enum;

public class Main {
    public static void main(String[] args) {
        Planet myPlanet = Planet.EARTH;

        canILiveHere(myPlanet);
    }

    static void canILiveHere(Planet myPlanet){
        switch (myPlanet){
            case EARTH:
                System.out.println("You can live here:"+myPlanet  );
                System.out.println("This is planet #"+myPlanet.number);
                break;
            default:
                System.out.println("You can't live here...yet");
        }
    }
}
