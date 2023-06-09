package OOP.AccessModifiers.package1;
import OOP.AccessModifiers.package2.*;
public class A {
    protected String protectedMessage ="This is protected";
    protected String privateMessage ="This is private";
    public static void main(String[] args) {
        B b = new B();
//        System.out.println(c.publicMessage);
//        System.out.println(c.defaultMessage);
//        System.out.println(b.privateMessage);
    }

}
