package test;

public class Lesson_Exceptions {

    public static void main(String[] args) {


        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
            // блок кода который мы тестируем
        } catch (Exception e) {
            System.out.println("Мы вылезли из границ массива");
            // блок кода для обработки нашего исключения
        } finally {
            System.out.println("Работает всегда");
        }

    }
}
