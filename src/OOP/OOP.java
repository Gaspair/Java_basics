package OOP;

public class OOP {

        public static void main(String[]args){

            Human human1 = new Human("Rick",65,70);
            Human human2 = new Human("Morty",16,60);

            human2.eat();
            human1.drink();

        }

}

//First Lesson on OOP
//    public static void main(String[] args) {
//        Car myCar1 = new Car();
//        Car myCar2 = new Car();
//        System.out.println(myCar1.model);
//        System.out.println(myCar1.make);
//        System.out.println();
//        System.out.println(myCar2.model);
//        System.out.println(myCar2.make);

//        myCar1.drive();
//        myCar1.brake();
//    }