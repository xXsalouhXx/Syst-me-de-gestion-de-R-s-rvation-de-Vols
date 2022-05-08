package reservation;

import java.util.Date;
import java.util.Collection;
import java.util.ArrayList;

public class Reservation {

    /***** Attributs *****/ 
    private String numero; 

    // !!!!!!!!!!!!
    private Client client;
    private String nomClient;

    private Collection<String> passagers = new ArrayList<>();

    private Date date;

    private boolean confirme = false; // Confirmé ou annulé
    

    
    /***** Methodes *****/ 

    // Constructeurs
    public  Reservation() {

    }

    // Numéro de reservation
    // On compte gérer le numéro de la réservation depuis le vol !!!!!!!!
    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }


    // Le Client qui a effectuer la résérvation
    public Client getClient() {
        return client;
    }

    public void setClient(Client client){ // Bidirectionel
        if(client != null){
            client.addReservationWithoutBidirectional(this);
        }
        if(this.client != null){
            this.client.removeReservationWithoutBidirectional(this);
        }
        this.client = client;
        this.nomClient = client.getNom();
    }
    public void setClientWithoutBiderctional(Client client){ // Unidirectionel
        this.client = client;
        this.nomClient = client.getNom();
    }

    public String getNomClient(){
        return nomClient;
    }

    // Le nom du client va être récupérer directement depuis l'objet Client donc pas besoin d'un seteur pour le nom du client


    // les passagers
    public Collection<String> getPassagers(){
        return passagers;
    }

    public void setPassagers(Collection<String> passagers){ // Ajouter directement une liste qui contient le nom des passagers
        this.passagers = passagers;
    }

    public void setPassager(String passager){// pour ajouter un "seul" passager
        this.passagers.add(passager);
    }

    // La date de la réservation
    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }


    // Les deux prochaines méthode je pense que ca sera pour l'état de la réservation
    public void confirmer(){
        this.confirme = true;
    }

    public void annuler(){
        this.confirme = false;
    }

    public boolean getEtat(){
        return confirme;
    }
}
