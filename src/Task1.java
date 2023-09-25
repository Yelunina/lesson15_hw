/*
Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
Выполните сортировку полученного массива. Попало ли число 0 в этот массив? (выяснить с помощью binary search) Если да, то на какое место (индекс) в массиве?
Если нет, то на какой индекс его следует поставить?
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        fillArray(arr, -100, 100);
        printArray(arr);

        bubbleSort(arr);
        printArray(arr);
        int number = binarySearch(arr,0);
        System.out.println(number);


    }
    public static int binarySearch(int[] arr, int value) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (value > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -l - 1;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void fillArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
