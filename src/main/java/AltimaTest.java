import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AltimaTest {
    public static void main(String[] args) {
        Map<String, String> familyTree = new HashMap<>();
        try {
            FileInputStream fstream = new FileInputStream("C:\\ChildParent.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            String[] namesList = new String[2];
            while((strLine=br.readLine()) != null) {
                namesList = strLine.split(" ");
                familyTree.put(namesList[1], namesList[0]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
