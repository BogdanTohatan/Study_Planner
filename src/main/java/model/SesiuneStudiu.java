package model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class SesiuneStudiu {

    private UUID id;
    private Materie materie;
    private LocalDate data;
    private int durataMinute;

    //constr

    public SesiuneStudiu(UUID id, Materie materie, LocalDate data, int durataMinute) {
        this.id = id;
        this.materie = materie;
        this.data = data;
        this.durataMinute = durataMinute;
    }

    //getters

    public UUID getId() {

        return id;
    }

    public Materie getMaterie() {
        return materie;
    }

    public LocalDate getData() {
        return data;

    }

    public int getDurataMinute(){
        return durataMinute;
    }


    //setere

    public void setMaterie(Materie materie){
        this.materie=materie;
    }

    public void setData(LocalDate data){
        this.data=data;
    }

    public void setDurataMinute(int durataMinute){
        this.durataMinute=durataMinute;
    }

    @Override
    public String toString() {
        return "SesiuneStudiu{" +
                "id=" + id +
                ", materie=" + materie +
                ", data=" + data +
                ", durataMinute=" + durataMinute +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SesiuneStudiu that = (SesiuneStudiu) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

