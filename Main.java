import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        int input = -1;
        System.out.println("Введите случайное число больше нуля для угадывания: ");
        while (input != randomNumber){
            input = scanner.nextInt();
            if (input <= 0) System.out.println("Ввели неправильное число!!!");
            else if (input == randomNumber) System.out.println("Вы угадали! Поздравляю!");
            else {
                System.out.println("Вы неугадали( Попробуйте еще раз");
                continue;
            }
        }
    }
}