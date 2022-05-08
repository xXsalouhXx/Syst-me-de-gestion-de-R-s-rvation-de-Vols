package aeroport;

import java.util.ArrayList;
import java.util.Collection;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Vol {

    /***** Attributs *****/ 
    private String numero;

    private Aeroport depart;

    private Aeroport arrivee;

    private Compagnie compagnie;

    private Date dateDepart;

    private Date dateArrivee;

    private int nombreReservation;

    private boolean ouvert = false;

    private Collection<reservation.Reservation> reservations = new ArrayList<>();

    public Duration obtenirDuree() {
        if(this.dateDepart != null && this.dateArrivee != null) {
            return Duration.of(dateArrivee.getTime() - dateDepart.getTime(), ChronoUnit.MILLIS);
        }
        return null;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public int getNombreReservation(){
        return nombreReservation;
    }

    public void setNombreReservation(int nombre){
        this.nombreReservation = nombre;
    }

    // Les différents constructeurs
    public Vol() {
    }

    protected Vol(String numero){
        this.numero = numero;
    }

    public Vol(Compagnie compagnie, Aeroport depart, Aeroport arrivee){
        this.compagnie = compagnie;
        this.depart = depart;
        this.arrivee = arrivee;

        // Le numero generer automatiquement
        String num = compagnie.getId()+depart.getId()+arrivee.getId();

        this.numero = num;
    }

    // Relations avec Compagnie
    public Compagnie getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(Compagnie compagnie) {
        if(compagnie!=null) {
            compagnie.addVolWithoutBidirectional(this);
        }
        if(this.compagnie!=null){
            this.compagnie.removeVolWithoutBidirectional(this);
        }
        this.compagnie = compagnie;
    }

    protected void setCompagnieWithoutBidirectional(Compagnie compagnie) {
        this.compagnie = compagnie;
    }

    // Numero des vols
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Aéroports
    public Aeroport getDepart() {
        return depart;
    }

    public void setDepart(Aeroport depart) {
        this.depart = depart;
    }

    public Aeroport getArrivee() {
        return arrivee;
    }

    public void setArrivee(Aeroport arrivee) {
        this.arrivee = arrivee;
    }


    // L'etat du vol
    public boolean getEtat(){
        return ouvert;
    }
    public void ouvrir(){
        this.ouvert = true;
    }

    public void fermer (){
        this.ouvert = false;
    }


    // Les Résérvations
    public void addReervation(reservation.Reservation reservation){
        if(this.ouvert){
            
        }
    }

    // 
    @Override
    public boolean equals(Object obj) {
        try {
            return ((Vol) obj).getNumero().equals(this.numero);
        } catch (Exception e){
            return false;
        }
    }
}
