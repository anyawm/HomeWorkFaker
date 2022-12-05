package utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    public static void main(String[] args) {

        String [] names = {"a", "b", "c", "d", "e"};
        System.out.println(randomSubject(names));

        System.out.println(randomString(7));
        System.out.println(randomEmail(10));
        System.out.println(randomNumber(1000000L, 9999999L));
        System.out.println(randomPhone("+7", 9121111111L, 9129999999L));

/*        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);*/

        System.out.println(RandomStringUtils.random(10, false, true));
        System.out.println(RandomStringUtils.random(10, true, false));
        System.out.println(RandomStringUtils.random(10, false, false));
        System.out.println(RandomStringUtils.random(10, true, true));

    }
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

    static Long randomNumber(Long min, Long max){
        return ThreadLocalRandom.current().nextLong(min, max);
    }

    public static String randomPhone(String prefix, Long min, Long max){
        return prefix + randomNumber(min, max);
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max-min)+1) + min;

    }

    public static String randomSubject(String[] values){
        int index = randInt(0, values.length);
        return values[index];
    }



   /*    public static void main(String[] args) {
        System.out.println(generateString());
    }

    public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return "uuid = " + uuid;
    }*/
}
