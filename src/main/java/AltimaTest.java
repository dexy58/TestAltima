import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivan Kralj <kraljivan488@gmail.com>
 */

public class AltimaTest {
    public static void main(String[] args) {
        List<String> parentNames = new ArrayList<>();
        List<String> childNames = new ArrayList<>();
        List<String> parentStarter = new ArrayList<>();
        List<String> childParent = new ArrayList<>();
        List<String> finalChild = new ArrayList<>();
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
            int counter;
            boolean firstParent;
            boolean childParentFlag;
            for(int i=0;i<parentNames.size();i++){
                counter = 1;
                firstParent = false;
                for(int j=0;j<childNames.size();j++){
                    if(parentNames.get(i).equals(childNames.get(j))){
                        firstParent = true;
                    }
                }
                //Check if he/she is a first parent
                if(firstParent == false && parentStarter.contains(parentNames.get(i)) == false){
                    //Don't write first parent twice
                    parentStarter.add(parentNames.get(i));
                    System.out.println(parentNames.get(i));
                    for(int j=0;j<parentNames.size();j++){
                        //Check if that parent has a child and write it
                        if(parentNames.get(j).equals(parentNames.get(i))){
                            System.out.println("\t" + childNames.get(j));
                            counter++;
                            childParent.add(childNames.get(j));
                        }
                        //A child is also a parent, check if that child/parent also has a child
                        while(counter > 1){
                            childParentFlag = false;
                            for(int k=0; k<parentNames.size();k++){
                                if(childParent.get(childParent.size()-1).equals(parentNames.get(k)) && finalChild.contains(childNames.get(k)) == false){
                                    for(int z=0;z<counter;z++){
                                        System.out.print("\t");
                                    }
                                    System.out.println(childNames.get(k));
                                    childParent.add(childNames.get(k));
                                    childParentFlag = true;
                                    counter++;
                                    break;
                                }
                            }
                            //This is the last child, or in other words, he/she is not a parent
                            if(childParentFlag == false){
                                counter--;
                                finalChild.add(childParent.get(childParent.size()-1));
                                childParent.remove(childParent.size()-1);
                            }
                        }
                        finalChild.clear();
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
