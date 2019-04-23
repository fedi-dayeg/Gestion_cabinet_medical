import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        ////  maitre la menu
            //faire un do while
        //List<Patient> Patients = new ArrayList<Patient>();
       // Patient p = new Patient();
       // p.cree();
        //Patients.add(p);

       /* Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();*/


       Scanner sc = new Scanner(System.in);
       int choix= 0;
        int choix2= 0;
        Patient p =new Patient();
        List<Patient> patients = new ArrayList<Patient>();
        while (choix <= 5) {
           System.out.println("1. Gestion des Pationts");
           System.out.println("2. Gestion des Rendez-Vous");
           System.out.println("3. Gestion des Consultations");
           System.out.println("4. Gestion des Médicaments");
           System.out.println("5. Quitter l'application ");
           System.out.print("Votre Choix: ");
           switch (sc.nextInt()){
               case 1:
                   System.out.println("1. Ajouter Patient");
                   System.out.println("2. Afficher Liste des Patient Patient");
                   System.out.println("3. Retourner au Menu");
                   while  (choix2 <= 3){
                       switch (sc.nextInt()){
                           case 1:
                               p.cree();
                               patients.add(p);
                               System.out.println("1. Ajouter Patient");
                               System.out.println("2. Afficher Liste des Patient Patient");
                               System.out.println("3. Retourner au Menu");
                               break;
                           case 2:
                               patients.forEach(patient -> p.afficher());
                               System.out.println("1. Ajouter Patient");
                               System.out.println("2. Afficher Liste des Patient Patient");
                               System.out.println("3. Retourner au Menu");
                               break;
                       }



                   }
           }
       }
    }
}
