public class LoginGenerator {

    public static void main(String[] args) {

        String[] studentNames = { "Budynek Piotr",
                "Chalupa Krystyna",
                "Wiezowiec Jan",
                "Szkieletor Andrzej",
                "Domek Marianna" };

        for (String fullName : studentNames) {
            String[] eachName = fullName.split(" ");
            String lowerSurmane = eachName[0].toLowerCase();
            String lowerName = eachName[1].toLowerCase();
            String email = lowerName.substring(0, 3) + lowerSurmane.substring(0, 2);
            System.out.println(email + "@student.agh.edu.pl ");
        }
    }
}