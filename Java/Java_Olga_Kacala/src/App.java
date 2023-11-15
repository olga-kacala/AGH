public class App {
    public static void main(String[] args) throws Exception {
        String name = "Piotr";
        String surname = "Budynek";
        long tel = 123456789;
        String city = "Krakow";
        String frame = "";
        String sentence = "* tel. " + tel + " adres: " + city;
        int l = sentence.length();

        for (int i=1; i<=sentence.length(); i++){
frame += "*";
        }
            System.out.println(frame);
            System.out.println("* " + name + " " + surname);
            System.out.println(sentence);
            System.out.println(frame);
         
    }   
}
