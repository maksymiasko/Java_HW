package school;

public class Student {
    public static void main(String[] args) {

//        Ученик 5-го класса Вова Сидоров, 10 лет
//        Ученица 9-го класса Маша Семенова, 14 лет

        String firstName = "Vova";
        String lastName = "Sidorov";
        String gender = "male";
        int classTo = 5;
        int age = 10;

        System.out.println("________________________________");
        System.out.println("First name : \t" + firstName);
        System.out.println("Last name : \t" + lastName);
        System.out.println("Gender : \t\t" + gender);
        System.out.println("Class : \t\t" + classTo);
        System.out.println("Age : \t\t\t" + age);
        System.out.println("________________________________");

        firstName = "Masha";
        lastName = "Semenova";
        gender = "female";
        classTo = 9;
        age = 14;

        System.out.println("________________________________");
        System.out.println("First name : \t" + firstName);
        System.out.println("Last name : \t" + lastName);
        System.out.println("Gender : \t\t" + gender);
        System.out.println("Class : \t\t" + classTo);
        System.out.println("Age : \t\t\t" + age);
        System.out.println("________________________________");

    }
}
