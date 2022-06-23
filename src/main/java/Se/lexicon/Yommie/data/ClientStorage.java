package Se.lexicon.Yommie.data;

import Se.lexicon.Yommie.model.BankClient;

import java.util.Arrays;

public class ClientStorage {

    private BankClient [] bankClients = new BankClient[0];
    public ClientStorage(){
        bankClients = new BankClient[0];
    }
     public BankClient[] findall(){
        return bankClients;
     }
     public BankClient findBySSN(String SSN){
        for (int i = 0; i < bankClients.length; i++){
            if (bankClients[i].getSocialSecurityNumber() == SSN){
                return bankClients[i];
            }
        } return null;
     }



    public BankClient[] addBankClient(BankClient toAdd) {
        //Goal: Get BankClient to add in to a Array
        //1. Expand array
        //2. Add to array
        //3. Return new array with added client

        BankClient[] newArray = Arrays.copyOf(this.bankClients, this.bankClients.length + 1);
        newArray[newArray.length - 1] = toAdd;
        bankClients = newArray;
        return bankClients;
    }

    @Override
    public String toString() {
        return "ClientStorage{" +
                "bankClients=" + Arrays.toString(bankClients) +
                '}';
    }
}
