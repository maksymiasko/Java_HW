package homework;

import static homework.HW2.CeltoFarng.ctof;
import static homework.HW2.CeltoKelv.ctok;
import static homework.HW2.Power.power;

public class HW2 {

    public static void main(String[] args) {
//        3. Создать переменную number, присвоить ей значение 3, и перед каждым ответом на последующие задачи
//        выводить на печать:
//
//        Task …
//        где вместо … должен стоять номер задания, распечатанный с помощью переменной number и унарного оператора.
//
//        * Так же можно вывести букву подзадания с помощью переменной
//        char subTask и унарного оператора

        int number = 3;
//        4. Создать целочисленные переменные x, y, z и присвоить им любые значения (на ваше усмотрение)
//        Вывести значения переменных в столбик
//        Вывести значения переменных в строку
//        Вывести значения этих переменных так, чтобы было понятно, какое значение к какой переменной относится.
//        Например, должно быть распечатано:
//        int x = 5;
//        или y = 10;


        int x = 10;
        int y = 20;
        int z = 30;

// Вывод номера таски
        System.out.println("Task : " + ++number);
        System.out.println("________________________________________________________________________________");

// Вывод в столбик
        System.out.println( x );
        System.out.println( y );
        System.out.println( z );

// Вывод в строку
        System.out.println(x + " " + y + " " + z);

// Вывод с переменной
        System.out.println("int x = " + x +"; int y = " + y +"; int z = "+ z +";");
        System.out.println("________________________________________________________________________________");
        System.out.println();


//        5. Используя конкатенацию, вывести в строку через запятую значения переменных из задания 3
//        Пример вывода: 5, 10, 15
        System.out.println("Task : " + ++number);
        System.out.println("________________________________________________________________________________");
        System.out.println( x +", " + y +", " + z );
        System.out.println("________________________________________________________________________________");
        System.out.println();


//        6. Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
//        Sum of x and y = …
//        x * z = …
//        Разность переменных y и z = …
        System.out.println("Task : " + ++number);
        System.out.println("________________________________________________________________________________");
        System.out.println("Sum of x and y = " + (x + y));
        System.out.println("Difference of x and y = " +(x - y));
        System.out.println("Multiply of x and y = " +(x * y));
        System.out.println("________________________________________________________________________________");
        System.out.println();


//        7. Создать переменные apple и student и присвоить им значения 40 и 6 соотетственно.
//        Распечатать выражение, где вместо … - результаты математических вычислений:
//        Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
        int apple = 40;
        int student = 6;

        System.out.println("Task : " + ++number);
        System.out.println("________________________________________________________________________________");
        System.out.println("Если " + apple + " яблок поделить на " + student +
                " учеников, то каждый ученик получит по " + (apple / student) + " яблок(a),\nи "
                 + (apple % student) +" яблок(а) останется учителю.");
        System.out.println("________________________________________________________________________________");
        System.out.println();


//        8. Распечатать выражение из задания 7 со значениями 100 и 21 соответственно.
        apple = 100;
        student = 21;

        System.out.println("Task : " + ++number);
        System.out.println("________________________________________________________________________________");
        System.out.println("Если " + apple + " яблок поделить на " + student +
                " учеников, то каждый ученик получит по " + (apple / student) + " яблок(a),\nи "
                + (apple % student) +" яблок(а) останется учителю.");
        System.out.println("________________________________________________________________________________");
        System.out.println();


//        9.  Решить с помощью переменных и математических вычислений
//        В школьную столовую привезли 6 кг лимонов, яблок на 24 кг больше чем лимонов,
//        а груш на 12 кг меньше чем яблок. Сколько килограммов фруктов привезли в столовую?
        int limes = 6;
        int apples = limes + 24;
        int pears = apples - 12;

        System.out.println("Task : " + ++number);
        System.out.println("________________________________________________________________________________");
        System.out.println("В столовую привезли " + (limes + apples + pears) + "кг фруктов");
        System.out.println("________________________________________________________________________________");
        System.out.println();


//        10. Распечатать выражение с помощью переменных и вычислений:
//        У сороконожки заболели ножки:
//        8 ноют, 5 гудят, 7 хромают, 2 болят.
//        Помоги сороконожке Посчитать здоровые ножки.
//        Ответ: …
        int sick1 = 8;
        int sick2 = 5;
        int sick3 = 7;
        int sick4 = 2;
        int all_legs = 40;

        System.out.println("Task : " + ++number);
        System.out.println("________________________________________________________________________________");
        System.out.println("У сороконожки заболели ножки: "+ sick1 + " ноют, "+sick2 + " гудят, "+sick3 + " хромают, "+sick4 + " болят.");
        System.out.println("Помоги сороконожке посчитать здоровые ножки.");
        System.out.println("Ответ : У сороконожки " + (all_legs - (sick1 + sick2 + sick3 + sick4)) + " здоровых ножек.");
        System.out.println("________________________________________________________________________________");
        System.out.println();


//        11. Рассчитать с помощью математических операторов и вывести на печать задачи и ответы
//        Во сколько раз 35 больше чем 7?
//        Во сколько раз 8 меньше чем 48?
//        На сколько 54 больше чем 6?
        System.out.println("Task : " + ++number);
        System.out.println("________________________________________________________________________________");
        System.out.println("Во сколько раз 35 больше чем 7? \n" + "Ответ : в " + (35 / 7) + " раз.");
        System.out.println("Во сколько раз 8 меньше чем 48? \n" + "Ответ : в " + (48 / 8) + " раз.");
        System.out.println("На сколько 54 больше чем 6? \n" + "Ответ : на " + (54 - 6 ));
        System.out.println("________________________________________________________________________________");
        System.out.println();


//        12. Объяснить:
//        a. почему число 48 кратно 8
//        b. что оба числа - четные.
//        c. что числа 47 и 49 - нечетные.
//        d. только одно из всех чисел кратно 7
        int a = 48;
        int b = 8;
        int c = 47;
        int d = 49;
        int i = 7;

        System.out.println("Task : " + ++number);
        System.out.println("________________________________________________________________________________");
        System.out.println("a. Число 48 кратно 8, так как делится на 8 без остатка: 48 / 8 = " + (a/b));
        System.out.println("b. Оба числа - четные, так как делятся на 2 без остатка: 48 / 2 = " + (a/2) +
                " ,остаток = " + (a%2) + ". И 8 / 2 = " + (b/2) + " ,остаток = " + (b%2));
        System.out.println("c. Числа 47 и 49 - нечетные, так как не делятся на 2 без остатка: 47 % 2 = " + (c%2) + ". И 49 % 2 = " + (d%2));
        System.out.println("d. Только одно число "+ d +" из чисел "+ a +", "+ b +", "+ c +", "+ d +" кратно 7," +
                " так как делится целочисленно на "+ i +":\n" + " 48 % 7\t= " + (a%i) + "\n" + " 8 % 7\t= " + (b%i) +
                "\n" + " 47 % 7\t= " + (c%i) + "\n" + " 8 % 7 \t= " + (d%i));
        System.out.println("________________________________________________________________________________");
        System.out.println();


//        13. Распечатать следующую таблицу,  где результат рассчитывается с помощью применения
//        арифметических и унарных операторов:
        int k = 5;
        int l = 15;
        int m = 25;
        int aa = 10;
        int ab = -5;
        int ac = 100;
        int ad = 2;
        int ae = 3;

        System.out.println("Task : " + ++number);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|  \t\t\t" + "|  " + aa + "\t| " + ab + "\t| *" + ac + "\t|  /" + ad + "\t|  %" + ad
                + "\t| ^" + ae + "\t\t| ++ " + "\t| -- \t|");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("| k = " + k +"\t\t|  " + (k + aa) + "\t| " + (k + ab) + "\t\t| " + (k * ac)
                + "\t|  " + (k / ad) + "\t|  " + (k % ad) + "\t| " + (power(k,ae)) + "\t\t| " + (k + 1) + "\t\t| " + (k - 1) + "\t\t|");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("| l = " + l +"\t|  " + (l + aa) + "\t| " + (l + ab) + "\t| " + (l * ac)
                + "\t|  " + (l / ad) + "\t|  " + (l % ad) + "\t| " + (power(l,ae)) + "\t| " + (l + 1) + "\t| " + (l - 1) + "\t|");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("| m = " + m +"\t|  " + (m + aa) + "\t| " + (m + ab) + "\t| " + (m * ac)
                + "\t|  " + (m / ad) + "\t|  " + (m % ad) + "\t| " + (power(l,ae)) + "\t| " + (m + 1) + "\t| " + (m - 1) + "\t|");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println();


//        14.  Вычислить результат:
//        xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y))
//        если
//        x = 7
//        y = 18
//        n = 3
//
//        Распечатать результат в следующем виде:
//        If
//        x = 7
//        y = 18
//        n = 3
//        then
//        xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = …
//        *if-else здесь не нужны!
        double ax = 7.0;
        double ay = 18.0;
        double an = 3.0;
        double output14 = power(ax,an) * ((5 * ax + 7 * ay) / (8 * ax + 10 * ay)) / (((3 * ax) - ay) / (ax + ay));

