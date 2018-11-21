import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AltimaTest {
    public static void main(String[] args) {
        Map<String, Integer> familyTree = new HashMap<>();
        try {
            FileInputStream fstream = new FileInputStream("C:\\ChildParent.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while((strLine=br.readLine()) != null) {
                String[] namesList = strLine.split(" ");
                for(String name : namesList){
                    System.out.println(name);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
