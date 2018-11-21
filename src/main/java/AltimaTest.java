import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AltimaTest {
    public static void main(String[] args) {
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
            int counter = 1;
            while(true){
                for(int i=0;i<parentNames.size();i++){
                    for(int j=0;j<childNames.size();j++){
                        if(parentNames.get(i).equals(childNames.get(j))){
                            System.out.print("\t" + " parent");
                        }
                    }
                    System.out.println(parentNames.get(i));
                    for(int j=0;j<childNames.size();j++){

                    }
                }
                break;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
