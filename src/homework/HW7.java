package homework;

import java.util.Arrays;

public class HW7 {

    static int taskNumber = 1;

    public static void printTask() {
        System.out.println("\n----------- Task " + taskNumber++ + " -----------\n");
    }

    //Task_1
    public static String returnMonth(int month) {
        switch (month) {
            case 1:
                return "January";

            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";

            default:
                return "Invalid month";
        }
    }

    //Task_2
    public static void printStartStopStep(int start, int end, int step) {
        int stepMax = Math.max(Math.abs(start), Math.abs(end));
        if (start != end) {
            if (stepMax >= step) {
                if (step > 0) {
                    if (start <= end) {
                        for (int i = sequenseStart(start, end, step); i <= end; i += step) {
                            System.out.println(i);
                        }
                    } else {
                        for (int i = sequenseStart(start, end, step); i >= end; i -= step) {
                            System.out.println(i);
                        }
                    }
                } else {
                    System.out.println("Error : step must be positive int");
                }
            } else {
                //throw new IllegalArgumentException("Error : step must be less than " + stepMax);
                System.out.println("Error : step must be less than " + stepMax);
            }
        } else {
            System.out.println("Error : start of sequence " + start + " is equal end of sequence " + end);
        }
    }

    public static int sequenseStart(int start, int end, int step) {
        int tmpStart = start;
        while (tmpStart % step != 0) {
            if (tmpStart < end) {
                tmpStart = tmpStart + 1;
            } else {
                tmpStart = tmpStart - 1;
            }
        }

        return tmpStart;
    }

//    public static int sequenseLenght(int start, int end) {
//        int tmpSeqLenght = 0;
//        if ((start >= 0 && end >= 0) || (start < 0 && end < 0)) {
//            tmpSeqLenght = Math.abs(start + end);
//        } else {
//            tmpSeqLenght = Math.abs(start) + Math.abs(end);
//        }
//
//        return tmpSeqLenght;
//    }

    //Task_21
    public static int[] ArrayOfIntLess6(int l) {
        int[] arrayIntLess6 = new int[l];
        for (int i = 0; i < l; i++) {
            arrayIntLess6[i] = (int) (Math.random() * 7);
        }

        return arrayIntLess6;
    }

    //Task_22
    public static void printArrayAvg(int[] inputArray) {
        int avgCatsAge = 0;
        for (int j : inputArray) {
            avgCatsAge = avgCatsAge + j;
        }
        System.out.println("Средний возраст котов " + Math.round(avgCatsAge / inputArray.length) + " лет");
    }

    //Task_23
    public static int[] arrayStartStop(int start, int stop) {
        int[] arrayToReturn = new int[(Math.abs(start) -Math.abs( stop)) /2];
            for (int i = 0, j = start + 1; i < arrayToReturn.length ; i++, j = j + 2) {
                arrayToReturn[i] = j;
        }

        return arrayToReturn;
    }

    //Task_24
    public static int[] randomArrayOfInt(int start, int stop, int lenght) {
        int[] arrayToReturn = new int[lenght];
        for (int i = 0; i < arrayToReturn.length; i++) {
            arrayToReturn[i] = (int) (Math.random() * Math.abs(start - stop) + 1) + start;
        }

        return arrayToReturn;
    }

    //Task_25
    public static void isNumberInArrayOfInt(int[] inputArray, int number) {
        int tmp = 0;
        int tmp2 = 0;
        for (int j : inputArray) {
            if (j == number && tmp == 0) {
                System.out.println(j + " yes");
                tmp = 1;
            } else if (j == number + 1 || j == number - 1) {
                System.out.println(j + " maybe");
                tmp2 = 1;
            }
        }
        if (tmp == 0 && tmp2 == 0) {
            System.out.println("no");
        }
    }

