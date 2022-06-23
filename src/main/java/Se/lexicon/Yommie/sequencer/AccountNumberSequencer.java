package Se.lexicon.Yommie.sequencer;

public class AccountNumberSequencer {

    private static int accountNumberSequence;

    public static int getNextid(){
        accountNumberSequence = accountNumberSequence +1;
        return AccountNumberSequencer.accountNumberSequence;
    }




}
