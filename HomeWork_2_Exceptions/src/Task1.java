import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        boolean num = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(num){
            System.out.print("Введите дробное число: ");
            try{
                float number = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное число равно %f\n", number);
                num = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число");
            }

        }
    }
}