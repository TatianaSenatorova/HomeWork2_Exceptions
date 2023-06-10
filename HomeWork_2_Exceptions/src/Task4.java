import java.util.Scanner;
import java.io.FileNotFoundException;

public class Task4{
    public static String main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
            if (str.isEmpty())
                throw new IllegalArgumentException("Пустые строки вводить нельзя!");
            else
                System.out.println(str);
            return str;
        }
    }


