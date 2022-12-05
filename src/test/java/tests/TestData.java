package tests;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Locale;

import static utils.RandomUtils.*;

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

    static String userEmail = randomEmail(10);
}
