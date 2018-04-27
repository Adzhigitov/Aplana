import java.text.DecimalFormat;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) {

        int action;

        Scanner Calc = new Scanner(System.in);

        /*DecimalFormat используется для удаления лишних нулей после запятой и отображению 4 цифр после запятой.*/
        DecimalFormat f = new DecimalFormat("0.####");

        System.out.println("Это китайский калькулятор");

        try { // Оборачиваем код в блок tru и catch для вывода ошибки при некореектном вводе значения.
            System.out.print("Введите первое число: ");
            double first = Calc.nextDouble();

            System.out.print("Выберите действие: ");
            String result = Calc.next();

            System.out.print("Введите второе число: ");
            double second = Calc.nextDouble();

            action = (int) result.charAt(0);

            Calc.close();

            switch (action) { // Оператор switch используем для разбиения программы на ветки +,-,*,/.
                case '+':
                    System.out.print("Сумма = ");
                    System.out.println(f.format(first + second)); break;
                case '-':
                    System.out.print("Сумма = ");
                    System.out.println(f.format(first - second)); break;
                case '*':
                    System.out.print("Сумма = ");
                    System.out.println(f.format(first * second)); break;
                case '/':
                    if (second != 0) {
                    System.out.print("Сумма = ");
                    System.out.println(f.format(first / second)); break;
                    }
                default:
                    System.err.format("Ошибка при выборе действия. На ввод доступны только знаки +, -, *, /."); break;
            }
        }
        catch (java.util.InputMismatchException e)
        {
         System.err.format("Некорректная операция. На ввод доступны только цифры и запятые для дробных чисел.");
        }
    }
}