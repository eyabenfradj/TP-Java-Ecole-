package ecole;

public class Enseignant extends Personne {
    private String specialite;
    private int nbHeures;
    public Enseignant(String nom, String prenom, String email, String specialite, int nbHeures){
        super(nom, prenom, email);
        this.specialite=specialite;
        this.nbHeures=nbHeures;
    }
    public String getSpecialite(){
        return this.specialite;
    }
    public int getNbHeures(){
        return this.nbHeures;
    }
    @Override
    public String getRole(){
        return "Enseignant";
    }
    @Override
    public void afficherInfos(){
        super.afficherInfos();
        System.out.println("Spécialité: "+ specialite);
        System.out.println("Heures: "+ nbHeures);
    }
}
