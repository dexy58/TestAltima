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

public class MainFirstTest {
    @Test
    public void checkFirstParent(){
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
            boolean firstParent = false;
            for(int i=0;i<parentNames.size();i++){
                for(int j=0;j<childNames.size();j++){
                    if(parentNames.get(i).equals(childNames.get(j))){
                        firstParent = true;
                    }
                }
            }
            //At least one first parent exist
            assertTrue(firstParent);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}