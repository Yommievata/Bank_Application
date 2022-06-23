package Se.lexicon.Yommie;

import Se.lexicon.Yommie.data.ClientStorage;
import Se.lexicon.Yommie.model.BankAccount;
import Se.lexicon.Yommie.model.BankClient;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args )
    {
        ClientStorage clients = new ClientStorage();

       //bankClients = addBankClient(bankClients,bankClients[0]);
       BankClient michael_olusanya = new BankClient("199965238833", "Michael Olusanya", "olusanyaabayomi@yahoo.com", "0764535410");
      // bankClients [1] = new BankClient("1980234532", "Seun Adetoye", "sadetoye@gmail.com", "07336272625");

         clients.addBankClient(michael_olusanya);
         BankClient kayode_olusanya = new BankClient("18294492921","Kayode Olusanya", "olusanyakayode@yahoo.com", "08162350005");
         clients.addBankClient(kayode_olusanya);
         System.out.println(clients);

       String mySSN = michael_olusanya.getSocialSecurityNumber();
        System.out.println("mySSN = " + mySSN);
        System.out.println(michael_olusanya.getEmail());
        System.out.println(michael_olusanya.toString());

        BankAccount michaelBankAccount = new BankAccount(michael_olusanya);
        System.out.println("michaelBankAccount = " + michaelBankAccount);


        BankClient[] all = clients.findall();
        clients.findall()[0].setEmail("michaelolusanya@gmail.com");
        BankClient user1 = all[0];

        BankClient bySSN = clients.findBySSN("18294492921");

        System.out.println("clients = " + clients);


        BankAccount account = new BankAccount(michael_olusanya);
        BankAccount referenceNotACopy = account;

        referenceNotACopy.setBalance(234444333);

        System.out.println(account);
        System.out.println("referenceNotACopy = " + referenceNotACopy);

    }


}
