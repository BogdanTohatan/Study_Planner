package model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Materie {

    //campuri

    private UUID id ;
    private String nume ;
    private int  nrCredite;
    private LocalDate dataExamen;

    //constructor

   public Materie(UUID id , String nume , int nrCredite, LocalDate dataExamen){
       this.id= id;
       this.nume =nume;
       this.nrCredite= nrCredite;
       this.dataExamen= dataExamen;

   }

   //getters

    public UUID getId(){
       return id;
    }

    public String getNume(){
       return nume ;

    }

    public int getNrCredite(){
       return nrCredite;
    }

    public LocalDate getDataExamen(){
       return dataExamen;
    }

    //setters

    public void setNume(String numeNou){
       this.nume= numeNou;
    }

    public void setNrCredite(int nrCredite){
       this.nrCredite= nrCredite;
    }

    public void setDataExamen(LocalDate dataExamen){
       this.dataExamen =dataExamen;
    }


    @Override
    public String toString() {
        return "Materie{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", nrCredite=" + nrCredite +
                ", dataExamen=" + dataExamen +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Materie materie = (Materie) o;
        return Objects.equals(id, materie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

