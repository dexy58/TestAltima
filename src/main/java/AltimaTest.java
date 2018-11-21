import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AltimaTest {
    public static void main(String[] args) {
        try {
            FileInputStream fstream = new FileInputStream("C:\\ChildParent.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
