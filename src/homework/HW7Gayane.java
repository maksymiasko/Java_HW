package homework;

public class HW7Gayane {

            /* Task30-----------------------------
         Прочитать ссылку про оператор switch в документации, посмотреть видео,
         и переписать проверки дат из кода, который выставляла Гаяна в субботу,
         8 октября (ДЗ 6, последняя задача), с помощью оператора switch.
         В документации Oracle есть практически готовое решение + Гаяна уже все прописала,
         только надо “допилить” код под наши нужды.
         Написать эту проверку в отдельном методе и подключить проверку в метод
         printEightDaysFromDate.
         Написать метод, который принимает на вход параметры
         day = “Sun”, month = 10, date = 2, и выводит на печать последовательность:
         */


    public static String returnMonth(int month) {
        switch (month) {
            case 1:

                return "Jan";
            case 2:

                return "Feb";
            case 3:

                return "Mar";
            case 4:

                return "Apr";
            case 5:

                return "May";
            case 6:

                return "Jun";
            case 7:

                return "Jul";
            case 8:

                return "Aug";
            case 9:

                return "Sep";
            case 10:

                return "Oct";
            case 11:

                return "Nov";
            case 12:

                return "Dec";

            default:

                return "Invalid month";
        }
    }

    public static String returnDayOfTheWeek(int number) {
        switch (number) {
            case 1:

                return "Mon";
            case 2:

                return "Tue";
            case 3:

                return "Wed";
            case 4:

                return "Thu";
            case 5:

                return "Fri";
            case 6:

                return "Sat";
            case 7:

                return "Sun";

            default:

                return "Invalid week day";
        }
    }

    public static int returnDayOfTheWeek(String dayName) {
        switch (dayName) {
            case "Mon":

                return 1;
            case "Tue":

                return 2;
            case "Wed":

                return 3;
            case "Thu":

                return 4;
            case "Fri":

                return 5;
            case "Sat":

                return 6;
            case "Sun":

                return 7;
            default:

                return 0;
        }
    }



    public static int returnDate(int date) {
        if (date < 10) {
            String number = String.format("%03d", date);

            return Integer.parseInt(number);
        } else {
            return date;
        }
    }


    public static void printEightDaysFromDate(String day, int month, int date) {
        int l = 8;
        if (returnDayOfTheWeek(day) == 0 || returnMonth(month).equals("Error") || month <= 0 || date <= 0) {
            System.out.println("Please enter correct data.");
        } else if (month <= 7 && month % 2 == 1 && date > 31) {
            System.out.println("Please enter correct date.");
        } else if (month >= 8 && month <= 12 && month % 2 == 0 && date > 31) {
            System.out.println("Please enter correct date.");
        } else if ((month == 4 || month == 6 ||  month == 9 || month == 11) && date > 30) {
            System.out.println("Please enter correct date.");
        }
        else if (month == 2 && date > 28) {
            System.out.println("Please enter correct date.");
        } else {
            for (int i = returnDayOfTheWeek(day); i <= 7 && l > 0; i++, date++, l--) {
                if (i != 7) {
                    if ((month <= 7 && month % 2 != 0 && returnDate(date) >= 32)
                            || ((month == 9 || month == 11) && returnDate(date) >= 31)
                            || ((month == 4 || month == 6) && returnDate(date) >= 31)
                            || (month >= 8 && month <= 12 && month % 2 == 0 && returnDate(date) >= 32)
                            || (month == 2 && returnDate(date) >= 29)) {
                        date = 1;
                        month +=1;
                    }

                    System.out.println(returnDayOfTheWeek(i) + ", " + returnMonth(month) + " " + returnDate(date));
                } else {
                    System.out.println(returnDayOfTheWeek(i) + ", " + returnMonth(month) + " " + returnDate(date));
                    i = 0;
                }
            }
        }
    }
    public static void main(String[] args) {

        String day = "Thu";
        int month = 2;
        int date = 28;

        printEightDaysFromDate(day, month, date);

    }
}


