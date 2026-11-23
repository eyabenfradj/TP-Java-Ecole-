package ecole;
import java.util.ArrayList;
public class Cours {
    private String intitule;
    private Enseignant responsable;
    private ArrayList<Etudiant> etudiants;
    public Cours(String intitule, Enseignant responsable){
        this.intitule=intitule;
        this.responsable=responsable;
        this.etudiants=new ArrayList<>();
    }
    public void inscrire(Etudiant e){
        etudiants.add(e);
    }
    public void afficherMeilleurEtudiant(){
        if (etudiants.isEmpty()){
            System.out.println("Aucun étudiant inscrit");
            return;
        }
        Etudiant meilleur=etudiants.get(0);
        for (Etudiant e: etudiants){
            if (e.calculerMoyenne() > meilleur.calculerMoyenne()){
                meilleur =e;
            }
        }
        System.out.println("Meilleur étudiant(e) du cour"+intitule);
        meilleur.afficherInfos();
    }
}
