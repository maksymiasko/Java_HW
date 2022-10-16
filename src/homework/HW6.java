package homework;

public class HW6 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    static int taskNumber = 1;
    static int tcNumber = 1;

    public static void printTask() {
        System.out.println("\n----------- Task " + taskNumber++ + " -----------\n");
    }

    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {

            return "Pass";
        }

        return "Fail";
    }

    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {

            return "Pass";
        }

        return "Fail";
    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {

            return "Pass";
        }

        return "Fail";
    }

    public static int randomTwoDigitInt() {

        return (int) ((Math.random() * 79) + 20);
    }

    //Task_1
    public static void print0_9() {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }
    }

    //Task_2
    public static void print10_0() {
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    //Task_3
    public static void print50_55Step2() {
        for (int i = 50; i <= 55; i += 2) {
            System.out.print(i + " ");
        }
    }

    //Task_4
    public static void print327_300() {
        for (int i = 327; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //Task_5
    public static void print12_13() {
        for (double i = 12; i <= 13; i += 0.1) {
            System.out.println(Math.round(i * 10.0) / 10.0);
        }
    }
//    public static void print12_13() {
//        double x = 12.0;
//        for (int i = 12; i < 13; i++) {
//            for (int j = 0; j <= 10; j++) {
//                System.out.print(Math.round(x * 10.0) / 10.0 + " ");
//                x = x + 0.1;
//            }
//        }
//    }

    //Task_6
    public static void print215_237() {
        for (int i = 215; i <= 237; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //Task_7_DeathCode
    public static void print7_14() {
        for (int i = 7; i < 14; i = i + 7) {
            if (i % 7 == 0 || i != 7) {
                System.out.print(i + " ");
            } else {
                System.out.println("Error!");
            }
        }
    }

    //Task_8
    public static void printShortMin_ShortMax() {
        for (int i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //Task_9
    public static void printMinus10_34Colour() {
        for (int i = -10; i <= 34; i++) {
            if (i % 11 == 0 && i != 0) {
                System.out.print(ANSI_BLUE + i + ANSI_RESET + " ");
            } else if (i % 12 == 0 && i != 0) {
                System.out.print(ANSI_RED + i + ANSI_RESET + " ");
            }
            if (i == 0) {
                System.out.print(" ZERO ");
            }
        }
    }

    //Task_10
    public static void printStartStopStep(int start, int end, int step) {
        if (start <= end) {
            for (int i = start; i <= end; i += step) {
                System.out.println(i);
            }
        } else {
            for (int i = end; i <= start; i -= step) {
                System.out.println(i);
            }
        }
    }


    //Task_11
    public static void printChar(char N, char M) {
        for (char i = N; i <= M; i++) {
            System.out.println(i);
        }
    }

    //Task_12L
    public static void printL(int l) {
        for (int i = 0; i <= l * 2; i += 2) {
            System.out.println(i);
        }
    }

    //Task_13
    public static void printPowerOfn(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(Math.pow(2, i));
        }
    }

    //Task_14
    public static void print0_9Sequence() {
        for (int i = 4; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j <= 9; j++) {
                for (int k = i; k < 4; k++) {
                    System.out.print(j);
                }
            }
        }
    }
//    public static void print9999() {
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 0; j <= 9; j++) {
//                for (int h = 1; h <= i; h++) {
//                    System.out.print(j);
//                }
//            }
//        }
//    }

    //Task_15
    public static String printPositiveNegative() {
        StringBuilder outString = new StringBuilder();
        for (int i = 0; i <= 5; i++) {
            if (i != (-1 * i)) {
                outString.append(", ").append(i).append(", ").append(i * (-1));
            } else {
                outString.append(i);
            }
        }

        return outString.toString();
    }

//    public static String printLenDifSign(int n) {
//        String result = "0";
//        for (int i = 1; i <= n; i++) {
//            result = result + ", " + i + ", " + (-i);
//        }
//
//        return result;
//    }


    //Task_16
    //0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
    public static void printIfDiv3or5() {
        int i;
        for (i = 0; i <= 24; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ,");
            }
        }
        System.out.print(i);
    }

    //Task_17
    public static void printOddSequence(int n, int m, int l) {
        // int count = 0;
        int i;
        for (i = n; i <= l * 2 * m; i = i + m) {
            if (i % 2 == 1) {
                System.out.print(i + ", ");
                // count++;
            }
        }
        // System.out.println("\n" + count);
    }

    //Task_18
    public static void printRandomM_L(int n, int m, int l) {
        for (int tempLengh = 0; tempLengh < l; tempLengh++) {
            System.out.print((int) (Math.random() * (m - n + 1)) + n);
            System.out.print(", ");
        }
    }

    //Task_19
//    Сгенерируйте и распечатайте последовательность чисел,
//    где для каждого положительного или отрицательного значения n
//    выводится на печать значение, рассчитанное по формуле: n * n + 1 | 2 * n - 1
//    Для n = 0 и невалидных ситуаций выводится значение 0

    public static void printFormula(double n, int l) {
        for (int i = 0; i <= l; i++) {
            if (n != 0 || (2 * n - 1) == 0) {
                System.out.println(String.valueOf((Math.pow(randomTwoDigitInt(), 2) + 1) / (2 * n - 1)));
            } else {
                System.out.println("0");
            }
        }
    }

    //Task_20
//    Написать метод, который принимает параметры l , n,
//    и печатает последовательность чисел по формуле: Y1 = 1; Y2 = 2; Yn = 2Yn-1 + Yn-2
//    Длина последовательности l.
    public static void printFormulaYn(int l) {
        double y1 = 1;
        System.out.println(y1);
        double y2 = 2;
        System.out.println(y2);
        double yn = 0;
        for (int i = 3; i <= l - 2; i++) {
            yn = 2 * y2 + y1;
            System.out.println(yn);
            y1 = y2;
            y2 = yn;
        }
    }
//    public static void verifyTask20(int l, int n) { //20
//        int y1 = 1;
//        int y2 = 2;
//        int yn = 0;
//        for (int i = 1; l > 0; i++) {
//
//            yn = 2 * y2 + y1;
//            if (i >= n) {
//                System.out.println("y" + i + " = " + y1);
//                l--;
//            }
//            y1 = y2;
//            y2 = yn;
//        }


    //Task_21
    public static void printLess3(int l) {
        for (int i = 0; i < l; i++) {
            int tmpRandom = randomTwoDigitInt();
            if ((tmpRandom - (((int) tmpRandom / 10) * 10)) < 3) {
                System.out.print(tmpRandom + " ");
            }
        }
    }

    // Task_22
//    y = 2.5 * x * x * x + 6 * x * x - 30   if x > 1.5;
//    y = x + 1                              if 0 <= x <= 1.5;
//    y = x                                  if x < 0;
    public static void printFunctionY(double x) {
        if (x > 1.5) {
            System.out.println("y = " + (2.5 * x * x * x + 6 * x * x - 30));
        } else if (x >= 0) {
            System.out.println("y = " + (x + 1));
        } else {
            System.out.println("y = " + x);
        }
    }

    //Task_23
    public static void printSimplePositiveNumb(int l) {
        System.out.println("2\n3\n5\n7");
        for (int i = 11; i < l; i++) {
            if (!(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)) {
                System.out.println(i);
            }
        }
    }
//    //23
//
//    public static void simpleNumbers(int limit) {
//
//        for (int i = 2; i < limit; i++) {
//
//            int counter = 0;
//
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    counter++;
//                }
//            }
//            if (counter == 2) {
//                System.out.print(i + " ");
//            }
//        }
//    }


    //Task_24
//    Написать метод, который принимает на вход параметры
//    day = “Sun”, month = 10, date = 2, и выводит на печать последовательность

    public static void printOctWeek(String day, int month, int date) {

    }

    public static void main(String[] args) {

        /** Task1-----------------------------
         Распечатать последовательность чисел от 0 до 9 включительно
         */
        printTask();

        print0_9();

        /** Task2-----------------------------
         Распечатать последовательность чисел от 10 исключительно до 0 включительно
         */
        printTask();

        print10_0();

        /** Task3-----------------------------
         Распечатать последовательность чисел от 50 до 55 включительно с шагом 2
         */
        printTask();

        print50_55Step2();

        /** Task4-----------------------------
         Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
         */
        printTask();

        print327_300();

        /** Task5-----------------------------
         Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
         */
        printTask();

        print12_13();

        /** Task6-----------------------------
         Распечатать последовательность четных чисел от 215 до 237 включительно
         */
        printTask();

        print215_237();

        /** Task7-----------------------------
         Распечатать последовательность чисел, кратных 7,
         в промежутке от 7 исключительно до 14 исключительно
         */
        printTask();

        //print7_14();

        /** Task8-----------------------------
         Распечатать последовательность которая начинается с минимального значения
         типа данных short и заканчивается максимальным значением short.
         Числа в последовательности должны быть кратны 15001
         */
        printTask();

        printShortMin_ShortMax();

        /** Task9-----------------------------
         Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
         Числа, кратные 11, должны быть распечатаны синим цветом.
         Числа, кратные 12, должны быть распечатаны красным цветом.
         А ноль необходимо распечатать словом ZERO
         */
        printTask();

        printMinus10_34Colour();

        /** Task10-----------------------------
         Написать метод, который принимает на вход параметры start, end, step,
         и печатает последовательность десятичных чисел, начиная с числа start, с шагом step.
         Точка выхода из цикла - число end
         */
        printTask();

        int start = -10;
        int end = 1;
        int step = 2;
        printStartStopStep(start, end, step);

        /** Task11-----------------------------
         Написать метод, который принимает на вход параметры n и m типа char,
         и выводит на печать последовательность букв английского алфавита
         в промежутке между значениями n и m включительно
         */
        printTask();

        char N = 'a';
        char M = 't';
        printChar(N, M);

        /** Task12-----------------------------
         Написать метод, который принимает параметр l и печатает  последовательность
         четных чисел от нуля. Длина последовательности = l
         */
        printTask();

        int l = 10;
        printL(l);

        /** Task13-----------------------------
         Напишите метод, который принимает целое число n,
         и выводит все степени числа 2 от 1 до n включительно
         */
        printTask();

        int n = 10;
        printPowerOfn(n);

        /** Task14-----------------------------
         Вывести последовательность 012345678900112233445566778899000…
         до числа 9999 включительно
         */
        printTask();

        print0_9Sequence();

        /** Task15-----------------------------
         Написать метод, который генерирует последовательность чисел:
         0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
         0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
         Метод формирует строку из сгенерированных значений,
         и выводит результат единожды на печать. Протестировать этот метод
         */
        printTask();
        String expectedResult = "0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5";
        String actualResult = printPositiveNegative();
        verifyEquals(expectedResult, actualResult);
        System.out.println(printPositiveNegative());
        System.out.println(actualResult);

        /** Task16-----------------------------
         Распечатать последовательность чисел:
         0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
         */
        printTask();

        printIfDiv3or5();

        /** Task17-----------------------------
         Написать метод, который принимает параметры n, m, l,
         и печатает последовательность нечетных чисел начиная с числа n, с шагом m,
         длина последовательности l
         */
        printTask();

        n = 2;
        int m = 5;
        l = 10;
        printOddSequence(n, m, l);

        /** Task18-----------------------------
         Написать метод, который принимает на вход параметры n, m, l
         и генерирует последовательность случайных целых чисел в промежутке
         от n до m включительно. Длина последовательности l. Вывести результат на печать
         */
        printTask();

        n = 1;
        m = 10;
        l = 10;
        printRandomM_L(n, m, l);

        /** Task19-----------------------------
         Сгенерируйте и распечатайте последовательность чисел,
         где для каждого положительного или отрицательного значения n
         выводится на печать значение, рассчитанное по формуле: n * n + 1 | 2 * n - 1
         Для n = 0 и невалидных ситуаций выводится значение 0
         */
        printTask();

        n = 55;
        l = 8;
        printFormula(n, l);

        /** Task20-----------------------------
         Написать метод, который принимает параметры l , n,
         и печатает последовательность чисел по формуле: Y1 = 1; Y2 = 2; Yn = 2Yn-1 + Yn-2
         Длина последовательности l.
         */
        printTask();

        n = 2;
        l = 10;
        printFormulaYn(l);

        /** Task21-----------------------------
         Сгенерируйте последовательность целых положительных двузначных чисел,
         в которых разница между первой цифрой (десятки) и второй цифрой (единицы)
         не превышает 3
         */
        printTask();

        l = 50;
        printLess3(l);

        /** Task22-----------------------------
         Написать метод, вычисляющий значение функции
         y = 2.5 * x * x * x + 6 * x * x - 30   if x > 1.5;
         y = x + 1                              if 0 <= x <= 1.5;
         y = x                                  if x < 0;
         */
        printTask();

        double x = 1.5001;
        printFunctionY(x);

        x = 0;
        printFunctionY(x);

        x = -0.0001;
        printFunctionY(x);

        /** Task23-----------------------------
         Написать метод, который генерирует последовательность простых положительных чисел
         и выводит последовательность на печать
         */
        printTask();

        l = 200;
        printSimplePositiveNumb(l);

        /** Task24-----------------------------
         Написать метод, который принимает на вход параметры
         day = “Sun”, month = 10, date = 2, и выводит на печать последовательность
         */
        printTask();


    }
}


