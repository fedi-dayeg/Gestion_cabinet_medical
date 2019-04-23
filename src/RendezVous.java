import java.util.Date;

public class RendezVous {
    //Attribut
    private Date date;
    private String heure;
    static boolean etat;

    //constructeur
    public RendezVous(Date date, String heure) {
        this.date = date;
        this.heure = heure;
    }


    //Getter et Setter
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public static boolean isEtat() {
        return etat;
    }

    public static void setEtat(boolean etat) {
        RendezVous.etat = etat;
    }

}
