package homework;

import org.w3c.dom.ls.LSOutput;

public class HW5 {
    public static final double PI = 3.141592653589793;
    static int taskNumber = 1;
    static int tcNumber = 1;
    static int day = 1;
    static String resultString;

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

    //Task_2
    public static String nameOfTheDay(int day) {
        if (day == 1) {

            return "Sunday";
        }
        if (day == 2) {

            return "Monday";
        }
        if (day == 3) {

            return "Tuesday";
        }
        if (day == 4) {

            return "Wednesday";
        }
        if (day == 5) {

            return "Thursday";
        }
        if (day == 6) {

            return "Friday";
        }
        if (day == 7) {

            return "Saturday";
        } else {

            return "-1";
        }
    }

    //Task_3
    public static int averageFamilyAge(int age1 ,int age2 , int age3) {
        double familyMaxAge = Math.max(age1 ,Math.max(age2 ,age3));
        double familyMinAge = Math.min(age1 ,Math.min(age2 ,age3));
        if((familyMinAge <= 0) || (familyMaxAge >= 150)) {

            return -1;
        } else {

            return Math.addExact(age1 ,Math.addExact(age2, age3)) / 3;
        }
    }

    //Task_4
    public static int minOfIntegers(int k, int l) {

        return Math.min(k, l);
    }

    //Task_5
    public static int averageTempOfCat(int t1, int t2, int t3,int t4,int t5) {
        int catMax = Math.max(t1, Math.max(t2, Math.max(t3, Math.max(t4,t5))));
        int catMin = Math.min(t1, Math.min(t2, Math.min(t3, Math.min(t4,t5))));
        if( catMin <= 25 || catMax >= 45) {

            return -1;
        } else {

            return Math.addExact(t1, Math.addExact(t2 ,Math.addExact(t3 ,Math.addExact(t4,t5)))) / 5;
        }
    }

    //Task_6
    public static int salaryPerMonth(int ratePerHour, int workingHoursPerDay) {
        int workingHourPreMonth = workingHoursPerDay * 21;
        if ((ratePerHour < 12) || (workingHourPreMonth > 164)) {

            return -1;
        } else {

            return ratePerHour * workingHoursPerDay * 21;
        }
    }

    //Task_7
    public static double amountOfPurchase(double price , int amount) {
        if((price <= 0.0) ||(amount < 0)) {

            return - 1.0;
        } else {

            return Math.round(price * amount * 100) / 100.0;
        }
    }

    public static double amountOfPurchase1(double price , double amount) {
        if((price <= 0.0) ||(amount < 0)) {

            return - 1.0;
        } else {

            return Math.round(price * amount * 100) / 100.0;
        }
    }

    //Task_8
    public static String salaryOfEmployee (String name, double money) {
        if((name.isEmpty()) || (money <= 0.0) ) {

            return "";
        } else {
            double intPart = 1.0 * (int)money ;
            double floatPart = money - intPart;
            floatPart = Math.round(floatPart * 100.0);
            resultString = name + "\t\t" + String.valueOf((int)intPart) + "грн " + (int)floatPart + "коп";

            return resultString;
        }
    }

    //Task_11
    public  static String priceFromDoubleToString(double money) {
        if(money <= 0.0) {

            return "Error!!!";
        } else {
            double intPart = 1.0 * (int)money ;
            double floatPart = money - intPart;
            floatPart = Math.round(floatPart * 100.0);
            resultString = String.valueOf((int)intPart) + "грн " + (int)floatPart + "коп";

            return resultString;
        }
    }

    //Task_10
    public static String xFlow(int x) {
        if(x < 0) {

            return "x is negative";
        } else if(x >0) {

            return "x is positive";
                } else {

                    return "x is zero";
        }
    }

    //Task_12
    public  static String weightFromDoubleToString(double weight) {
        if(weight < 0.0) {


            return "Error!!!";
        } else {
            double intPart = 1.0 * (int)weight ;
            double floatPart = weight - intPart;
            floatPart = Math.round(floatPart * 1000.0);
            resultString = String.valueOf((int)intPart) + "кг " + (int)floatPart + "гр";

            return resultString;
        }
    }