        System.out.println("Task : " + ++number);
        System.out.println("_______________________________________________________________________________");
        System.out.println("If");
        System.out.println("x = " + ax);
        System.out.println("y = " + ay);
        System.out.println("n = " + an);
        System.out.println("then");
        System.out.println("xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = " + (int)output14);
        System.out.println("_______________________________________________________________________________");
        System.out.println();


//        15. Записать условие задачи в виде формулы и вычислить ответ:
//        В мастерской за 5 дней сшили 15 костюмов, поровну за каждый день.
//        За сколько дней при той же ежедневной выработке сошьют 69 костюмов?
        System.out.println("Task : " + ++number);
        System.out.println("_______________________________________________________________________________");
        System.out.println("Если за 5 дней сшили 15 костюмов, \n" +
                "то 69 костюмов сошьют за 69 / (15 / 5) =  " + (69 / (15 / 5)) + " дней" );
        System.out.println("_______________________________________________________________________________");
        System.out.println();


//        16. Декларировать и инициализировать переменные a, b, c. Распечатать выражение и результаты вычислений:
//        Сумма чисел a, b, c++ и sumABC-- = …, а разность b++ и  sumCBA = …
        int A = 5;
        int B = 10;
        int C = 15;

        System.out.println("Task : " + ++number);
        System.out.println("_______________________________________________________________________________");
        System.out.println("Сумма чисел A, B, C++ и cумма ABC-- = "+ ((A + B + C++) + (A + B + C)));
        System.out.println("Разность B++ и сумма CBA = " + (B++ - (C + B + A)));
        System.out.println("_______________________________________________________________________________");
        System.out.println();


//        17. Вычислить выражение (x + 3)^2
        x = 7;

