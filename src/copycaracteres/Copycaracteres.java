
package copycaracteres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class Copycaracteres {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File texto = new File("texto11.txt");
        texto.createNewFile();
        
        
        FileReader read = new FileReader("texto10.txt");
        FileWriter write = new FileWriter("texto11.txt");

        int c;
        while((c = read.read()) != -1){
            write.write(c);
        }        
        read.close();
        write.close();
        
    }
    
}
