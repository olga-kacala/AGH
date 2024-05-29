import java.util.ArrayList;
import java.util.Objects;

public class BankCard extends Card {
    private String bankAccount;

    public BankCard(String name, String surname, String tel, String adress, String bankAccount) {
        super(name, surname, adress, tel);
        this.bankAccount = bankAccount;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String getSymbol() {
        return "$";
    }

    protected ArrayList<String> getLines() {

        ArrayList<String> abcList = super.getLines();
        abcList.add(" " + bankAccount);

        return abcList;

    }

    // Override equals method to compare BankCard objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;
        BankCard bankCard = (BankCard) obj;
        return Objects.equals(bankAccount, bankCard.bankAccount);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bankAccount);
    }

}