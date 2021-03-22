import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Candidat {

    private String nom,prenom;
    private int age;
    private List<String> loisirs = new ArrayList<String>();
    private Map salaire;
    private List<String> competences = new ArrayList<String>();
    private Map experiences;
    private Boolean disponible;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getLoisirs() {
        return loisirs;
    }

    public void setLoisirs(List<String> loisirs) {
        this.loisirs = loisirs;
    }

    public Map getSalaire() {
        return salaire;
    }

    public void setSalaire(Map salaire) {
        this.salaire = salaire;
    }

    public List<String> getCompetences() {
        return competences;
    }

    public void setCompetences(List<String> competences) {
        this.competences = competences;
    }

    public Map getExperiences() {
        return experiences;
    }

    public void setExperiences(Map experiences) {
        this.experiences = experiences;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", loisirs=" + loisirs +
                ", salaire=" + salaire +
                ", competences=" + competences +
                ", experiences=" + experiences +
                ", disponible=" + disponible +
                '}';
    }
}
