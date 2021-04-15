package ru.netology;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private Faker faker = new Faker(new Locale("ru"));

    public static String generateCity(){
        String[] cityList = new String[]{"Абакан", "Архангельск", "Астрахань", "Барнаул", "Белгород", "Благовещенск", "Брянск", "Великий Новгород", "Владивосток", "Владимир", "Волгоград", "Вологда", "Воронеж", "Горно-Алтайск", "Грозный", "Екатеринбург", "Иваново", "Ижевск", "Иркутск", "Йошкар-Ола", "Казань", "Калининград", "Калуга", "Кемерово", "Киров", "Кострома", "Краснодар", "Красноярск", "Курган", "Курск", "Кызыл", "Липецк", "Магадан", "Магас", "Майкоп", "Махачкала", "Москва", "Мурманск", "Нальчик", "Нарьян-Мар", "Нижний Новгород", "Новосибирск", "Омск", "Орёл", "Оренбург", "Пенза", "Пермь", "Петрозаводск", "Петропавловск-Камчатский", "Псков", "Ростов-на-Дону", "Рязань", "Салехард", "Самара", "Санкт-Петербург", "Саранск", "Саратов", "Севастополь", "Симферополь", "Смоленск", "Ставрополь", "Сыктывкар", "Тамбов", "Тверь", "Томск", "Тула", "Тюмень", "Улан-Удэ", "Ульяновск", "Уфа", "Хабаровск",};
        Random random = new Random();
        int city = random.nextInt(cityList.length);
        return cityList[city];
    }

    public static String generateDate(int shift){
        String date = formatter.format(LocalDate.now().plusDays(shift));
        return date;
    }

    public String generateName(){
        return faker.name().lastName() + " " + faker.name().firstName();
    }

    public String generatePhone(){
        return faker.phoneNumber().phoneNumber();
    }
}
