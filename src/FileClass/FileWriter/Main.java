package FileClass.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \n Violets are blue \n booty booty booty" );
            writer.close();
        }catch(IOException e){
//            TODO auto-generated
            e.printStackTrace();
        }
    }
}
