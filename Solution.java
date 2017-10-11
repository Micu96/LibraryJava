import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Michał on 09.10.2017.
 */
public class Solution {


    public static void main(String[] args) throws IOException {

    Scanner in = new Scanner(System.in);
    Library l = new Library();

    //System.out.println( l.names.get(0));
    //l.addBook();
   // l.getBooks();
    //for(int i = 0; i<l.names.size();i++){
     //   System.out.println(l.names.get(i)+", "+l.authors.get(i));
   // }
   // l.checkBook();
    //System.out.println(l.names.get(0));
        //System.out.println(l.authors.get(0));

    GenericsClass gc = new GenericsClass();
    System.out.println(gc.getFromFile());





    }

}
