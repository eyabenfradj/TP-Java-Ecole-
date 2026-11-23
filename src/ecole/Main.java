package ecole;

public class Main {
    public static void main(String[] args){
        Etudiant e1= new Etudiant("Tounsi","Sara","sara.tounsi@gmail.com","E001");
        Etudiant e2= new Etudiant("Tounsi","Mohammed","mohammed.tounsi@gmail.com","E002");
        e1.ajouterNote(15);
        e1.ajouterNote(17);
        e2.ajouterNote(14);
        e2.ajouterNote(18);
        Enseignant p1=new Enseignant("Ben Salem","Mohamed","Mohamed.BenSalem@gmail.com","Informatique",15);
        Enseignant p2=new Enseignant("Ben Mohammed","Sondes","Sondes.BenMohammed@gmail.com","Gestion",18);
        Personne[] personnes={e1,e2,p1,p2};
        for(int i=0;i<personnes.length;i++){
            personnes[i].afficherInfos();
            System.out.println();
        }
        Cours cours= new Cours("Informatique",p1);
        cours.inscrire(e1);
        cours.inscrire(e2);
        cours.afficherMeilleurEtudiant();
    }
}