        System.out.println("Task : " + ++number);
        System.out.println("_______________________________________________________________________________");
        System.out.println("If x = " + x + " \n(x + 3)^2 = " + (power((x + 3),2.0)));
        System.out.println("_______________________________________________________________________________");
        System.out.println();


//       18. Вычислить выражение
//      ((3 + 4x) / 2) - ((10 * (y - 5) * (a + b + c)) / x) + 9 * ((4 / x) + (9 + x)/y)
        double res18 = ((3 + 4 * x) / 2) - ((10 * (y - 5) * (a + b + c)) / x) + 9 * ((4 / x) + (9 + x)/y);

        System.out.println("Task : " + ++number);
        System.out.println("_______________________________________________________________________________");
        System.out.println("Если :\nx = " + x + "\ny = " + y + "\na = " + a + "\nb = " + b + "\nc = " + c);
        System.out.println("То,\n((3 + 4x) / 2) - ((10 * (y - 5) * (a + b + c)) / x) + 9 * ((4 / x) + (9 + x)/y) = "
                + res18);
        System.out.println("_______________________________________________________________________________");
        System.out.println();


//       18. Вычислить выражение
//       (((5 * x + 7 * y) / (8 * x + 10 * y)) / (3 * x - y) / (x + y)) / (a + b + (c / d) + ((a + b) / (c + d)) + a* b)
        double res19 = (((5 * x + 7 * y) / (8 * x + 10 * y)) / (3 * x - y) / (x + y)) / (a + b + (c / d) + ((a + b) / (c + d)) + a* b);

