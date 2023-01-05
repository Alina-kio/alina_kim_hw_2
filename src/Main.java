// Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
// При вызове метода, который формирует результат “можно ли идти гулять”
// использовать генерирование случайного возраста с помощью метода “generateRandomAge” test(23, 10); test(generateRandomAge(), 10);

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println(ageAndTemperature(60, -4));
        System.out.println("");
        System.out.println(ageAndTemperature(2, 40));
        System.out.println("");
        System.out.println(ageAndTemperature(14, -15));
        System.out.println("");
        System.out.println(ageAndTemperature(50, 15));
        System.out.println("");
        System.out.println(ageAndTemperature(22, -40));



        System.out.println("");
        System.out.println(ageAndTemperature(generateRandomAge(0, 100), 10));
    }

    public static String ageAndTemperature(int age, int temperature) {
        if (20 < age && age < 45){
            if (-20 < temperature && temperature < 30){
                System.out.println("Можно идти гулять");
            }
        }

        if (age < 20){
            if (0 < temperature && temperature < 28){
                System.out.println("Можно идти гулять");
            }
        }

        if (45 < age){
            if (-10 < temperature && temperature < 45){
                System.out.println("Можно идти гулять");
            }
        }

        else {
            System.out.println("Оставайтесь дома");
        }

        String data = "Возраст человека = " + age + " Температура на улице = " + temperature;
        return data;
    }



    public static int generateRandomAge(int min, int max){
        int x = (int) ((Math.random() * (max - min + 1)) + min);   // 101
        return x;
    }
}



