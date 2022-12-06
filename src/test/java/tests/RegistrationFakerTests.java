package tests;

import org.junit.jupiter.api.Test;

import static tests.TestData.*;



public class RegistrationFakerTests extends TestBase {


    @Test
    void successfulRegistrationTest() {


        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender("Other")
                .setPhone(userPhone)
                .setBirthDay(userBirthDay, userBirthMonth, userBirthYear)
                .setSubject("Math")
                .setHobbies("Sports")
                .setAddress(userAddress)
                .setState("NCR")
                .setCity("Delhi")
                .setPhoto("img/kote.jpg")
                .submitButton()
                .registrationResultsModalAppears()
                .verifyResults("Student name", userName + " " + lastName)
                .verifyResults("Student email", userEmail)
                .verifyResults("Gender", "Other")
                .verifyResults("Mobile", userPhone)
                .verifyResults("Date of Birth", userBirthDay + " " + userBirthMonth + "," + userBirthYear)
                .verifyResults("Subjects", "Maths")
                .verifyResults("Hobbies", "Sports")
                .verifyResults("Picture", "kote.jpg")
                .verifyResults("Address", userAddress)
                .verifyResults("State and City", "NCR Delhi");
    }

}

