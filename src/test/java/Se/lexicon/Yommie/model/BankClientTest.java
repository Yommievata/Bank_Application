package Se.lexicon.Yommie.model;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.sound.midi.Sequence;

import static org.junit.Assert.*;

public class BankClientTest {


    @Test
    public void test_successfullyCreated_BankClient() {

        //Arrange
        String SSN = "1999348282";
        String fullName = "Test Testing";
        String email = "Testing@gmail.com";
        String phoneNumber = "0987654321";

        //Act
        BankClient actual = new BankClient(SSN, fullName, email, phoneNumber);


        //Assert
        assertEquals(SSN, actual.getSocialSecurityNumber());
        assertEquals(fullName, actual.getFullName());
        assertEquals(email, actual.getEmail());
        assertEquals(phoneNumber, actual.getPhoneNumber());
    }
}