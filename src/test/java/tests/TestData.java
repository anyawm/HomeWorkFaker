package tests;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class TestData {
   static Faker faker = new Faker();
   static SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
   static String[] birthday = dateFormat.format(faker.date().birthday()).split(" ");

    static String userName = faker.name().firstName(),
           lastName = faker.name().lastName(),
           userBirthDay = birthday[0],
           userBirthMonth = birthday[1],
           userBirthYear = birthday[2],
           userAddress = faker.address().fullAddress(),
            userPhone = faker.phoneNumber().subscriberNumber(10);

    public static String randomString(int len){
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public static String randomEmail(int len){
        return randomString(len) + "@guru.qa";
    }

    static String userEmail = randomEmail(10);
}
