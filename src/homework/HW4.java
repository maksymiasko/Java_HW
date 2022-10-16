package homework;


public class HW4 {
    static int taskNumber = 3;

    //variable for Task4 -- expressionToCode();
    static int ageSveta = 10;
    static int ageAnrey = 15;
    static int ageNatasha = 16;
    static String str41 = "На полке стоят учебники";
    static String str42 = "на столе лежат справочники";

    //variable for Task8 -- checkArrayOfInt(int[] array);
    static int[] array = {10, 12, -3, 5, 0};

    //variable for Task9 -- isIntEven(intToCheck);
    static int intToCheck = 20;

    //variable for Task10 -- checkAgeToPerform(ageToPerform);
    static int ageToPerform = 2;

    //variable for Task11 -- checkRateOfStudent(rateOfStudent);
    static int rateOfStudent = 9;

    //variable for Task12 -- printCelcToFarengToKelvin(tempCelc);
    static double tempCelc = 9;

    //variable for Task13 -- checkTwoDigits(firstInt,secondInt);
    static int firstInt = -60;
    static int secondInt = -6;

    //variable for Task14 -- printDivAndRest( k, l, m);
    static int k = 100;
    static int l = 86;
    static int m = 3;

    //variable for Task15 -- howManyPheasantAndRabbit(pheasant, rabbit);
    static int pheasant = 23;
    static int rabbit = 12;

    //variable for Task16 -- speedAverage(double[] arrayDist, double[] arrayTime)
    static double[] arrayDist = {12.0, 150.0, 300.0};
    static double[] arrayTime = {0.3, 2.5, 1.75};

    //variable for Task17 --initDD(Double firstDouble, Double secondDouble)
    //                    --initFF(Float firstFloat, Float secondFloat)
    static Double firstDouble = 10.09999;
    static Double secondDouble = 20.099999;
    static Float firstFloat = 10.09999F;
    static Float secondFloat = 20.099999F;
    static float ff = 10 / 3F;
    static double dd = 10 / 3.0;
    static int[] arrayApl = {42, 55, 1};
    static int[] arrayStud = {42, 5, 2};

    //variable for Task18 --printTableHW3task11(float f, float ff, double d, double dd)
    static float f = firstFloat;
    static double d = firstDouble;

    //variable for Task19 --
    static short shortToTest = -32456;
    static String[] arrayExp = {"one", "two", "three", "four", "five"};

    static String line = "____________________________________________________________________";

    public static void printTask() {
        System.out.println("-------------------- Task " + taskNumber++ + " --------------------\n");
    }

    public static void printTaskMeaning(String taskMeaning) {
        System.out.println(taskMeaning);
    }

    public static void printTaskResult(String taskResult) {
        System.out.println("Task result : " + taskResult + "\n");
    }

    public static void printTaskResult(boolean taskResult) {
        System.out.println("Task result : " + taskResult + "\n");
    }

    public static void expressionToCode(int ageSveta, int ageAnrey, int ageNatasha,
                                        String str41, String str42) {
        //а) Света младше Андрея и Наташи
        printTaskMeaning("a) Света " + ageSveta + "лет младше Андрея " + ageAnrey
                + "лет и Наташи " + ageNatasha + "лет");
        printTaskResult((ageSveta < ageAnrey) && (ageSveta < ageNatasha));

        //б) На полке стоят учебники, а на столе лежат справочники.
        printTaskMeaning("b) " + str41 + " -> " + str42);
        printTaskResult(str41.equals(str42));

        //в) Большая часть детей — девочки. Остальные - мальчики.
        printTaskMeaning("в) Большая часть детей — девочки. Остальные - мальчики.");
        boolean girlsMoreThanBoys = true;
        boolean childrenIsGirlsAndBoys = true;
        printTaskResult(girlsMoreThanBoys && childrenIsGirlsAndBoys);
    }

