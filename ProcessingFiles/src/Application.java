import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter some texts: ");
//        String line = input.nextLine();
//        System.out.println(line);

        File file = new File("textFile.txt");
        Scanner input = new Scanner(file);
        while(input.hasNext()) {
            String line = input.nextLine();
            System.out.println(line);
        }

        input.close();

        try {
            MyFileUtils myFileUtils = new MyFileUtils();
            System.out.println(myFileUtils.subtractTenFromInput(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
