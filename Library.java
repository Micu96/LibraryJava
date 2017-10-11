import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Michał on 09.10.2017.
 */
public class Library {

    LinkedList<String> names;
    LinkedList<String> authors;
    BufferedReader bf = new BufferedReader(new FileReader(new File("C:\\Users\\Michał\\IdeaProjects\\Library1\\Spis.txt")));
    FileWriter fw = new FileWriter("Spis.txt",true);
    Scanner in = new Scanner(System.in);
    

    public Library() throws IOException {

        names = new LinkedList<>();
        authors = new LinkedList<>();

    }

    public void getBooks() throws IOException {
        String s="";
        int counter = 0;
        while((s = bf.readLine())!=null){
            if(counter==0){
                //System.out.println(s);
                names.add(s);
                counter = 1;
            }
            else {
                //System.out.println(s);
                authors.add(s);
                counter = 0;
            }
        }

    }
    public void addBook() throws IOException {
        System.out.println("Podaj tytuł ksiązki : ");
        String name = in.nextLine();
        names.add(name);
        fw.write("\n"+name);
        System.out.println("Podaj autora ksiązki : ");
        String author = in.nextLine();
        authors.add(author);
        fw.write("\n"+author);
        fw.close();

    }
    public void checkBook(){
        System.out.println("Podaj nazwe ksiazki która chcesz znaleźć : ");
        String n = in.nextLine();
        System.out.println("i nazwe autora : ");
        String a = in.nextLine();
        Boolean isAvaible = false;
        for(int i = 0; i<names.size();i++){

            String temp_n = names.get(i);
            String temp_a = authors.get(i);

            if(temp_n.equals(n)){
                if(temp_a.equals(a)){
                    isAvaible = true;
                    System.out.println( "Ksiazka danego autora znajduje się w bibliotece");

                }
            }


        }
        if(isAvaible==false){
            System.out.println( "Nie ma takiej ksiazki tego autora");
        }


    }




}
