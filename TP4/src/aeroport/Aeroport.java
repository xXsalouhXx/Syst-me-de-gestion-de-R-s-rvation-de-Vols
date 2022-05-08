package aeroport;

public class Aeroport {

    private String nom;

    private String id; // Un id pour référencier les Aéroports

    private String ville;

    public Aeroport(){

    }
    
    public Aeroport(String ville) {
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
