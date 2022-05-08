package aeroport;

import java.util.ArrayList;
import java.util.Collection;

public class Compagnie {
    /***** Attributs *****/ 
    private String name;

    private String id;

    private Collection<Vol> vols = new ArrayList<>();


    // Les constructeurs
    public Compagnie() {
    }


    // Nom
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Id
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }


    // Les vols de la Compagnie
    public Collection<Vol> getVols() {
        return vols;
    }

    public void setVols(Collection<Vol> vols) {
        for(Vol v : this.vols){
            v.setCompagnieWithoutBidirectional(null);
        }

        this.vols = vols;

        if(this.vols != null) {
            for (Vol v : this.vols) {
                v.setCompagnieWithoutBidirectional(this);
            }
        }
    }

    public void addVol(Vol vol){
        vol.setCompagnieWithoutBidirectional(this);
        this.vols.add(vol);
    }

    public void removeVol(Vol vol){
        vol.setCompagnieWithoutBidirectional(null);
        this.vols.remove(vol);
    }

    protected void setVolsWithoutBidirectional(Collection<Vol> vols) {
        this.vols = vols;
    }

    protected void addVolWithoutBidirectional(Vol vol){
        this.vols.add(vol);
    }

    protected void removeVolWithoutBidirectional(Vol vol){
        this.vols.remove(vol);
    }
}
