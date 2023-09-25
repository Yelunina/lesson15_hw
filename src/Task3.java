/*
Реализовать способ обмена значениями двух переменных целого типа,
не используя третьей переменной. В идеале написать метод swap(a, b).
 */
public class Task3 {
    public static void main(String[] args) {

        exchangeOfValuesTwoVariables(10, 20);
        System.out.println();
        exchangeOfValuesTwoVariables1(10, 20);
        System.out.println();
        exchangeOfValuesTwoVariables2(13, 20);
        System.out.println();
        exchangeOfValuesTwoVariables3(13, 20);
        System.out.println();
        exchangeOfValuesTwoVariables4(13, 20);
        System.out.println();
        exchangeOfValuesTwoVariables5(10, 5);


    }

    public static void exchangeOfValuesTwoVariables(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a= " + a + "\n" + "b= " + b);
    }

    public static void exchangeOfValuesTwoVariables1(int a, int b) {

        a = a + b - (b = a);
        System.out.println("a= " + a + "\n" + "b= " + b);
    }

    public static void exchangeOfValuesTwoVariables2(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a= " + a + "\n" + "b= " + b);
    }

    public static void exchangeOfValuesTwoVariables3(int a, int b) {

        a = a * b / (b = a);
        System.out.println("a= " + a + "\n" + "b= " + b);
    }

    public static void exchangeOfValuesTwoVariables4(int a, int b) {
        a = a - b;
        b = a + b;
        a = -a + b;
        System.out.println("a= " + a + "\n" + "b= " + b);
    }

    public static void exchangeOfValuesTwoVariables5(int a, int b) {
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("a= " + a + "\n" + "b= " + b);
    }
}
