import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author Ivan Kralj <kraljivan488@gmail.com>
 */

public class FinalChildTest {
    @Test
    public void checkFinalChild(){
        List<String> parentNames = new ArrayList<>();
        List<String> childNames = new ArrayList<>();
        try {
            FileInputStream fstream = new FileInputStream("C:\\ChildParent.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            String[] namesList;
            while((strLine=br.readLine()) != null) {
                namesList = strLine.split(" ");
                childNames.add(namesList[0]);
                parentNames.add(namesList[1]);
            }
            assertFalse(childNames.isEmpty());
            assertFalse(parentNames.isEmpty());
            boolean finalChild = false;
            int counter = 0;
            for(int i=0;i<childNames.size();i++){
                for(int j=0;j<parentNames.size();j++){
                    if(childNames.get(i).equals(parentNames.get(j)) == false){
                        counter++;
                    }
                }
                //If all parent names don't match child names, he isn't a parent
                if(counter == childNames.size()){
                    finalChild = true;
                }
                counter = 0;
            }
            assertTrue(finalChild);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
