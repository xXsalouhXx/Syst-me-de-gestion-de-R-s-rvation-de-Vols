package reservation;

import java.util.ArrayList;
import java.util.Collection;

public class Client{

    /***** Attributs *****/ 
    private String nom;

    private String reference;

    private String paiement; 

    private Collection<String> contact = new ArrayList<>();

    private Collection<Reservation> listeReservations = new ArrayList<>();

    // Constructeurs
    public  Client(){

    }


    // Nom du client
    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }


    // La référence du client
    public String getReference(){
        return reference;
    }

    public void setReference(String reference){
        this.reference = reference;
    }


    // paiement
    public String getPaiement(){
        return paiement;
    }

    public void setPaiement(String paiement){
        this.paiement = paiement;
    }


    // Contact du client
    public Collection<String> getContact(){
        return contact;
    }

    public void setContact(String contact){
        this.contact.add(contact);
    }


    // Effectuer une reservation
    public void effectuer(){
        
    }

    // Gestion bidirectionelle des reservations
    public void addReservation(Reservation reservation){
        reservation.setClientWithoutBiderctional(this);
        this.listeReservations.add(reservation);
    }
    public void removeReservation(Reservation reservation){
        reservation.setClientWithoutBiderctional(null);
        this.listeReservations.remove(reservation);
    }

    // Gestion Unidirectionelle des reservations
    public void addReservationWithoutBidirectional(Reservation reservation){
        this.listeReservations.add(reservation);
    }
    public void removeReservationWithoutBidirectional(Reservation reservation){
        this.listeReservations.remove(reservation);
    }

    public Collection<Reservation> getReservations(){
        return listeReservations;
    }
}