package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        int[] array = createArray();
        int min = minValue(array);
        int average = averageValue(array);
        System.out.println("Сумма минимального значения и среднего арифметического = " + (min + average));

    }
    static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение = " + min);
        return min;
    }
    static int averageValue(int[] array){
        int sum = 0;
        int average = 0;
        for (int i = 0; i <= (array.length - 1); i++){
            sum += array[i];
            average = sum / array.length;
        }
        System.out.println("Среднее арифметическое = " + average);
        return average;
    }
    public static int[] createArray(){
        Scanner in = new Scanner(System.in);
        int length = 15;
        int[] array = new int[length];
        System.out.println("Заполните массив");
        for (int i = 0; i < 15; i++){
            System.out.print("Введите " + i + " элемент: ");
            array[i] = in.nextInt();
        }
        System.out.println("Вы создали массив: ");
        System.out.println(Arrays.toString(array));
        return array;
    }
}
