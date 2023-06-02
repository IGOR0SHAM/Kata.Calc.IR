import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите пример: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws IOException {
        String res = new String();
        if (input.length() == 1) {
            throw new IOException("В операции должно быть более одного символа");
        }
        if (input.contains("+")) {
            String[] numbers = input.split("\\+");
            int a, b;
            if (input.contains("I") || input.contains("V") || input.contains("X")) {
                a = RomanConvert.romanToArabic(numbers[0]);
                b = RomanConvert.romanToArabic(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    res = ("Ответ: " + ArabicConvert.arabicToRoman(a + b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }

            } else {
                a = Integer.parseInt(numbers[0]);
                b = Integer.parseInt(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    res = ("Ответ: " + (a + b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            }
        } else if (input.contains("-")) {
            String[] numbers = input.split("\\-");
            int a, b;
            if (input.contains("I") || input.contains("V") || input.contains("X")) {
                a = RomanConvert.romanToArabic(numbers[0]);
                b = RomanConvert.romanToArabic(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    res = ("Ответ: " + ArabicConvert.arabicToRoman(a - b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            } else {
                a = Integer.parseInt(numbers[0]);
                b = Integer.parseInt(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    res = ("Ответ: " + (a - b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            }
        } else if (input.contains("*")) {
            String[] numbers = input.split("\\*");
            int a, b;
            if (input.contains("I") || input.contains("V") || input.contains("X")) {
                a = RomanConvert.romanToArabic(numbers[0]);
                b = RomanConvert.romanToArabic(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    res = ("Ответ: " + ArabicConvert.arabicToRoman(a * b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            } else {
                a = Integer.parseInt(numbers[0]);
                b = Integer.parseInt(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    res = ("Ответ: " + (a * b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            }
        } else if (input.contains("/")) {
            String[] numbers = input.split("\\/");
            int a, b;
            if (input.contains("I") || input.contains("V") || input.contains("X")) {
                a = RomanConvert.romanToArabic(numbers[0]);
                b = RomanConvert.romanToArabic(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    res = ("Ответ: " + ArabicConvert.arabicToRoman(a / b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            } else {
                a = Integer.parseInt(numbers[0]);
                b = Integer.parseInt(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    res = ("Ответ: " + (a / b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            }
        }
        return res;
    }
}