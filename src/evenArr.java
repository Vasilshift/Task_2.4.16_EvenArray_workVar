//Напишите метод evenArray который принимает целое число типа int и возвращает массив заполненный четными числами от 1 до этого числа.
//        Пример ввода: 8
//        Пример вывода: [2,4,6,8]
import java.util.Arrays;
import java.lang.System.*;
import java.util.Scanner;
public class SortEvenArray {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(evenArray(10)));

    }
    public static int[] evenArray(int number) {
        int[] array = new int[number+1];
        for(int j = 1; j < array.length; j++){
            array[j] = j;
        }

        int[] arraysort = new int[number/2];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0 ) {
                arraysort[index] = i;
                index++;
            }
        }
        return arraysort;
    }
}