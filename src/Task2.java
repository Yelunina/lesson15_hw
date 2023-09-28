/*
Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
Реализуйте метод, который получает на вход исходный массив и возвращает массив,
 содержащий только положительные числа из исходного массива.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        fillArray(arr, -100, 100);
        printArray(arr);
        int[] arr1 = positiveNumbersArray(arr);
        printArray(arr1);

    }

    public static int[] positiveNumbersArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr1[i] = arr[i];
            }
        }
        return arr1;
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
