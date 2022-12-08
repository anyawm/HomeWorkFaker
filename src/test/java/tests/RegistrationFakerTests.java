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
                .setGender(userSex)
                .setPhone(userPhone)
                .setBirthDay(userBirthDay, userBirthMonth, userBirthYear)
                .setSubject(userSubject)
                .setHobbies(userHobbies)
                .setAddress(userAddress)
                .setState(userState)
                .setCity(userCity)
                .setPhoto("img/kote.jpg")
                .submitButton()
                .registrationResultsModalAppears()
                .verifyResults("Student name", userName + " " + lastName)
                .verifyResults("Student email", userEmail)
                .verifyResults("Gender", userSex)
                .verifyResults("Mobile", userPhone)
                .verifyResults("Date of Birth", userBirthDay + " " + userBirthMonth + "," + userBirthYear)
                .verifyResults("Subjects", userSubject)
                .verifyResults("Hobbies", userHobbies)
                .verifyResults("Picture", "kote.jpg")
                .verifyResults("Address", userAddress)
                .verifyResults("State and City", userState + " " + userCity);
    }

}

