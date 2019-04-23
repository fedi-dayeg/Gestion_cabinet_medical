import java.util.Date;
import java.util.Scanner;

public class Patient implements TGestion {
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String dateNaissence;
    private String lieuNaissence;
    private String etatCivil;

    /*public Patient(int id, String nom, String prenom, String adresse, String dateNaissence, String lieuNaissence, String etatCivil) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.dateNaissence = dateNaissence;
        this.lieuNaissence = lieuNaissence;
        this.etatCivil = etatCivil;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String  getDateNaissence() {
        return dateNaissence;
    }

    public void setDateNaissence(String dateNaissence) {
        this.dateNaissence = dateNaissence;
    }

    public String getLieuNaissence() {
        return lieuNaissence;
    }

    public void setLieuNaissence(String lieuNaissence) {
        this.lieuNaissence = lieuNaissence;
    }

    public String getEtatCivil() {
        return etatCivil;
    }

    public void setEtatCivil(String etatCivil) {
        this.etatCivil = etatCivil;
    }

    public void  afficher(){
       System.out.println("ID: " + this.getId());
       System.out.println("Nom: " + this.getNom());
        System.out.println("Prenom: " + this.getPrenom());
        System.out.println("Adresse: " + this.getAdresse());
        System.out.println("Date de Naissence: " + this.getDateNaissence());
        System.out.println("Lieu De Naissence: " + this.getLieuNaissence());
        System.out.println("Etat Civile: " + this.getEtatCivil());


    }

    public void cree(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Donner Id: ");
        this.id = sc.nextInt();
        System.out.println("Donner le Nom");
        this.nom = sc.next();

        System.out.println("Donner le Prenom");
        this.prenom = sc.next();

        System.out.println("Donner le Adresse");
        this.adresse = sc.next();

        System.out.println("Donner le Date de Naissence");
        this.dateNaissence = sc.next();

        System.out.println("Donner le Lieu de Naissence");
        this.dateNaissence = sc.next();

        System.out.println("Donner Etat Civile");
        this.dateNaissence = sc.next();
    }


}
