import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class ParseCandidat {

    public static Candidat affichecandidat() {
        Candidat candidat = new Candidat();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nom");

        String nom = scanner.nextLine();
        candidat.setNom(nom);

        System.out.println("Entrez le prenom");

        String prenom = scanner.nextLine();
        candidat.setPrenom(prenom);

        System.out.println("Entrez l'âge");

        int âge = scanner.nextInt();
        candidat.setAge(âge);

        System.out.println("Ajoutez des loisirs");
        System.out.println("Ecrire stop pour quitter le remplissage de loisirs");

        String loisirs = scanner.nextLine();
        if (loisirs.equals("stop")) {
            boolean close = true;
            System.out.println("Vous avez ajoutez vos loisirs");
        } else {
            candidat.getLoisirs().add(loisirs);

            do {
                System.out.println("Entrez vos loisirs");
                loisirs = scanner.nextLine();
                candidat.getLoisirs().add(loisirs);

            } while (!loisirs.equals("stop"));

        }

        System.out.println("entrez votre salaire");

        String salaire;
        return candidat;

    }

    public static void main (String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Candidat lecandidat = affichecandidat();

       /* try{
            //JSON file vers objet Java POJO
            Candidat candidat = mapper.readValue(new File("JSON/candidatComplet.json"), Candidat.class);

            //Affichage simple
            System.out.println(candidat);

            //Affichage soigné
            String joliCandidat = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(candidat);
            System.out.println(joliCandidat);

        } catch (IOException e){
            System.err.println("erreur");
        }*/

    }
}
