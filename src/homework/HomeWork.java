package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by molot on 10.07.2017.
 */
public class HomeWork {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Как тебя зовут?");
            String name = reader.readLine();
        System.out.println("В каком городе ты проживаешь?");
            String city = reader.readLine();
        System.out.println("Сколько тебе лет?");
            int age = Integer.parseInt(reader.readLine());
        System.out.println("Какие твои увлечения?");
            String hobby = reader.readLine();

            //Option number 1
        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);

        System.out.println("------------------------------");

            //Option number 2
        System.out.println("Человек по имени " + name + " живет в городе " + city +"."+
                " Этому человеку " + age + " лет и любит он заниматься " + hobby +".");

        System.out.println("------------------------------");

           //Option number 3
        System.out.println(name + " - имя");
        System.out.println(city + " - город");
        System.out.println(age + " - возраст");
        System.out.println(hobby + " - хобби");
    }
}
