package homework;

import static java.lang.Double.sum;
import static java.lang.Short.compareUnsigned;

public class HW3 {

    public static void main(String[] args) {

    int taskNo = 1;
    String line = "__________________________________________________________________________________________________";
/*
    В пакете homework создать класс HW3, всю работу выполнять в этом классе.
    Все задания из домашней работы, начиная с номера 2, должны быть распечатаны с номером задания: Task 2
    3
    -5
    b = 100
    Если необходимо выбрать тип переменных:
    выбираем тип данных с минимально достаточным диапазоном значений, если точность не важна
    выбираем тот тип, который позволяет хранить максимально точное значение, если точность важна

*/
        //Task 2
        //Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.

        System.out.println(" Task " + ++taskNo + "\n");

        byte a = 30;
        byte b = 40;

        System.out.println("byte a = " + a);
        System.out.println("byte b = " + b);
        System.out.println(line);

        //Task 3
        //Создать переменные s и t типа short, присвоить им значения с разницей 60000.

        System.out.println(" Task " + ++taskNo + "\n");

        short s = 1000;
        short t = 7000;

        System.out.println("short s = " + s);
        System.out.println("short t = " + t);
        System.out.println(line);

        //Task 4
        //Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
        //Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы

        Integer i = 0;// = -2147483648;

        System.out.println(" Task " + ++taskNo + "\n");
        System.out.println("-----------------------------");
        System.out.println("|\t" + "int min\t" + "|\t" + i.MIN_VALUE + "\t|");
        System.out.println("-----------------------------");
        System.out.println("|\t" + "int max\t" + "|\t" + i.MAX_VALUE + "\t|");
        System.out.println("-----------------------------");
        System.out.println(line);

        //Task 5
        //Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны и города
        //(можно ненастоящий номер телефона, например, 18009998877)

        System.out.println(" Task " + ++taskNo + "\n");

        long phoneNumber = 18009998877L;

        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println(line);

        //Task 6
        //Создать переменную f типа float и присвоить ей значение 100.101101.
        //Создать переменную d типа double и присвоить ей значение 100.101101.
        //Распечатать результат в виде таблицы

        System.out.println("Task " + ++taskNo + "\n");

        float f = 100.101101F;
        double d = 100.101101;

        System.out.println("---------------------------------------------");
        System.out.println("|\t" + "float f = 100.101101\t" + "|\t" + f + "\t|");
        System.out.println("---------------------------------------------");
        System.out.println("|\t" + "double d = 100.101101\t" + "|\t" + d + "\t|");
        System.out.println("---------------------------------------------");
        System.out.println(line);

        //Task 7
        // a) Создать переменную типа Double с именем dd  и инициализировать её результатом
        // суммы чисел 10.09999 и 20.099999.

        System.out.println("Task " + ++taskNo + "\n");
        {
            Double dd = 10.09999 + 20.099999;
            System.out.println("a) Double dd = " + dd);

            // b) Создать переменную типа Float с именем ff  и инициализировать её результатом
            // суммы чисел 10.09999 и 20.099999.
            Float ff = 10.09999F + 20.099999F;

            System.out.println("b) Float ff = " + ff);
        }
        System.out.println(line);


        //Task 8
        //Создать переменную float ff и присвоить ей значение выражения 10 / 3.
        //Создать переменную double dd и присвоить ей значение выражения 10 / 3.
        //Добиться максимальной точности начений вычислений и распечатать результаты.

        System.out.println("Task " + ++taskNo + "\n");
        float ff = (10 / 3F);
        double dd = (10 / 3.0);
        System.out.println("float ff = " + ff);
        System.out.println("double dd = " + dd);
        System.out.println(line);


        //Task 9
        //Создать переменные типа Float:
        //floatSum
        //floatSub (substraction)
        //floatProduct
        //floatQuotient
        //floatRemainder
        //и присвоить им значения, вычисленные с помощью переменных f и ff.

       // System.out.println("Task " + ++taskNo + "\n");
        Float floatSum = f + ff;
        Float floatSub = f - ff;
        Float floatProduct = f * ff;
        Float floatQuotient = f /ff;
        Float floatRemainder = f % ff;
        //System.out.println(line);

        //Task 10
        //Создать переменные типа double:
        //doubleSum
        //doubleSub
        //doubleProduct
        //doubleQuotient
        //doubleRemainder
        //и присвоить им значения, вычисленные с помощью переменных d и dd.

        double doubleSum = d + dd;
        double doubleSub = d - dd;
        double doubleProduct = d * dd;
        double doubleQuotient = d / dd;
        double doubleRemainder = d % dd;

        //Task 11
        //Распечатать результаты вычислений заданий 8 - 10 в виде таблицы

        taskNo = 10;
        System.out.println("Task " + ++taskNo + "\n");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("|\t" + "f = " + f + "\t" + "|\t" + "ff = " + ff + "\t|\t" + "d = " + d + "\t" + "|\t" + "dd = " + dd + "\t|");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("|\t" + "floatSum = " + floatSum + "\t\t\t\t|\t" + "doubleSum = " + doubleSum + "\t\t\t\t|");
        System.out.println("|\t" + "floatSub = " + floatSub + "\t\t\t\t\t|\t" + "doubleSub = " + doubleSub + "\t\t\t\t|");
        System.out.println("|\t" + "floatProduct = " + floatProduct + "\t\t\t|\t" + "doubleProduct = " + doubleProduct + "\t\t\t|");
        System.out.println("|\t" + "floatQuotient = " + floatQuotient + "\t\t\t|\t" + "doubleQuotient = " + doubleQuotient + "\t\t\t\t\t|");
        System.out.println("|\t" + "floatRemainder = " + floatRemainder + "\t\t\t|\t" + "doubleRemainder = " + doubleRemainder + "\t\t|");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(line);


        //Task 12
        //Распечатать слова HELLO JAVA точками (чтобы получился рисунок точками)

        System.out.println("Task " + ++taskNo + "\n");
        System.out.println(" .\t .\t .....\t . \t\t . \t\t  ...\t\t   ...\t   .\t .\t .\t   .  ");
        System.out.println(" .\t .\t .    \t . \t\t . \t\t .\t .\t\t     .\t .\t .\t .\t .\t .\t . ");
        System.out.println(" .\t .\t .    \t . \t\t . \t\t .\t .\t\t     .\t .\t .\t .\t .\t .\t .");
        System.out.println(" .....\t .....\t . \t\t . \t\t .\t .\t\t     .\t .....\t .\t .\t .....");
        System.out.println(" .\t .\t .    \t . \t\t . \t\t .\t .\t\t     .\t .\t .\t .\t .\t .\t .");
        System.out.println(" .\t .\t .    \t . \t\t . \t\t .\t .\t\t .   .\t .\t .\t .\t .\t .\t .");
        System.out.println(" .\t .\t .....\t ..... \t .....\t  ...  \t\t  ... \t .\t .\t   .\t .\t .");
        System.out.println(line);

        //Task 13
        //Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений)
        //t1 = 0;
        //t2 = 150;
        //t3 = -120;
        //t4 = - 505.505;
        //t5 = 100100;
        //t6 = 100010001000;
        //t7 = 2.66666666666666;
        //t8 = - 1000000.001;
        //t9 = 1010;
        //Распечатать значения всех переменных.

        System.out.println("Task " + ++taskNo + "\n");

        Byte t1 = 0;
        Short t2 = 150;
        Short t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Float t8 = - 1000000.001F;
        Short t9 = 1010;

        System.out.println("Byte t1 = \t" + t1 );
        System.out.println("Short t2 = \t" + t2 );
        System.out.println("Short t3 = \t" + t3 );
        System.out.println("Float t4 = \t" + t4 );
        System.out.println("Integer t5 = \t" + t5 );
        System.out.println("Long t6 = \t" + t6 );
        System.out.println("Double t7 = " + t7 );
        System.out.println("Float t8 = \t" + t8 );
        System.out.println("Short t9 = \t" + t9 );
        System.out.println(line);


        //Task 14
        //С помощью полей классов ссылочного типа распечатать таблицу

        System.out.println("Task " + ++taskNo + "\n");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("|\t" + "Type \t" + "\t|\t" + "Size in bits \t|\t" + "min \t" + "\t\t\t\t|\t" + "max \t\t\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("|\t" + "byte \t" + "\t|\t" + (t1.SIZE)+ "\t\t\t\t|\t" + (t1.MIN_VALUE) + "\t\t\t\t\t|\t" + (t1.MAX_VALUE) + "\t\t\t\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("|\t" + "short \t" + "\t|\t" + (t2.SIZE)+ "\t\t\t\t|\t" + (t2.MIN_VALUE) + "\t\t\t\t\t|\t" + (t2.MAX_VALUE) + "\t\t\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("|\t" + "int \t" + "\t|\t" + (t5.SIZE)+ "\t\t\t\t|\t" + (t5.MIN_VALUE) + "\t\t\t\t|\t" + (t5.MAX_VALUE) + "\t\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("|\t" + "long \t" + "\t|\t" + (t6.SIZE)+ "\t\t\t\t|\t" + (t6.MIN_VALUE) + "\t|\t" + (t6.MAX_VALUE) + "\t\t|");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("|\t" + "float \t" + "\t|\t" + (t4.SIZE)+ "\t\t\t\t|\t" + (t4.MIN_VALUE) + "\t\t\t\t\t|\t" + (t4.MAX_VALUE) + "\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("|\t" + "double \t" + "\t|\t" + (t7.SIZE)+ "\t\t\t\t|\t" + (t7.MIN_VALUE) + "\t\t\t\t|\t" + (t7.MAX_VALUE) + "\t|");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(line);


        //Task 15
        //Создать 2 переменные референсного типа Integer - num1 и num2,
        // присвоить им одинаковые значения, сравнить 2 переменные друг с другом с помощью метода .equals().
        // Вывести результат сравнения на печать в виде выражения:
        //“Если num1 равно  num2, то результат сравнения методом .equals() = …”
        //Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
        //“Если num1 не равно num2, то результат сравнения методом .equal = …”

        System.out.println("Task " + ++taskNo + "\n");

        Integer num1 = 5, num2 = 5;
        System.out.println("Если num1 равно num2, то результат сравнения методом .equals() = " + num1.equals(num2));
        num2 = 7;
        System.out.println("Если num1 не равно num2, то результат сравнения методом .equals() = " + num1.equals(num2));
        System.out.println(line);


        //Task 16
        //Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
        //а) одинаковыми значениями
        //b) number1 < number2
        //c) number1 > number2
        //сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет - не equals() !),
        // и вывести результаты сравнения на печать в виде выражений:
        //“Если number1 = number2, то результат сравнения методом … = …”
        //“Если number1 < number2, то результат сравнения методом … = …”
        //“Если number1 > number2, то результат сравнения методом … = …”

        System.out.println("Task " + ++taskNo + "\n");
        int number1 = 10;
        int number2 = 10;
        System.out.println("Если number1 = number2, то результат сравнения методом Integer.compare(number1,number2) = " + Integer.compare(number1,number2));
        number2 = 11;
        System.out.println("Если number1 < number2, то результат сравнения методом Integer.compare(number1,number2) = " + Integer.compare(number1,number2));
        number2 = 9;
        System.out.println("Если number1 > number2, то результат сравнения методом Integer.compare(number1,number2) = " + Integer.compare(number1,number2));
        System.out.println(line);


        //Task 17
        //Создать переменную типа Float, присвоить ей значение 234.9999, распечатать значение переменной в int

        System.out.println("Task " + ++taskNo + "\n");
        Float fl = 234.9999F;
        System.out.println(fl.intValue());
        System.out.println(line);


        //Task 18
        //С помощью метода sum() класса Double посчитать сумму двух переменных типа double.

        System.out.println("Task " + ++taskNo + "\n");
        double db1 = 10.123;
        double db2 = 8.123;
        System.out.println("Сумма " + db1 +" и " + db2 + " = " + Double.sum(db1,db2));
        System.out.println(line);


        //Task 19
        //С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.

        System.out.println("Task " + ++taskNo + "\n");
        Float fi1 = 10.123F;
        Float fi2 = 8.123F;
        System.out.println("Сумма " + fi1 +" и " + fi2 + " = " + Integer.sum(fi1.intValue(),fi2.intValue()));
        System.out.println(line);


        //Task 20
        //Создать 2 переменные типа Short:
        //short1 = 12000
        //short2 = 12300
        //Распечатать фразу: “12000 - 12300 = -300”
        //где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
        //Присвоить переменной short1 значение 12500, вывести фразу:
        //“12500 - 12300 = 200”
        //где значение 200 выведено с помощью метода класса Short, а не операцией вычисления

        System.out.println("Task " + ++taskNo + "\n");
        Short short1 = 12000;
        Short short2 = 12300;
        System.out.println(short1 + " - " + short2 + " = "+ compareUnsigned(short1, short2)); //1 st method
        short1 = 12500;
        System.out.println(short1 + " - " + short2 + " = "+ Short.compare(short1, short2)); //2 st method
        System.out.println(line);


        //Task 21
        //Создать переменные:
        //String str1 = "123.56";
        //String str2 = "123.55";
        //Double doub1 = 123.56;
        //Double doub2 = 123.55;
        //Распечатать результат doub1 - doub2
        //Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
        //Сравнить полученные результаты doub1 - doub2 и str1 - str2

        System.out.println("Task " + ++taskNo + "\n");

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        System.out.println("doub1 - doub2 = " + (doub1 - doub2));
        System.out.println("str1 - str2 = " + (Double.valueOf(str1) - Double.valueOf(str1)));
        System.out.println("str1 - str2 = " + (Double.parseDouble(str1) - Double.parseDouble(str2)));
        System.out.println(line);


        //Task 22
        //Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
        //(значения температуры в Цельсиях). Присвоить этой переменной сначала максимальное значение 39,2
        //затем минимальное значение 28,7. Посчитать и распечатать среднее значение.
        //Распечатать результат среднего значения температуры тела кота.

        System.out.println("Task " + ++taskNo + "\n");
        float maxTemp = 39.2F;
        float minTemp = 28.7F;
        System.out.println("Средняя температура тела кота : " + (maxTemp + minTemp) / 2 + " C " );
        System.out.println(line);


        //Task 23
        //byte, double, float, int, long, and short
        //Создать переменную n типа Number, присвоить ей максимально возможное значение.
        //Присвоить n значение 10,
        //затем присвоить n значение 10.999999999
        //Распечатать результаты в виде выражения:
        //“Переменная n может принимать значения:
        //n =  …
        //n =  …
        //n =  …
        //Это возможно, потому что …”

        System.out.println("Task " + ++taskNo + "\n");

        Number n = t6.MAX_VALUE;

        System.out.println("Переменная n может принимать значения : ");
        System.out.println("n = " + n );

        n = 10;

        System.out.println("n = " + n );

        n = 10.999999999;

        System.out.println("n = " + n );
        System.out.println("Это возможно, потому что : The abstract class Number is the superclass of platform classes\n" +
                "representing numeric values that are convertible to the primitive types byte, double, float, int, long, and short");
        System.out.println(line);


        //Task 23
        //Создать переменную Integer numberInteger = 100.
        //Доказать, что numberInteger имеет тип Integer,
        //а numberInteger.toString() имеет тип String.


        //Task 24
        //Вывести на экран следующие выражения, используя для печати только переменные:
        //“50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам
        //“100 meters = … miles,  100 miles = … meters”, где значения должны быть вычислены по формулам

        ++taskNo;
        System.out.println("Task " + ++taskNo + "\n");
        System.out.println("50 kilogram = " + (50 * 2.20462262185) + "lbs ,\t50 lb = " + (50 / 2.20462262185) + " kg");
        System.out.println("100 meters = " + (100 * 0.00062137) + "miles ,\t100 miles = " + (100 / 0.00062137) + " meters");
        System.out.println(line);


        //Task 26
        //На сайте погоды https://openweathermap.org/ найти в документации и распечатать,
        // какие коды соответствуют следующим состояниям погоды:
        //… - thunderstorm with heavy rain
        //… - overcast clouds: 85-100%
        //… - Shower sleet

        System.out.println("Task " + ++taskNo + "\n");


    }

}