    //Task_13
    public static void printReceipt(String product,double money, double weight) {

        System.out.println(product);
        System.out.println("Цена за 1 кг\t\t" + priceFromDoubleToString(money));
        System.out.println("Количество товара\t" + weightFromDoubleToString(weight));
        System.out.println("-------------------------------");
        System.out.println("Сумма к оплате\t\t" + priceFromDoubleToString(amountOfPurchase1(money,weight)) + "\n");

    }
    public static void printReceipt1(String product,double money, int quant) {

        System.out.println(product);
        System.out.println("Цена за шт\t\t\t" + priceFromDoubleToString(money));
        System.out.println("Количество товара\t" + quant);
        System.out.println("-------------------------------");
        System.out.println("Сумма к оплате\t\t" + priceFromDoubleToString(amountOfPurchase(money ,quant)) + "\n");
    }

    //Task_14
    public static int happyInt(int birthdayDate) {
        int number = birthdayDate;
        int stopDigit = 9;
        if (birthdayDate > 0) {
            while (number > stopDigit) {
                number = sumNumberDigits(number);
            }

            return (sumNumberDigits(number));
        }

        return (-1);
    }
    public static int sumNumberDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        return sum;
    }
    /*      Супер но не мое решение

            public static String printLuckyNum(int yearOfBirth) {
            int luckyNum = yearOfBirth % 9;
            if (luckyNum == 0) {
                luckyNum = 9;
            }
            return "Your lucky number is: " + luckyNum;
        }
     */

    //Task_15
    //a)
    public static String differenceMedianAveragea(int a, int b, int c) {
        int median = median1(a, b, c);
        int average = (a + b + c) / 3;

        if((Math.abs((median - average)) > 2)) {

            return "Среднее значение " + average + " отличается от медианы "
            +  median + " на " + (Math.abs((median - average)));
        } else {

            return "Среднее значение = " + average + "\tмедиана = " + median;
        }
    }

    public static int median1(int a, int b, int c) {
        if ((a - b) * (c - a) >= 0) {

            return a;
        } else if
        ((b - a) * (c - b) >= 0) {

            return b;
        } else {

            return c;
        }
    }

    //b)
    public static String differenceMedianAverageb(int a, int b, int c) {
        int median = Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));
        int average = Math.addExact(a, Math.addExact(b, c)) / 3;

        if((Math.abs((median - average)) > 2)) {

            return "Среднее значение " + average + " отличается от медианы "
                    +  median + " на " + (Math.abs((median - average)));
        } else {

            return "Среднее значение = " + average + "\tмедиана = " + median;
        }
    }

    //Task_16
    public static String roundingDoubleDown(double money) {
        if(money <= 0.0) {

            return "Error!!!";
        } else {
            int moneyToPay = (int)Math.floor(money);
            resultString = String.valueOf(moneyToPay) + "грн " + " 00коп";

            return resultString;
        }
    }

    //Task_17
    public static int solveAndRoundUp(int a, int b, int c) {

        return (int)Math.ceil((Math.sqrt ((a * b + c) * Math.pow(a,b))) / PI);
    }

    //Task_18
    //1)
    public static int assignsToX(int y) {
        int x = 0;
        if(y >= 0) {
            x = 1;
        } else {
            x = -1;
        }

        return x;
    }

    //2)
    public static int increaseDoubleBy5(double a) {
        if((a > 80) && (a < 90)) {

            return (int)(a + 5);
        } else {

            return -1;
        }
    }

    //3)
    public static String rewriteNot(int i, int v) {
        boolean item = !((i < 10) || (v >= 50));
        boolean itemNot = ((i >= 10) && (v < 50));

        return "With NOT\t\t" + item + "\nWithout NOT\t\t" + itemNot + "\n";
        }

    //4)
    public static String ifXisOddPositive(int x) {
        if(((x % 2) == 0) && (x >= 0)) {

            return "true";
        } else {

            return "false";
        }
    }

    //5
    public static String ifXYisPositive(int x, int y) {
        if((x > 0) && (y > 0)) {

            return "true";
        } else {

            return "false";
        }
    }

    //6
    public static String ifXYBothPositiveNegative(int x, int y) {
        if((x * y) > 0) {

            return "true";
        } else {

            return "false";
        }
    }

    //Task_19
    public static double randomNumberRandPow() {

        return Math.pow(Math.random(),(int)(Math.random()*11));
    }

    //Task_20
    public static int random99() {

       return (int)((Math.random() * 99) + 1);
    }

    public static int randomMinus99() {

        return (int)((Math.random() * 99) - 100);
    }

    //Task_21
    public static boolean isLeapYear(int year) {

        return ((year % 4) == 0);
    }


    public static void main(String[] args) {


     /** Task1-----------------------------
     Cоздать метод
     verifyEquals(expectedResult, actualResult) {}
     так, как мы делали на уроке. Попробуйте написать его
     самостоятельно, и потом свериться с кодом с урока.
     */

        printTask();

     /** Task2-----------------------------
     Написать метод, который принимает на вход число от
     1 до 7 и возвращает день недели. Протестировать метод.
     */
        //TC_1
        //AAA - triple A rules (правило составления тест кейса)
        //A - Arrange (обьявить все известные нам данные)
        printTask();

        String expectedResult1 = "Sunday";
        //Act (вызвать метод для получения actualResult)
        String actualResult1 = nameOfTheDay(day);
        //Assert (сравнение expectedResult,actualResult и вівод сообщения о прохождении теста)
        System.out.println("TC_" + tcNumber++ + "\t__\t" + verifyEquals(expectedResult1,actualResult1));

        //TC_2
        day = 8;
        expectedResult1 = "-1";
        actualResult1 = nameOfTheDay(day);
        //System.out.println(actualResult);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

        //TC_3
        day = -1;
        expectedResult1 = String.valueOf("-1");
        actualResult1 = nameOfTheDay(day);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

     /** Task3-----------------------------
      Написать алгоритм вычисления среднего возраста в семье из 3х человек.
      Протестируйте алгоритм на позитивные и негативные сценарии.
     */
        printTask();

        //TC_4
        int age1 = 13;
        int age2 = 20;
        int age3 = 30;
        int expectedResult = 21;
        int actualResult = averageFamilyAge(age1 ,age2 ,age3);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult,actualResult));
        //System.out.println(averageFamilyAge(age1 ,age2 ,age3));

        //TC_5
        age1 = 5;
        age2 = 1;
        age3 = 0;
        expectedResult = -1;
        actualResult = averageFamilyAge(age1 ,age2 ,age3);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult,actualResult));

        //TC_6
        age1 = 151;
        age2 = 150;
        age3 = 3;
        expectedResult = -1;
        actualResult = averageFamilyAge(age1 ,age2 ,age3);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult,actualResult));

     /** Task4-----------------------------
       Найти минимальное  значение, используя переменные (по одному методу на каждый вариант)
       k и l
       k, l, m
       k, l, m, n
       Переменные должны быть типа int.
       Happy path test data:
       if k = 3, l = 30, m = 300, n = 3000
       expected results:
       a) 3
       b) 3
       c) 3
     */
        printTask();

        //TC_7
        int k = 3;
        int l = 30;
        int m = 300;
        int n = 3000;
        expectedResult =3;
        actualResult = minOfIntegers(k, l);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult,actualResult));

        //TC_8
        actualResult = minOfIntegers(minOfIntegers(k, l), m);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult,actualResult));

        //TC_9
        actualResult = minOfIntegers(minOfIntegers(k, l),minOfIntegers(m, n));
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult,actualResult));

      /** Task5-----------------------------
       Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
       Например,
       t1 = 39
       t2 = 39
       t3 = 39
       t4 = 39
       t5 = 39
       TempAverage = 39
       Не забудьте, что температура тела ЖИВОГО кота имеет определенные границы.
       Значения, которые не входят в эти границы считаем невалидными и выдаем ошибку.
       По статистике клиента, некоторые коты могут быть все еще живы при
       температурах от 25С до 45С.
     */
        printTask();

        //TC_10
        int t1 = 39;
        int t2 = 39;
        int t3 = 39;
        int t4 = 39;
        int t5 = 39;
        expectedResult = 39;
        actualResult = averageTempOfCat(t1 ,t2 ,t3 ,t4 ,t5 );
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult,actualResult));

        //TC_11
        t1 = 26;
        t2 = 44;
        t3 = 43;
        t4 = 27;
        t5 = 40;
        expectedResult = 36;
        actualResult = averageTempOfCat(t1 ,t2 ,t3 ,t4 ,t5 );
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult,actualResult));

        //TC_12
        t1 = 25;
        t2 = 45;
        t3 = 45;
        t4 = 25;
        t5 = 45;
        expectedResult = -1;
        actualResult = averageTempOfCat(t1 ,t2 ,t3 ,t4 ,t5 );
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult,actualResult));


        /** Task6-----------------------------
        Написать метод, который принимает на вход количество часов (int) работы в день,
        стоимость одного часа работы в десятичном числе, и возвращает
        заработную плату в месяц в целых единицах.
        При невалидных значениях метод возвращает -1.
        Протестируйте метод на позитивные и негативные сценарии.
        */
        printTask();

        //TC_13
        int ratePerHour = 12;
        int workingHoursPerDay = 7;
        expectedResult = 1764;
        actualResult = salaryPerMonth(ratePerHour,workingHoursPerDay);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult,actualResult));

        //TC_14
        ratePerHour = 5;
        workingHoursPerDay = 7;
        expectedResult = -1;
        actualResult = salaryPerMonth(ratePerHour,workingHoursPerDay);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult,actualResult));

        //TC_15
        ratePerHour = 13;
        workingHoursPerDay = 8;
        expectedResult = -1;
        actualResult = salaryPerMonth(ratePerHour,workingHoursPerDay);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult,actualResult));

    /** Task7-----------------------------
        Написать метод, который принимает на вход 2 параметра -
        цену и количество товара (количество в штуках).
        Алгоритм возвращает сумму покупки в виде десятичного числа.
        Например, price for 1 = 25 руб 50 коп (25.5)
        amount = 5
        expected total = 127 руб 50 коп (127.5)
        При невалидных значениях метод возвращает -1
        ПРоверьте метод на позитивный и негативный сценарий.
     */
        printTask();

        //TC_16
        double price = 25.01;
        int amount = 5;
        double expectedResult2 = 125.05;
        double actualResult2 = amountOfPurchase(price ,amount);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult2,actualResult2));

        //TC_17
        price = -13.5;
        amount = 10;
        expectedResult2 = -1.0;
        actualResult2 = amountOfPurchase(price ,amount);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult2,actualResult2));

        //TC_18
        price = 13.99;
        amount = -10;
        expectedResult2 = -1.0;
        actualResult2 = amountOfPurchase(price ,amount);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult2,actualResult2));

        /** Task8-----------------------------
        Написать метод, который принимает на вход необходимые параметры и возвращает
        строку ведомости выдачи зарплаты сотрудникам.
        Например:
        “Смирнова Мария Ивановна 	70000 руб 00 коп”
        если имя сотрудника придет в виде пустой строки или в виде
        null (String - это референсный тип данных и может принимать значение null),
        то в ведомости должна быть распечатана пустая строка "".
        Если же на вход придет невалидное данное по зарплате, или зарплата будет рассчитана,
        как 0, то в ведомости тоже должна быть распечатана пустая строка ""
        Протестировать метод.
        */
        printTask();

        //TC_19
        String name = "Eva Ivanovna Ivanova";
        double salary = 70000.99;
        expectedResult1 = "Eva Ivanovna Ivanova\t\t70000грн 99коп";
        actualResult1 = salaryOfEmployee (name , salary);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));
        //System.out.println(salaryOfEmployee (name , salary));

        //TC_20
        name = "  ";
        salary = -5000.06;
        expectedResult1 = "";
        actualResult1 = salaryOfEmployee (name , salary);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

        //TC_21
        name = "Eva Ivanovna Ivanova";
        salary = 0.00;
        expectedResult1 = "";
        actualResult1 = salaryOfEmployee (name , salary);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

        /** Task9-----------------------------
        Создать метод, который печатает ведомость для нескольких сотрудников,
        используя метод из задачи 8, например:
        Смирнова Мария Ивановна 		70000 руб 00 коп
        Серебров Иван Петрович 		    128059 руб 00 коп
        Метод в задании 9 может принимать разные параметры, в зависимости от того,
        что вам нужно для печати ведомости.
        Смысл этого метода - распечатать несколько строк ведомости одновременно.
        Каждая из строк должна формироваться с помощью метода, написанного в задании 8.
         */
        printTask();

        name = "Eva Ivanovna Ivanova";
        salary = 75000.01;
        System.out.println(salaryOfEmployee (name , salary));

        name = "Mat Petrovich Petrov";
        salary = 65000.55;
        System.out.println(salaryOfEmployee (name , salary));

        name = "Ivan Vasilyevich Vasilyev";
        salary = 95009.99;
        System.out.println(salaryOfEmployee (name , salary));

        /** Task10-----------------------------
         Записать в виде метода и протестировать:
         дано int x
         */
        printTask();

        //TC_22
        int x = 10;
        expectedResult1 = "x is positive";
        actualResult1 = xFlow(x);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

        //TC_23
        x = -10;
        expectedResult1 = "x is negative";
        actualResult1 = xFlow(x);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

        //TC_24
        x = 0;
        expectedResult1 = "x is zero";
        actualResult1 = xFlow(x);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

        /** Task11-----------------------------
        Написать метод, который принимает на вход десятичное число (например, 10.75),
        и возвращает строку “10 руб 75 коп”.
        */
        printTask();

        //TC_25
        price = 10.99;
        expectedResult1 = "10грн 99коп";
        actualResult1 = priceFromDoubleToString(price);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));
        System.out.println(priceFromDoubleToString(price));

        //TC_26
        price = 2.05;
        expectedResult1 = "2грн 5коп";
        actualResult1 = priceFromDoubleToString(price);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));
        System.out.println(priceFromDoubleToString(price));

        //TC_27
        price = -10.50;
        expectedResult1 = "Error!!!";
        actualResult1 = priceFromDoubleToString(price);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));
        System.out.println(priceFromDoubleToString(price));

        /** Task12-----------------------------
        Написать метод, который принимает на вход десятичное число (например, 10,075)
        и возвращает строку “10 кг 75 гр”.
         */
        printTask();

        //TC_28
        double weight = 10.099;
        expectedResult1 = "10кг 99гр";
        actualResult1 = weightFromDoubleToString(weight);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));
        System.out.println(weightFromDoubleToString(weight));

        //TC_29
        weight = 0.01;
        expectedResult1 = "0кг 10гр";
        actualResult1 = weightFromDoubleToString(weight);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));
        System.out.println(weightFromDoubleToString(weight));

        //TC_30
        weight = 99.001;
        expectedResult1 = "99кг 1гр";
        actualResult1 = weightFromDoubleToString(weight);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));
        System.out.println(weightFromDoubleToString(weight));

        /** Task13-----------------------------
        Написать метод, который принимает на вход необходимые параметры,
        и печатает чек. Этот метод тестировать не нужно, но необходимо
        использовать все раннее написанные методы
        (в задачах из Part 1 тоже могут пригодиться некоторые методы)
         */
        printTask();

        String product = "Яблоки";
        double money = 50.13;
        weight = 3.400;
        printReceipt(product ,money ,weight);

        product = "Хлеб";
        money = 3.50;
        int quant = 5;
        printReceipt1(product, money, quant);

        product = "Воздух";
        money = 0.0;
        weight = 0.0;
        printReceipt(product ,money ,weight);

        /** Task14-----------------------------
         Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
         Счастливое число рассчитывается по формуле: сумма всех чисел,
         если результат больше 9, снова считается сумма всех чисел.
         Например:
         год рождения 1999
         1 + 9 + 9 + 9 = 28
         2 + 8 = 10
         1 + 0 = 1
         Счастливое число - 1
         */
        printTask();

        int birthdayDate = 1999;
        System.out.println("Год рождения " + birthdayDate
                + "\nСчастливое число " + happyInt(birthdayDate));

        birthdayDate = 987;
        System.out.println("\nГод рождения " + birthdayDate
                + "\nСчастливое число " + happyInt(birthdayDate));

        birthdayDate = -50;
        System.out.println("\nГод рождения " + birthdayDate
                + "\nСчастливое число " + happyInt(birthdayDate));

        /** Task15-----------------------------
         Дано 3 числа. Необходимо рассчитать разницу между средним значением
         и медианой (median) значением.
         Если разница больше 2, необходимо показать сообщение:
         “Среднее значение … отличается от медианы … на … “.
         Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”
         */
        printTask();

        System.out.println("a)");

        //TC_31
        int a = 20;
        int b = 30;
        int c = 40;
        expectedResult1 ="Среднее значение = 30\tмедиана = 30";
        actualResult1 = (differenceMedianAveragea(a ,b ,c));
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

        //TC_32
        a = 1;
        b = 1000;
        c = -28;
        expectedResult1 ="Среднее значение 324 отличается от медианы 1 на 323";
        actualResult1 = (differenceMedianAveragea(a ,b ,c));
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

        System.out.println("\nb)");

        //TC_33
        a = 20;
        b = 30;
        c = 40;
        expectedResult1 ="Среднее значение = 30\tмедиана = 30";
        actualResult1 = (differenceMedianAverageb(a ,b ,c));
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

        //TC_34
        a = 1;
        b = 1000;
        c = -28;
        expectedResult1 ="Среднее значение 324 отличается от медианы 1 на 323";
        actualResult1 = (differenceMedianAverageb(a ,b ,c));
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

        /** Task16-----------------------------
        Написать метод, который использует методы класса Math,
        принимает на вход сумму к оплате (например, 10.75) и округляет сумму в пользу покупателя.
        Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.
        */
        printTask();

        //TC_35
        money = 10.75;
        expectedResult1 = "10грн  00коп";
        actualResult1 = roundingDoubleDown(money);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

        //TC_36
        money = 0.99;
        expectedResult1 = "0грн  00коп";
        actualResult1 = roundingDoubleDown(money);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

        //TC_37
        money = -25.55;
        expectedResult1 = "Error!!!";
        actualResult1 = roundingDoubleDown(money);
        System.out.println("TC_" + tcNumber++ +"\t__\t" + verifyEquals(expectedResult1,actualResult1));

        /** Task17-----------------------------
        Посчитать с помощью методов класса Math
        int a = 3
        int b = 4
        int c = 20
        Вернуть значение с округлением в большую сторону.
        */
        printTask();

        a = 3;
        b = 4;
        c = 20;
        System.out.println(solveAndRoundUp(a, b, c));

        /** Task18-----------------------------
        */
        printTask();

        System.out.println("1)");
        int y = 10;
        System.out.println(assignsToX(y));

        System.out.println("\n2)");
        a = 81;
        System.out.println(increaseDoubleBy5(a));

        System.out.println("\n3)");
        int i = 11;
        int v = 49;
        System.out.println(rewriteNot(i, v));
        i = 9;
        v = 51;
        System.out.println(rewriteNot(i, v));

        System.out.println("4)");
        x = 20;
        System.out.println(ifXisOddPositive(x));
        x = 21;
        System.out.println(ifXisOddPositive(x));
        x = -1;
        System.out.println(ifXisOddPositive(x));

        System.out.println("\n5)");
        x = 5;
        y = 100;
        System.out.println(ifXYisPositive(x, y));
        x = -5;
        y = 1;
        System.out.println(ifXYisPositive(x, y));
        x = -50;
        y = -100;
        System.out.println(ifXYisPositive(x, y));

        System.out.println("\n5)");
        x = 5;
        y = 100;
        System.out.println(ifXYBothPositiveNegative(x, y));
        x = -5;
        y = 1;
        System.out.println(ifXYBothPositiveNegative(x, y));
        x = -50;
        y = -100;
        System.out.println(ifXYBothPositiveNegative(x, y));

        /** Task19-----------------------------
        Написать метод, который с помощью методов класса Math высчитывает
        случайно сгенерированную степень сгенерированного случайного числа.
        Метод возвращает значение и выводит на экран: “Число … в степени … = …”
        Число может быть в пределах от 0 до 1 исключительно.
        Степень числа может быть от 0 до 10 включительно
        */
        printTask();

        System.out.println(randomNumberRandPow());

        /** Task20-----------------------------
        Написать метод, который возвращает целочисленное случайное число
        в пределах от 1 до 99 включительно. Затем написать метод,
        который возвращает случайное число в пределах от -1 до -99 включительно
        */
        printTask();

        System.out.println(random99());
        System.out.println(randomMinus99());

        /** Task21-----------------------------
        */
        printTask();

        int year = 2000;
        System.out.println(isLeapYear(year));

        /** Task22----------------------------
        Нагуглить географические координаты пяти городов,
        сделать API запрос по этим координатам, получить параметры погоды.
        Затем сделать другие API запросы по названию тех же годов.
        Получить параметры погоды и сравнить результаты.
        Распечатать результаты 2х запросов по каждому городу.
        Если результаты совпали, то напечатать Pass, если не совпали - Fail
        */
        printTask();

        //Kyiv
        expectedResult1 = "{\"coord\":{\"lon\":30.5167,\"lat\":50.4333},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10n\"}],\"base\":\"stations\",\"main\":{\"temp\":280.7,\"feels_like\":280.7,\"temp_min\":279.6,\"temp_max\":281.33,\"pressure\":988,\"humidity\":92},\"visibility\":10000,\"wind\":{\"speed\":0.89,\"deg\":258,\"gust\":3.58},\"rain\":{\"1h\":0.51},\"clouds\":{\"all\":100},\"dt\":1664738265,\"sys\":{\"type\":2,\"id\":2003742,\"country\":\"UA\",\"sunrise\":1664683146,\"sunset\":1664724926},\"timezone\":10800,\"id\":703447,\"name\":\"Kyiv\",\"cod\":200}";
        actualResult1 = "{\"coord\":{\"lon\":30.5167,\"lat\":50.4333},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10n\"}],\"base\":\"stations\",\"main\":{\"temp\":280.7,\"feels_like\":280.2,\"temp_min\":279.6,\"temp_max\":281.33,\"pressure\":988,\"humidity\":92},\"visibility\":10000,\"wind\":{\"speed\":1.34,\"deg\":123,\"gust\":2.68},\"rain\":{\"1h\":0.76},\"clouds\":{\"all\":100},\"dt\":1664737800,\"sys\":{\"type\":2,\"id\":2003742,\"country\":\"UA\",\"sunrise\":1664683146,\"sunset\":1664724926},\"timezone\":10800,\"id\":703448,\"name\":\"Kyiv\",\"cod\":200}";
        System.out.println(verifyEquals(expectedResult1, actualResult1));

        //Edinburg
        expectedResult1 = "{\"coord\":{\"lon\":-3.1965,\"lat\":55.9521},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01n\"}],\"base\":\"stations\",\"main\":{\"temp\":284.01,\"feels_like\":283.32,\"temp_min\":282.86,\"temp_max\":285.25,\"pressure\":1022,\"humidity\":83},\"visibility\":10000,\"wind\":{\"speed\":3.6,\"deg\":240},\"clouds\":{\"all\":0},\"dt\":1664739501,\"sys\":{\"type\":2,\"id\":2038102,\"country\":\"GB\",\"sunrise\":1664691434,\"sunset\":1664732817},\"timezone\":3600,\"id\":2650225,\"name\":\"Edinburgh\",\"cod\":200}";
        actualResult1 = "{\"coord\":{\"lon\":-3.1883,\"lat\":55.95},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01n\"}],\"base\":\"stations\",\"main\":{\"temp\":284.32,\"feels_like\":283.66,\"temp_min\":283.52,\"temp_max\":285.23,\"pressure\":1022,\"humidity\":83},\"visibility\":10000,\"wind\":{\"speed\":1.79,\"deg\":254,\"gust\":5.36},\"clouds\":{\"all\":7},\"dt\":1664739327,\"sys\":{\"type\":2,\"id\":2038102,\"country\":\"GB\",\"sunrise\":1664691432,\"sunset\":1664732815},\"timezone\":3600,\"id\":3333229,\"name\":\"Edinburgh\",\"cod\":200}";
        System.out.println(verifyEquals(expectedResult1, actualResult1));

        //Rotterdam
        expectedResult1 = "{\"coord\":{\"lon\":4.4777,\"lat\":51.9244},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01n\"}],\"base\":\"stations\",\"main\":{\"temp\":285.76,\"feels_like\":285.22,\"temp_min\":283.67,\"temp_max\":287.59,\"pressure\":1023,\"humidity\":82},\"visibility\":10000,\"wind\":{\"speed\":2.06,\"deg\":300},\"clouds\":{\"all\":0},\"dt\":1664739106,\"sys\":{\"type\":1,\"id\":1541,\"country\":\"NL\",\"sunrise\":1664689449,\"sunset\":1664731120},\"timezone\":7200,\"id\":2747891,\"name\":\"Rotterdam\",\"cod\":200}";
        actualResult1 = "{\"coord\":{\"lon\":4.4792,\"lat\":51.9225},\"weather\":[{\"id\":801,\"main\":\"Clouds\",\"description\":\"few clouds\",\"icon\":\"02n\"}],\"base\":\"stations\",\"main\":{\"temp\":285.68,\"feels_like\":285.16,\"temp_min\":283.64,\"temp_max\":287.56,\"pressure\":1023,\"humidity\":83},\"visibility\":10000,\"wind\":{\"speed\":1.54,\"deg\":300},\"clouds\":{\"all\":20},\"dt\":1664739560,\"sys\":{\"type\":1,\"id\":1541,\"country\":\"NL\",\"sunrise\":1664689448,\"sunset\":1664731119},\"timezone\":7200,\"id\":2747891,\"name\":\"Rotterdam\",\"cod\":200}";
        System.out.println(verifyEquals(expectedResult1, actualResult1));

    }

}
