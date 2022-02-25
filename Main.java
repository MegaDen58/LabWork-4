package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {14, 43, 4, 9, 3, 31, 2, 13, 3, 4, 11, 54, 3, 55, 7};
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
}
