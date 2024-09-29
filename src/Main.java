import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //задача1
        int[] salary = {1500, 2000, 500, 3000, 4000};
        int spending = 0;
        for (int element : salary) {
            spending = spending + element;
        }
        System.out.println("Сумма трат за месяц составила " + spending + " рублей");
        // задача 2
        int[] salary1 = {1500, 2000, 500, 3000, 4000};
        int minSpending = salary1[0];
        int maxSpending = salary1[0];
        for (int element : salary1) {
            if (element < minSpending) {
                minSpending = element;
            }
            if (element > maxSpending) {
                maxSpending = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpending + " рублей. Максимальная сумма трат за неделю составила " + maxSpending + " рублей");
        // задача 3
        int[] salary2 = {1500, 2000, 500, 3000, 4000};
        int spending1 = 0;
        int numberWeeks = 5;
        for (int element : salary2) {
            spending1 = spending1 + element;
        }

        double averageSpending = (double) spending1 / numberWeeks;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей");
        // задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}






