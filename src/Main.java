import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Lütfen takımları giriniz.\nÇıkmak isterseniz 'h' tuşlayınız...");
            String team = scan.nextLine();
            if (team.equals("h")){ break ;}
            teams.add(team);
        }

        //Print the fixture
        List<String> fikstur = createFixture((ArrayList<String>) teams);
        int tur = 1;
        for (int i = 0; i < fikstur.size(); i++) {
            if (i % (teams.size() / 2) == 0) {
                System.out.println("\nTur " + tur + ":");
                tur++;
            }
            System.out.println(fikstur.get(i));
        }
    }

    //Create fixture method
    public static List<String> createFixture(ArrayList<String> teams){
        List<String> fixture = new ArrayList<>();
        if (teams.size() % 2 == 1 ){
            teams.add("BAY");
        }

        int numberOfTeams = teams.size();
        int numberOfTours= numberOfTeams - 1;
        int numberOfMatchInARound = teams.size()/2;

        //For every tour
        for (int tour=0 ; tour<numberOfTours ; tour++){
            System.out.println("TUR: " + (tour+1));
            List<String> readyTeams = new ArrayList<>(teams);

            for (int match=0 ; match<numberOfMatchInARound ; match++ ){
                String home = readyTeams.get(0);
                String away = readyTeams.get(readyTeams.size() - 1);

                fixture.add(home + " vs " +away);

                //home and away teams are removing the list
                readyTeams.remove(0);
                readyTeams.remove(readyTeams.size()-1);
            }

            //Rotate after the first team
            Collections.rotate(teams.subList(1, numberOfTeams), 1);
        }

        //League's second half
        List<String> reverseFixture = new ArrayList<>();
        for (String match: fixture){
            String[] arrayOfTeams = match.split("vs");
            reverseFixture.add(arrayOfTeams[1] + " vs " + arrayOfTeams[0]);
        }
        fixture.addAll(reverseFixture);
        return fixture;
    }
}