package weather;

public class Weather {
    public static void main(String[] args) {

//        30. В проекте JavaForBeginners05 создайте пакет weather. Затем создайте необходимый класс, переменные, и выведите на печать
//                - текущую погоду
//                - погоду на завтра
//        в любом городе.
//        (Желательно использовать сайт https://openweathermap.org/ для поиска данных)

        String city = "London, GB";
        String dayToday = "Thu, Sep 1";
        String dayTomorow = "Fri, Sep 2";
        String weatherToday = "The high will be 23°C, the low will be 17°C.";
        String weatherTomorow = "The high will be 25°C, the low will be 17°C.";
        String rainingToday = "Overcast clouds. Moderate breeze.";
        String rainingTomorow = "Light rain. Gentle Breeze.";

        System.out.println("___________________________________________________________________________________________________");
        System.out.println("City, Country : " + city);
        System.out.println("___________________________________________________________________________________________________");
        System.out.println("Date : \t\t\t" + "Temperature : \t\t\t\t\t\t\t\t\t" + "Raining : ");
        System.out.println(dayToday +"\t\t"+ weatherToday +"\t"+ rainingToday);
        System.out.println("___________________________________________________________________________________________________");

//        System.out.println("City, Country : " + city);
//        System.out.println("_________________________________________________________________________________________________");
        System.out.println("Date : \t\t\t" + "Temperature : \t\t\t\t\t\t\t\t\t" + "Raining : ");
        System.out.println(dayTomorow +"\t\t"+ weatherTomorow +"\t"+ rainingTomorow);
        System.out.println("___________________________________________________________________________________________________");







    }
}