        System.out.println("Task : " + ++number);
        System.out.println("_______________________________________________________________________________");
        System.out.println("Если :\nx = " + x + "\ny = " + y + "\na = " + a + "\nb = " + b + "\nc = " + c + "\nd = " + d);
        System.out.println("То,\n(((5 * x + 7 * y) / (8 * x + 10 * y)) / (3 * x - y) / (x + y))\n"
                +"/ (a + b + (c / d) + ((a + b) / (c + d)) + a * b) = " +res19);
        System.out.println("_______________________________________________________________________________");
        System.out.println();

//        20. Ввести в программу формулу конвертации температур C° -> F°.
//        Найти на сайте https://openweathermap.org/ температуру в любом городе, и проверьте,
//        соответствует ли температура в С и F вашим рассчетным значениям (использовать только int)
//        Перевод С -> F -> (0 °C × 9/5) + 32 = 32 °F
//        * Кто хочет - проверьте погоду в K (кельвинах) и ее соответствие с рассчетным значением
//        Перевод С -> K -> (0 °C + 273,15) = 273,15 K
        int tempFri = 24;
        int tempSat = 16;
        int tempSun = 18;
        int tempMon = 21;
        int tempTue = 21;
        int tempWed = 18;
        int tempThu = 16;

        System.out.println("Task : " + ++number);
        System.out.println(" ________________________________________________________________________________________________");
        System.out.println("|       \t|Fri, Sep 9\t|Sat, Sep 10|Sun, Sep 11|Mon, Sep 12|Tue, Sep 13|Wed, Sep 14|Thu, Sep 15 |");
        System.out.println(" ________________________________________________________________________________________________");
        System.out.println("| Temp 'C'\t|\t"+ tempFri +"\t\t|\t"+ tempSat +"\t\t|\t"+ tempSun +"\t\t|\t"+ tempMon +"\t\t|\t"
                + tempTue +"\t\t|\t"+ tempWed +"\t\t|\t"+ tempThu+"\t\t |");
        System.out.println(" ________________________________________________________________________________________________");
        System.out.println("| Temp 'F'\t|\t"+ ctof(tempFri) +"\t\t|\t"+ ctof(tempSat)  +"\t\t|\t"+ ctof(tempSun)  +"\t\t|\t"
                + ctof(tempMon) +"\t\t|\t"+ ctof(tempTue) +"\t\t|\t"+ ctof(tempWed) +"\t\t|\t"+ ctof(tempThu)+"\t\t |");
        System.out.println(" ________________________________________________________________________________________________");
        System.out.println("| Temp 'K'\t|\t"+ ctok(tempFri) +"\t|\t"+ ctok(tempSat)  +"\t|\t"+ ctok(tempSun)  +"\t|\t"
                + ctok(tempMon) +"\t|\t"+ ctok(tempTue) +"\t|\t"+ ctok(tempWed) +"\t|\t"+ ctok(tempThu)+"\t |");
        System.out.println(" ________________________________________________________________________________________________");
    }

    public static class Power {
        static double power(double arg, double pow) {
            double res = 1;
            for (int j = 1; j <= pow; j ++) {
                res = res * arg;
            }
            return res;
        }
    }

    public static class CeltoFarng {
        static int ctof(int C) {
            int resFarng = (C * 9 / 5) + 32;
            return resFarng;
        }
    }

    public static class CeltoKelv {
        static double ctok(int C) {
            double resKelv = C + 273.15;
            return resKelv;
        }
    }
}


