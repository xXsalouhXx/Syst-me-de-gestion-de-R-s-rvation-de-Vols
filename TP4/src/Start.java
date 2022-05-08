import aeroport.Aeroport;
import aeroport.Compagnie;
import aeroport.Vol;
import reservation.Reservation;
import reservation.Client;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Start {

    public static void main(String[] args){

        /*
        // Creer une Map pour les compagnie
        HashMap<String , String> listeCompagnie = new HashMap<String, String>();
        listeCompagnie.put("LYS", "Lyon Saint-Exsupery");
    
        // Creer une Map pour les aeroports
        HashMap<String , String> listeAeroport = new HashMap<String , String>();
        listeAeroport.put("AH", "Air France");
        */

        // Création d'une compagnie 
        Compagnie c1 = new Compagnie();
        c1.setName("Air France");
        c1.setId("AH");

        // Création d'un vol
        Aeroport a1 = new Aeroport("Lyon");
        a1.setNom("Aeroport de Lyon");
        a1.setId("LYS");

        Aeroport a2 = new Aeroport("Paris");
        a2.setNom("Aeroport de Paris-Orly");
        a2.setId("ORY");

        Vol v1 = new Vol(c1, a1, a2);
        
        //System.out.println(v1.getNumero());

        //********* Creation d'un client ************/
        Client client1 = new Client();
        client1.setNom("Lacheheb");
        client1.setReference("LACH0001");
        client1.setContact("0629523287");
        client1.setPaiement("CB:1999");

        /********** Creation d'une nouvelle reservation */
        Reservation res1 = new Reservation();
        res1.setNumero("res:1234");
        res1.setClient(client1);
        System.out.println("nom : "+res1.getNomClient());

        Collection<Reservation> retour = new ArrayList<>();
        retour = client1.getReservations();
        for(Reservation r : retour){
            System.out.println(r.getNumero());
        }
        
        Client client2 = new Client();
        client1.setNom("mourad");
        client1.setReference("Mek0002");
        client1.setContact("gmail@com");
        client1.setPaiement("CB:1965");

        res1.setClient(client2);
        System.out.println("nom : "+res1.getNomClient());

        Reservation res_2 = new Reservation(); res_2.setNumero("res_2");
        Reservation res_3 = new Reservation(); res_3.setNumero("res_3");
        Reservation res_4 = new Reservation(); res_4.setNumero("res_4");

        Client cl_1 = new Client();
        cl_1.setNom("Salah");
        Client cl_2 = new Client();
        cl_2.setNom("Karim");

        res_2.setClient(cl_1);
        res_3.setClient(cl_1);
        res_4.setClient(cl_2);
        
        System.out.println("\n\n\n\n\n************\n");


        System.out.print("la liste des reservation du client cl_1 est : ");
        Collection<Reservation> retour_cl_1 = new ArrayList<>();
        retour_cl_1 = cl_1.getReservations();
        for(Reservation r : retour_cl_1){
            System.out.print(r.getNumero()+" ");
        }
        System.out.println("\n");
        System.out.print("et la liste des reservation du client cl_2 est : ");
        Collection<Reservation> retour_cl_2 = new ArrayList<>();
        retour_cl_2 = cl_2.getReservations();
        for(Reservation r : retour_cl_2){
            System.out.print(r.getNumero()+" ");
        }
        System.out.println("\n");

        System.out.println("Ouuups! il y'a eu une erreur c'est le cl_2 qui a effectuer la res_3\n");
        res_3.setClient(cl_2);

        System.out.print("Donc la liste des reservation du client cl_1 devient : ");
        retour_cl_1 = cl_1.getReservations();
        for(Reservation r : retour_cl_1){
            System.out.print(r.getNumero()+" ");
        }
        System.out.println("\n");

        System.out.print("et la liste des reservation du client cl_2 devient : ");
        retour_cl_2 = cl_2.getReservations();
        for(Reservation r : retour_cl_2){
            System.out.print(r.getNumero()+" ");
        }

        
        
        /*
        // Creation d'un Client
        Client cl1 = new Client();
        cl1.setNom("Lacheheb");
        cl1.setReference("AHL123");

        System.out.println(cl1.getNom() +" "+ cl1.getReference());
        // Creation d'une résérvation
        Reservation r1 = new Reservation();
        r1.setNumero("Res1");

        */
    /*    Vol volFinal = new Vol();

        Compagnie Compagnie1 = new compagnie();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        String dd = "21/10/2020 13:00";
        String da = "23/10/2020 02:15";

        try {
            volFinal.setDateDepart(format.parse(dd));
            volFinal.setDateArrivee(format.parse(da));
        } catch (Exception e){
            throw new RuntimeException("Unable to format to date");
        }

        System.out.println(volFinal.getDateArrivee());
        System.out.println(volFinal.obtenirDuree().toString().substring(2));





        //Bidirectional
        Vol vol = new Vol();
        vol.setNumero("abc1");

        Vol vol2 = new Vol();
        vol2.setNumero("abc2");

        Compagnie compagnie = new Compagnie();
        compagnie.setName("Air France");
        compagnie.addVol(vol);
        compagnie.addVol(vol2);

        for(Vol v : compagnie.getVols()){
            System.out.println(v.getNumero());
        }

        System.out.println(vol.getCompagnie().getName());
        System.out.println(vol2.getCompagnie().getName());

        vol2.setCompagnie(null);
        System.out.println(vol2.getCompagnie());

        for(Vol v : compagnie.getVols()){
            System.out.println(v.getNumero());
        }
    }*/
}
}