    //Task_26
    public static void twoArrays(int[] inputArray) {
        int lenghtEven = 0;
        int lenghtOdd = 0;
        for (int value : inputArray) {
            if (value % 2 == 0) {
                lenghtEven = lenghtEven + 1;
            } else {
                lenghtOdd = lenghtOdd + 1;
            }
        }
        int[] arrayEven = new int[lenghtEven];
        int[] arrayOdd = new int[lenghtOdd];
        for (int i = 0, j = 0, k = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0) {
                arrayEven[j++] = inputArray[i];
            } else {
                arrayOdd[k++] = inputArray[i];
            }
        }
        System.out.println("Even " + Arrays.toString(arrayEven));
        System.out.println("Odd " + Arrays.toString(arrayOdd));
    }

    //Task_27
    public static void catsFullArray(String[] catsName, int[] catsAges, String[] catsColour) {
        int k = 0;
        String[][] catsFullArray = new String[3][8];
        for (int i = 0; i < catsName.length; i++) {
            catsFullArray[k][i] = catsName[i];
            catsFullArray[k + 1][i] = String.valueOf(catsAges[i]);
            catsFullArray[k + 2][i] = catsColour[i];
        }
        for (int i = 0; i < catsName.length; i = i + 2) {
            System.out.print(catsFullArray[k][i] + "\t");
            System.out.print(catsFullArray[k + 1][i] + "\t");
            System.out.print(catsFullArray[k + 2][i]);
            System.out.println();
        }

    }


    public static void main(String[] args) {
        /* Task1-----------------------------
         Прочитать ссылку про оператор switch в документации Oracle,
         посмотреть видео (ссылки в презентации), и переписать  методы returnMonth(),
         returnDayOfTheWeek() с помощью оператора switch.
         */

        printTask();

        int month = 12;
        System.out.println(returnMonth(month));

        /* Task2-----------------------------
         Написать универсальный метод для построения последовательности,
         которая начинается с числа start, заканчивается числом end (оба включительно).
         Все числа в этой последовательности должны быть кратны числу step.
         Этот метод должен высчитывать первое кратное число в диапазоне [start, end]
         и строить последовательность (возрастающую или убывающую)
         от вычисленного первого кратного числа с шагом step.
         (Эта задача по мотивам разбора HW6,  Part 1  в воскресенье 9 октября)
         */

        printTask();

        int start = -50;
        int end = 0;
        int step = 3;

        printStartStopStep(start, end, step);

        /* Task3-----------------------------
         Создать массив catsNames[], заполнить его любыми своими значениями.
         */

        printTask();

        String[] catsNames = {"Barry", "Blacky", "Gregg", "Graham", "Reddy", "Smoke", "Ping", "Cara"};

        System.out.println(Arrays.toString(catsNames));

        /* Task4-----------------------------
         В массиве catsNames[] изменить значение элемента с индексом 4 на “Рыжик”,
         а значение элемента с индексом 1 на “Черныш”
         */

        printTask();

        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";

        System.out.println(Arrays.toString(catsNames));


        /* Task5-----------------------------
         Создать массив catsColors[] и заполнить его значениями (см картинку в презентации)
         */

        printTask();

        String[] catsColors = {"Grey", "Black", "Grey", "Green", "Red", "Grey", "Red", "Grey"};

        System.out.println(Arrays.toString(catsColors));

        /* Task6-----------------------------
         Создать массив catsAges[] и заполнить его любыми целочисленными валидными значениями.
         */

        printTask();

        int[] catsAges = new int[]{3, 8, 8, 5, 7, 6, 2, 1};

        System.out.println(Arrays.toString(catsAges));

        /* Task7-----------------------------
         Создать массив isCatRed[] и заполнить его соответствующими значениями
         (см картинку в презентации. Red = рыжий)
         */

        printTask();

        boolean[] isCatRed = new boolean[8];

        for (int i = 0; i < isCatRed.length; i++) {
            if (catsColors[i].equals("Red")) {
                isCatRed[i] = true;
            }
        }
        System.out.println(Arrays.toString(isCatRed));

        /* Task8-----------------------------
         Распечатать для массивов catsNames[] и catsColors[]:
         */

        printTask();

        // a) имя кота в коробке с номером 6
        System.out.println("a) " + catsNames[6]);

        // b) имена котов из коробок с четными индексами
        System.out.print("b) ");
        for (int i = 0; i < catsNames.length; i += 2) {
            System.out.print(catsNames[i] + " ");
        }

        // c) имена котов из коробок, чьи индексы кратны 4
        System.out.println();
        System.out.print("c) ");
        for (int i = 0; i < catsNames.length; i += 4) {
            System.out.print(catsNames[i] + " ");
        }

        // d) цвет котов из коробок с нечетными индексами
        System.out.println();
        System.out.print("d) ");
        for (int i = 1; i < catsColors.length; i += 2) {
            System.out.print(catsColors[i] + " ");
        }

        // f) цвет котов из коробок, чьи индексы кратны 3, но не кратны 2
        System.out.println();
        System.out.print("f) ");
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.print(catsColors[i] + " ");
            }
        }

        /* Task9-----------------------------
         Распечатать “Накорми кота!” для всех серых котов
         */

        printTask();

        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey"))
                System.out.println(catsColors[i] + " Накорми кота! " + catsNames[i]);
        }

        /* Task10-----------------------------
         Распечатать “Дай коту воды!” для всех котов со значениями true из массива isCatRed[]
         */

        printTask();

        for (int i = 0; i < isCatRed.length; i++) {
            if (isCatRed[i]) {
                System.out.println(isCatRed[i] + " Дай коту воды!");
            }
        }

        /* Task11-----------------------------
         Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
         */

        printTask();

        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.println(catsAges[i] + " год. Отнеси кота на прививку!");
            }
        }

        /* Task12-----------------------------
         Для кота в последней коробке распечатать имя, цвет, возраст
         */

        printTask();

        System.out.println(catsNames[catsNames.length - 1] + " "
                + catsColors[catsColors.length - 1] + " " + catsAges[catsAges.length - 1]);

        /* Task13-----------------------------
         Распечатать имя, цвет, возраст котов в двух серединных коробках
         */

        printTask();

        System.out.println(catsNames[(catsNames.length / 2) - 1] + " "
                + catsColors[(catsColors.length / 2) - 1] + " " + catsAges[(catsAges.length / 2) - 1]);
        System.out.println(catsNames[catsNames.length / 2] + " "
                + catsColors[catsColors.length / 2] + " " + catsAges[catsAges.length / 2]);

        /* Task14-----------------------------
         Распечатать имена всех котов, чей возраст больше 2 лет
         */

        printTask();

        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > 2) {
                System.out.println(catsNames[i] + " ");
            }
        }

        /* Task15-----------------------------
         Распечатать “Накорми … !” , где … - имя кота, а значение isCatRed == true
         */

        printTask();

        for (int i = 0; i < isCatRed.length; i++) {
            if (isCatRed[i]) {
                System.out.println("Накорми " + catsNames[i] + "!");
            }
        }

        /* Task16-----------------------------
         Распечатать средний возраст котов из массива catsAges[]
         */

        printTask();

        //System.out.println(Arrays.stream(catsAges).average());
        int avgCatsAge = 0;
        for (int i = 0; i < catsAges.length; i++) {
            avgCatsAge = avgCatsAge + catsAges[i];
        }
        System.out.println(Math.round(avgCatsAge / catsAges.length));

        /*Task17-----------------------------
         Распечатать возраст самого молодого кота
         */

        printTask();

        int[] tmpCatAgeSort = new int[]{3, 8, 8, 5, 7, 6, 2, 1};
        Arrays.sort(tmpCatAgeSort, 0, tmpCatAgeSort.length);
        System.out.println(tmpCatAgeSort[0]);

        /* Task18-----------------------------
         Распечатать возраст самого старого кота
         */

        printTask();

        System.out.println(tmpCatAgeSort[tmpCatAgeSort.length - 1]);

        /* Task19-----------------------------
         Распечатать количество серых котов и количество рыжих котов
         */

        printTask();

        int tmpGrey = 0;
        int tmpRed = 0;
        for (String catsColor : catsColors) {
            if (catsColor.equals("Grey")) {
                tmpGrey = tmpGrey + 1;
            }
            if (catsColor.equals("Red") || catsColor.equals("Рыжик")) {
                tmpRed = tmpRed + 1;
            }
        }
        System.out.println("Серых котов " + tmpGrey);
        System.out.println("Рыжих котов " + tmpRed);

        /* Task20-----------------------------
         Распечатать имя кота, если кот находится в коробке с нечетным индексом
         и его возраст не больше 2 лет
         */

        printTask();

        for (int i = 1; i < catsNames.length; i += 2) {
            if (catsAges[i] <= 2) {
                System.out.println(catsNames[i]);
            }
        }

        /* Task21-----------------------------
         Написать метод, который создает и печатает массив четных положительных чисел,
         значения которых не больше 6. Заполняем значения и печатаем с помощью цикла for.
         Длина массива - l
         */

        printTask();

        int l = 10;

        System.out.println(Arrays.toString(ArrayOfIntLess6(l)));

        /* Task22-----------------------------
         Написать метод, который принимает на вход массив int,
         и печатает  среднее значение всех элементов массива.
         Проверить работу метода, если параметр на вход - массив catsAges
         */

        printTask();

        System.out.println(Arrays.toString(catsAges));
        printArrayAvg(catsAges);

        /* Task23-----------------------------
         Создать массив всех нечетных отрицательных чисел в промежутке от (-1000 до -900).
         */

        printTask();

        start = -1000;
        int stop = -900;

        System.out.println(Arrays.toString(arrayStartStop(start, stop)));

        /* Task24-----------------------------
         Создать массив из 10 случайных положительных целых чисел в промежутке от [100 до 200]
         */

        printTask();

        int lenght = 10;
        start = 100;
        stop = 200;

        System.out.println(Arrays.toString(randomArrayOfInt(start, stop, lenght)));

        /* Task25-----------------------------
         Написать метод, который принимает на вход массив int[] array и число int number.
         Метод проверяет, содержится ли число number в массиве array.
         При первом нахождении числа number, метод печатает “yes”.
         При каждом нахождении чисел на 1 больше числа number,
         или на 1 меньше числа number, метод печатает “maybe”.
         Метод печатает “no”, если не находит ни одного числа, соответствующего условиям.
         */


        printTask();

        lenght = 10;
        start = 0;
        stop = 10;
        int number = 5;
        int[] inputArray = randomArrayOfInt(start, stop, lenght);

        System.out.println(Arrays.toString(inputArray));
        isNumberInArrayOfInt(inputArray, number);

        /* Task26-----------------------------
         Создать массив четных чисел и массив нечетных чисел
         из элементов массива из задания 24
         */

        printTask();

        lenght = 10;
        start = 100;
        stop = 200;
        inputArray = randomArrayOfInt(start, stop, lenght);

        System.out.println(Arrays.toString(inputArray));
        twoArrays(inputArray);

        /* Task27-----------------------------
         Создать двумерный массив, который состоит из имен, возрастов, цветов котов
         Распечатать все данные котов в коробках с четными индексами,
         используя двумерный массив
         */

        printTask();

        System.out.println(Arrays.toString(catsNames));
        System.out.println(Arrays.toString(catsAges));
        System.out.println(Arrays.toString(catsColors));
        catsFullArray(catsNames, catsAges, catsColors);

        /* Task28-----------------------------
         Создать двумерный массив целых случайных чисел от 1 до 10 включительно,
         размерность массива 4*8.
         */

        printTask();

        int[][] randomArray1_10 = new int[4][8];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                randomArray1_10[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        for (int k = 0; k < 4; k++) {
            System.out.println();
            for (int h = 0; h < 8; h++) {
                System.out.print(randomArray1_10[k][h] + "\t");
            }
        }

        /* Task29-----------------------------
         Вывести сумму всех четных чисел массива из задания 28
         */

        System.out.println();
        printTask();

        int summOfEven = 0;
        for (int k = 0; k < 4; k++) {
            System.out.println();
            for (int h = 0; h < 8; h++) {
                if (randomArray1_10[k][h] % 2 == 0) {
                    summOfEven = summOfEven + randomArray1_10[k][h];
                    System.out.print(randomArray1_10[k][h] + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
        }
        System.out.println("\n");
        System.out.println("sumOfEven = " + summOfEven);

        /* Task30-----------------------------
         Прочитать ссылку про оператор switch в документации, посмотреть видео,
         и переписать  проверки дат из кода, который выставляла Гаяна в субботу,
         8 октября (ДЗ 6, последняя задача), с помощью оператора switch.
         В документации Oracle есть практически готовое решение + Гаяна уже все прописала,
         только надо “допилить” код под наши нужды.
         Написать эту проверку в отдельном методе и подключить проверку в метод
         printEightDaysFromDate
         Написать метод, который принимает на вход параметры
         day = “Sun”, month = 10, date = 2, и выводит на печать последовательность:
         */


    }
}

