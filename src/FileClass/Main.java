package FileClass;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("secret.txt");

        if(file.exists()){
            System.out.println("That file exists!");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }else{
            System.out.println("That file doesn't exiast");
        }

    }
}
