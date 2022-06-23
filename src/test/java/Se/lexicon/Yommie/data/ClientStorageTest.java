package Se.lexicon.Yommie.data;

import Se.lexicon.Yommie.model.BankClient;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientStorageTest {

    ClientStorage testObject;

    @Before
    public void setUp() {
        testObject = new ClientStorage();
    }

    @Test
    public void test_addBankClient() {
        //Arrange
        // creating test client
        BankClient testClient = new BankClient("199929338383", "Test Tessing", "testing@gmail.com", "0987654321");
         //adding it to a array
        BankClient[] expected = {testClient};

        //Act
        //checking that storage is empty
        assertTrue(testObject.findall().length == 0);
        //adding to the storage array
        BankClient[] actual = testObject.addBankClient(testClient);

        // Assert
        //checking if array is equal
assertArrayEquals(expected, actual);
    }
}