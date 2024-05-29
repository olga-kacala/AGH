import java.util.ArrayList;
import java.util.Objects;

public class Card {
    private String name;
    private String surname;
    private String tel;
    private String adress;

    public Card(String name, String surname, String tel, String adress) {
        this.name = name;
        this.surname = surname;
        this.tel = tel;
        this.adress = adress;
    }

    public Card(String name, String surname) {
        this(name, surname, "12345", "Krakow");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTel() {
        return tel;
    }

    public String getAdress() {
        return adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getSymbol() {
        return "*";
    }

    // function print from task 1-2

    // public void print() {
    // ArrayList<String> lines = getLines();

    // int maxLength = getMaxLength(lines);

    // String starsLine = "";
    // for (int i = 0; i < maxLength + 2; i++) {
    // starsLine += getSymbol();
    // }

    // System.out.println(starsLine);

    // for (String line : lines) {
    // int lengthDiff = maxLength - line.length();

    // for (int i = 0; i < lengthDiff; i++) {
    // line += " ";
    // }

    // line = getSymbol() + line + getSymbol();

    // System.out.println(line);
    // }

    // System.out.println(starsLine);
    // }

    // private int getMaxLength(ArrayList<String> lines) {
    // int maxLength = 0;

    // for (String line : lines) {
    // int lineLength = line.length();

    // if (lineLength > maxLength) {
    // maxLength = lineLength;
    // }
    // }

    // return maxLength;
    // }

    // protected ArrayList<String> getLines() {
    // ArrayList<String> lines = new ArrayList<>();

    // lines.add(" " + name + " " + surname + " ");
    // lines.add(" tel. " + tel + " adress: " + adress + " ");

    // return lines;
    // }

    // }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ArrayList<String> lines = getLines();
        int maxLength = getMaxLength(lines);

        String starsLine = "";
        for (int i = 0; i < maxLength + 2; i++) {
            starsLine += getSymbol();
        }
        result.append(starsLine).append("\n");

        for (String line : lines) {
            int lengthDiff = maxLength - line.length();
            for (int i = 0; i < lengthDiff; i++) {
                line += " ";
            }
            line = getSymbol() + line + getSymbol();
            result.append(line).append("\n");
        }
        result.append(starsLine);

        return result.toString();
    }

    protected ArrayList<String> getLines() {
        ArrayList<String> lines = new ArrayList<>();
        lines.add(" " + name + " " + surname + " ");
        lines.add(" tel. " + tel + " address: " + adress + " ");
        return lines;
    }

    private int getMaxLength(ArrayList<String> lines) {
        int maxLength = 0;
        for (String line : lines) {
            int lineLength = line.length();
            if (lineLength > maxLength) {
                maxLength = lineLength;
            }
        }
        return maxLength;
    }

    // Override equals method to compare Card objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Card card = (Card) obj;
        return Objects.equals(name, card.name) &&
                Objects.equals(surname, card.surname) &&
                Objects.equals(tel, card.tel) &&
                Objects.equals(adress, card.adress);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, tel, adress);
    }
}
