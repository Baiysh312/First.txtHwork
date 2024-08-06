import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner scan= new Scanner(System.in);
        System.out.println("vvedite name");
        String name= scan.next();
        System.out.println("vvedite age");
        int age = scan.nextInt();
        FileWriter fl= new FileWriter("users.txt");
        fl.write(name+":"+age);
        fl.close();

        String str= "";
        FileReader flr= new FileReader("users.txt");
        Scanner sc=new Scanner(flr);
        while (sc.hasNextLine()){
            str+=sc.nextLine();
        }
        System.out.println(str);
    }
}