    public static void checkArrayOfInt(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            if (x > 10) {
                printTaskResult(x + " больше 10");
            } else if (x < 0) {
                printTaskResult(x + " отрицательное число");
            } else if (x == 5) {
                printTaskResult("Разность " + x + " и 5 равна 0");
            } else {
                printTaskResult("Число " + x + " меньше 11, больше или равно 0 "
                        + "но не равно 5");
            }
        }
        System.out.println("Проверка :\n");
        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            if (((x < 11) && (x >= 0) && (x != 5))) {
                System.out.println("Число " + x + " меньше 11,"
                        + " больше или равно 0, но не равно 5\n"
                        + (((x < 11) && (x >= 0) && (x != 5))) + "\n");
            }
        }
    }

    public static void isIntEven(int intToCheck) {
        int intResult;
        if (intToCheck % 2 == 0) {
            intResult = intToCheck * 2;
        } else {
            intResult = intToCheck * intToCheck;
        }
        printTaskResult("Если число для проверки = " + intToCheck
                + "\nРезультат работы алгоритма = " + intResult);
    }

    public static void checkAgeToPerform(int ageToPerform) {
        System.out.println("Ваш возраст " + ageToPerform);
        if (ageToPerform >= 18) {
            printTaskResult("Голосовать можно с 18 лет");
        } else if (ageToPerform >= 16) {
            printTaskResult("Машину можно водить с 16 лет");
        } else if (ageToPerform >= 5) {
            printTaskResult("В школу можно идти с 5 лет");
        }
    }

    public static void checkRateOfStudent(int rateOfStudent) {
        if (rateOfStudent == 5) {
            printTaskResult("5 - выдать похвальную грамоту и перевести в следующий класс");
        } else if (rateOfStudent == 4) {
            printTaskResult("4 - перевести в следующий класс");
        } else if (rateOfStudent == 3) {
            printTaskResult("3 - дать задание на лето и перевести в следующий класс");
        } else if (rateOfStudent == 2) {
            printTaskResult("2 - вызвать родителей и оставить в текущем классе на второй год");
        } else {
            printTaskResult("Введите оценку от 2 до 5, для получения результата");
        }
    }

    public static void printCelsToFarengToKelvin(double tempCelc) {
        System.out.println("\nВходная температура в градусах Цельсия = "
                + tempCelc + "C\nTask result :");
        System.out.println("Температура " + tempCelc + " C = "
                + ((tempCelc * 9 / 5) + 32) + " F ");
        System.out.println("Температура " + tempCelc + " C = "
                + ((tempCelc + 273.15) + " K \n"));
    }

    public static void checkTwoDigits(int firstInt, int secondInt) {
        System.out.println("Даны числа : " + firstInt + " и " + secondInt);
        if ((firstInt % 3 == 0) && (secondInt % 3 == 0)) {
            System.out.println("Task result : " + (firstInt + secondInt));
        }
        if ((firstInt % 5 == 0) && (secondInt % 5 == 0)) {
            System.out.println("Task result : " + (firstInt - secondInt));
        }
        if ((firstInt % 2 == 0) && (secondInt % 2 == 0))
            if ((firstInt < 0) || (secondInt < 0)) {
                System.out.println("Task result : " + (-1) * (firstInt * secondInt));
            } else {
                System.out.println("Task result : " + (firstInt * secondInt));
            }
        else {
            printTaskResult("Невозможно произвести действия");
        }
        System.out.println();
    }

    public static void howManyPheasantAndRabbit(int pheasant, int rabbit) {
        System.out.println("Решим систему двух уравнений :\n"
                + "\nPheasant + Rabbit = 35 \n"
                + "2 * Pheasant + 4 * Rabbit = 94\n"
                + "\t\t  v \t\t\n"
                + "Pheasant = 35 - Rabbit\n"
                + "2 * Pheasant + 4 * Rabbit = 94\n"
                + "\t\t  v \t\t\n"
                + "4 * Rabbit - 2 * Rabbit  = 94\n"
                + "\t\t  v \t\t\n"
                + "Pheasant = 23\n"
                + "Rabbit  = 12\n");
        System.out.println("Проверка на валидных данных : Фазаны = 23 Кролики = 12\n"
                + "по формуле : 2 * Pheasant + 4 * Rabbit = 94\n"
                + "\t\t\t 2 * 23 + 4 * 12 = 94");
        System.out.println("Task result : " + (2 * pheasant + 4 * rabbit == 94) + "\n");
    }

    public static void printDivAndRest(int k, int l, int m) {
        System.out.println("Даны числа : " + k + ", " + l + ", " + m);
        System.out.println("Task result : ");
        System.out.println("Результат деления " + k + " на " + l + " = " + (k / l)
                + " ,а остаток от деления  = " + k % l);
        System.out.println("Результат деления " + k + " на " + m + " = " + (k / m)
                + " ,а остаток от деления  = " + k % m);
        System.out.println("Результат деления " + l + " на " + m + " = " + (l / m)
                + " ,а остаток от деления  = " + l % m);
        System.out.println("Результат деления " + m + " на " + k + " = " + (m / k)
                + " ,а остаток от деления  = " + m % k + "\n");
    }

    public static void speedAverage(double arrayDist[], double arrayTime[]) {

        System.out.println("\nTask result :\ndistance\t time\t\tavgSpeed");
        for (int i = 0; i < arrayDist.length; i++) {
            System.out.println(arrayDist[i] + "\t\t  " + arrayTime[i] + "\t\t  "
                       + arrayDist[i] / arrayTime[i]);
            }
        System.out.println();
        }
    public static void initDD(Double firstDouble, Double secondDouble) {
        System.out.println(
              "a) Переменная типа Double с именем dd = " + (firstDouble + secondDouble));
    }
    public static void initFF(Float firstFloat, Float secondFloat) {
        System.out.println(
              "b) Переменная типа Float с именем ff = " + (firstFloat + secondFloat));
    }
    public static void initff(float ff) {
        System.out.println(
              "a) Переменная типа float с именем ff = " + ff);
    }
    public static void initdd(double dd) {
        System.out.println(
              "b) Переменная типа double с именем dd = " + dd);
    }
    public static void printApplesStudents(int arrayApl[], int arrayStud[]) {
        System.out.println("\nTask result :");
        for (int i = 0; i < arrayApl.length; i++) {
            if (arrayApl[i] == 42) {
                System.out.println(arrayApl[i] + "\tяблока");
            }
            if (arrayApl[i] == 55)  {
                System.out.println( arrayApl[i] + "\tяблок");
            }
            if (arrayApl[i] == 1) {
                System.out.println(arrayApl[i] + "\tяблоко");
            }
        }
        System.out.println();
        for (int j = 0; j < arrayStud.length; j++) {
            if (arrayStud[j] == 42) {
                System.out.println(arrayStud[j] + "\tстудента");
            }
            if (arrayStud[j] == 5)  {
                System.out.println( arrayStud[j] + "\tстудентов");
            }
            if (arrayStud[j] == 2) {
            System.out.println(arrayStud[j] + "\tстудента");
            }
        }
        System.out.println();
   }

    public static float fltSum() {return(f + ff);}
    public static float fltSub() {return(f - ff);}
    public static float fltProduct() {return(f * ff);}
    public static float fltQuotient() {return(f / ff);}
    public static float fltRemainder() {return(f % ff);}
    public static double doubSum() {return(d + dd);}
    public static double doubSub() {return(d - dd);}
    public static double doubProduct() {return(d * dd);}
    public static double doubQuotient() {return(d / dd);}
    public static double doubRemainder() {return(d % dd);}

    public static void countShortNumber(short shortToTest) {
        int numDigits;
        System.out.println("\nTask result : ");
            if(shortToTest >= 0) {
                numDigits = String.valueOf(shortToTest).length();
                System.out.println("'" + shortToTest + "' it`s a " + arrayExp[numDigits - 1] + "-digit number.\n");
            } else {
                numDigits = String.valueOf(-1 * shortToTest).length();
                System.out.println("'" + shortToTest + "' it`s a " + arrayExp[numDigits - 1] + "-digit number.\n");
            }
    }

    public static void printTableHW3task11(float f, float ff, double d, double dd) {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("|\t" + "f = " + f + "\t" + "|\t" + "ff = " + ff + "\t|\t" + "d = " + d + "\t" + "|\t" + "dd = " + dd + "\t|");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("|\t" + "floatSum = " + fltSum() + "\t\t\t\t|\t" + "doubleSum = " + doubSum() + "\t\t\t\t|");
        System.out.println("|\t" + "floatSub = " + fltSub() + "\t\t\t\t\t|\t" + "doubleSub = " + doubSub() + "\t\t\t\t|");
        System.out.println("|\t" + "floatProduct = " + fltProduct() + "\t\t\t|\t" + "doubleProduct = " + doubProduct() + "\t\t\t|");
        System.out.println("|\t" + "floatQuotient = " + fltQuotient() + "\t\t\t|\t" + "doubleQuotient = " + doubQuotient() + "\t\t\t\t\t|");
        System.out.println("|\t" + "floatRemainder = " + fltRemainder() + "\t\t\t|\t" + "doubleRemainder = " + doubRemainder() + "\t\t|");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();
    }
    public static void printWheather() {
        System.out.println("\nTask result :");
        System.out.println("London coordinate : \"lon\":-0.1257,\"lat\":51.5085");
        System.out.println("Paris coordinate : \"lon\":2.3488,\"lat\":48.8534");
        System.out.println("Rome coordinate : \"lon\":-85.1647,\"lat\":34.257");
    }

    public static void main(String[] args) {

        //Task1-------------------------------------------------------------------
        //В пакете homework создать класс HW4, всю работу выполнять в этом классе.
        //Не забываем, что все методы у нас пока public static void.
        //Если вы хотите вынести общие для класса переменные за метод main,
        //то делайте их static

        //Task2-------------------------------------------------------------------
        //Написать метод, который будет печатать номер задания перед каждым ответом.
        //Придумайте свой дизайн.

        //Task3-------------------------------------------------------------------
        printTask();
        //Записать в виде кода следующие логические выражения:
        printTaskMeaning("Записать в виде кода следующие логические выражения:\n");

        //1) (2 = 2) И (7 = 7);
        printTaskMeaning("1) (2 = 2) И (7 = 7)");
        printTaskResult((2 == 2) && (7 == 7));

        //2) Не(15 < 3);
        printTaskMeaning("2) Не(15 < 3)");
        printTaskResult(!(15 < 3));

        //3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
        // str1.equals(str2);
        String str1 = "Сосна";
        String str2 = "Дуб";
        String str3 = "Вишня";
        String str4 = "Клён";
        printTaskMeaning("3) (\"Сосна\" = \"Дуб\") ИЛИ (\"Вишня\" = \"Клён\")");
        printTaskResult(str1.equals(str2) || (str3.equals(str4)));

        //4) Не("Сосна" = "Дуб");
        printTaskMeaning("4) Не(\"Сосна\" = \"Дуб\")");
        printTaskResult(!(str1.equals(str2)));

        //5) (Не(15 < 3)) И (10 > 20);
        printTaskMeaning("5) (Не(15 < 3)) И (10 > 20)");
        printTaskResult((!(15 < 3)) && (10 > 20));

        //6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
        printTaskMeaning("6) (Глаза даны, чтобы видеть) И \n"
                + "(\"Под третьим этажом находится второй этаж\")");
        boolean expresion1 = true;//Глаза даны, чтобы видеть
        boolean expresion2 = true;//Под третьим этажом находится второй этаж
        printTaskResult(expresion1 && expresion2);

        //7) (6/2 = 3) ИЛИ (7*5 = 20);
        boolean a = (6 / 2 == 3);
        boolean b = (7 * 5 == 20);
        printTaskMeaning("7) (6/2 = 3) ИЛИ (7*5 = 20)");
        printTaskResult(a || b);


        //Task4-------------------------------------------------------------------
        printTask();
        //Записать в виде кода следующие выражения:
        printTaskMeaning("Записать в виде кода следующие логические выражения:\n");
        expressionToCode(ageSveta, ageAnrey, ageNatasha, str41, str42);


        //Task5-------------------------------------------------------------------
        printTask();
        //“Водительские права можно получить, только когда исполнится 16 лет.”
        printTaskMeaning("Водительские права можно получить, только когда исполнится 16 лет");
        int minAgeForDl = 16;
        int realAge = 15;
        boolean existanseDl = false;
        if (minAgeForDl == realAge || minAgeForDl > realAge) {
            existanseDl = true;
        } else {
            existanseDl = false;
        }
        printTaskResult(existanseDl);


        //Task6-------------------------------------------------------------------
        printTask();
        //”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
        printTaskMeaning("Петя не едет в автобусе, но при этом читает книгу "
                + "или не смотрит в окно");
        boolean petyaDriveInBus = false;
        boolean petyaReadBook = true;
        boolean petyaLooksTryWindows = false;
        printTaskResult((!petyaDriveInBus && petyaReadBook) || !petyaLooksTryWindows);


        //Task7-------------------------------------------------------------------
        printTask();
        //Записать выражения в виде условий if-else
        //“Если с другом ты, это хорошо, а когда наоборот - плохо”
        printTaskMeaning("Если с другом ты, это хорошо, а когда наоборот - плохо");
        boolean youWithFriend = true;
        if (youWithFriend) {
            printTaskResult("это хорошо");
        } else {
            printTaskResult("плохо");
        }


        //Task8-------------------------------------------------------------------
        printTask();
        printTaskMeaning("Проверить число x, которое может принимать значения "
                + "10, 12, -3, 5 и 0.\n"
                + "Если x больше 10, то вывести на печать “x больше 10”.\n"
                + "Если x меньше нуля, то вывести на печать “x - отрицательное число”\n"
                + "Если x = 5, то вывести на печать “Разность x и 5 равна 0”\n"
                + "Иначе вывести на печать “Число x меньше 11, больше или равно 0, "
                + "но не равно 5”.\n"
                + "Проверить, соответствует ли последнее утверждение "
                + "всем предыдущим утверждениям.\n");
        checkArrayOfInt(array);


        //Task9-------------------------------------------------------------------
        printTask();
        printTaskMeaning("Проверьте число на четность. Если число четное, \n"
                + "удвойте это число, иначе возведите число в квадрат. \n"
                + "Выведите результат работы алгоритма на печать.\n"
                + "Найдите в презентации, какой блок схеме соответствует ваш алгоритм.\n");
        isIntEven(intToCheck);


        //Task10-------------------------------------------------------------------
        printTask();
        printTaskMeaning("Напишите алгоритм проверки возраста на соответствие условиям \n"
                + "(if-else):Голосовать можно с 18 лет \n"
                + "Машину можно водить с 16 лет \n"
                + "В школу можно идти с 5 лет \n"
                + "Выведите результат работы алгоритма на печать.\n");
        checkAgeToPerform(ageToPerform);


        //Task11-------------------------------------------------------------------
        printTask();
        printTaskMeaning("Напишите алгоритм программы, которая проверяет оценку ученика\n"
                + "и выполняет следующие действия:\n"
                + "5 - выдать похвальную грамоту и перевести в следующий класс\n"
                + "4 - перевести в следующий класс\n"
                + "3 - дать задание на лето и перевести в следующий класс\n"
                + "2 - вызвать родителей и оставить в текущем классе на второй год\n"
                + "Выведите результат работы алгоритма на печать.\n");
        checkRateOfStudent(rateOfStudent);


        //Task12-------------------------------------------------------------------
        printTask();
        printTaskMeaning("Напишите метод, который примет на вход температуру\n"
                + "в Цельсиях, и распечатает результат температуры \n"
                + "в Фаренгейтах и Кельвинах.");
        printCelsToFarengToKelvin(tempCelc);


        //Task13-------------------------------------------------------------------
        printTask();
        printTaskMeaning("Напишите алгоритм программы, которая проверяет 2 числа.\n"
                + "Программа складывает числа, которые делятся на 3 без остатка, \n"
                + "и вычитает числа, которые делятся на 5 без остатка.\n"
                + "Программа выводит на печать результат вычислений.\n"
                + "Программа умножает числа, которые делятся на 2 без остатка, \n"
                + "но если хотя бы одно число отрицательное, \n"
                + "программа умножает результат действия на (-1). \n"
                + "Программа выводит на печать результат вычислений.\n"
                + "Если числа не прошли ни одну проверку, программа выводит\n"
                + "на печать ошибку о невозможности произвести действия.\n");
        checkTwoDigits(firstInt, secondInt);


        //Task14-------------------------------------------------------------------
        printTask();
        printTaskMeaning("Распечатать следующие выражения,\n"
                + "используя метод и параметры k, l, m:\n"
                + "Результат деления k на l = …, а остаток от деления  = …\n"
                + "Результат деления k на m = …, а остаток от деления  = …\n"
                + "Результат деления l на m = …, а остаток от деления  = …\n"
                + "Результат деления m на k = …, а остаток от деления  = …\n");
        printDivAndRest(k, l, m);


        //Task15-------------------------------------------------------------------
        printTask();
        printTaskMeaning("Решить задачу :\n"
                + "В клетке находятся фазаны и кролики.\n"
                + "Известно, что у них 35 голов и 94 ноги.\n"
                + "Узнайте число фазанов и число кроликов.\n"
                + "Проверить работу вашего алгоритма тестом.\n");
        howManyPheasantAndRabbit(pheasant, rabbit);


        //Task16-------------------------------------------------------------------
        printTask();
        printTaskMeaning("Написать метод, который рассчитывает среднюю скорость\n"
                + "движения (speedAverage) транспортного средства или живого существа\n"
                + "с разными параметрами distance и time.\n"
                + "Протестировать метод.\n"
                + "\nТестовые данные:\n"
                + "distance\t\ttime\n"
                + "12\t\t\t\t20 min = 0,3 hours\n"
                + "150\t\t\t\t2,5 hours\n"
                + "300\t\t\t\t1,75 hours");
        speedAverage(arrayDist, arrayTime);


        //Task17-------------------------------------------------------------------
        printTask();
        printTaskMeaning("Выполнить задание 7 и 8 из HW2 с помощью метода и параметров:\n"
                + "a) Создать переменную типа Double с именем dd  и инициализировать её\n"
                +    "результатом суммы чисел 10.09999 и 20.099999. \n"
                + "b) Создать переменную типа Float с именем ff  и инициализировать её\n"
                +    "результатом суммы чисел 10.09999 и 20.099999. \n"
                +    "Распечатать результаты.\n");
        System.out.println("Task result : ");
        initDD(firstDouble, secondDouble);
        initFF(firstFloat, secondFloat);
        System.out.println();
        //--------------------------------------------------------------------------
        printTaskMeaning(
                "a) Создать переменную float ff и присвоить ей значение выражения 10 / 3.\n"
                + "b) Создать переменную double dd и присвоить ей значение выражения 10 / 3.\n"
                + "Добиться максимальной точности значений вычислений и распечатать результаты.\n");
        System.out.println("Task result : ");
        initff(ff);
        initdd(dd);
        //--------------------------------------------------------------------------
        printTaskMeaning("\nTask17 HW3\n"
                + "Написать метод так, чтобы правильные склонения слов\n"
                + "(н-р, яблок, яблоко или яблока; ученики - учеников…)\n"
                + "печатались автоматически в зависимости от значений параметров.\n"
                + "Распечатать выражение с параметрами:\n"
                + "apple = 42, 55, 1\n"
                + "student = 42, 5, 2");
        printApplesStudents(arrayApl,arrayStud);


        //Task18-------------------------------------------------------------------
        printTask();
        printTaskMeaning("Распечатать таблицу из HW3, задание 11 с помощью методов и параметров\n"
                + "(значения f, ff, d, dd могут быть любыми). Обратите внимание на то,\n"
                + "что левая часть таблицы у вас почти такая же, как правая часть таблицы.");
        printTableHW3task11(f ,ff ,d ,dd );


        //Task19-------------------------------------------------------------------
        printTask();
        printTaskMeaning("Напишите алгоритм программы, которая проверяет число \n"
                + "типа short на количество разрядов, и выводит результат проверки.\n"
                + "(Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)\n"
                + "Выведите результат проверки на печать.");
        countShortNumber(shortToTest);

        //Task20-------------------------------------------------------------------
        printTask();
        printTaskMeaning("На сайте https://openweathermap.org/ зарегистрироваться и\n"
              + "получить ключ(key). Найти в документации пример запроса с параметрами\n"
              + "Название города” (а не с географическими координатами).\n"
              + "Сформировать и отправить запрос на сервер (manually).\n"
              + "В полученном ответе найти географические координаты для следующих городов\n"
              + "London Paris Rome");
        printWheather();

    }

}