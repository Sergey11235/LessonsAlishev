package Lesson11;

public class Arrays {
    public static void main(String[] args) {
        int number = 10; // примитивный тип данных это коробка, а внутри значение [10}
        int[] numbers = new int[5];
        /*      char character = 'a'; // примитивный тип данных
        String s = "Hello"; // String это класс, a "Hello" это объект класса String
        // Но строку можно создать и другим способом
        String s1 = new String("Hello");
        int[] numbers = new int[5]; // переменная numbers -> [массив]
        System.out.println(numbers[0]); // 0 1 2 3 4
       // System.out.println(number[5]); - не можем*/
        /*numbers[0] = 10;
        numbers[1] = 20;*/
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1,2,3};
        for(int i = 0; i<numbers.length; i++)
            System.out.println(numbers1[i]);
    }
}
