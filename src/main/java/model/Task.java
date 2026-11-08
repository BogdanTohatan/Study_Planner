package model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Task {

    private UUID id;
    private String titlu;
    private String descriere;
    private LocalDate deadline;
    private Difficulty dificultate;
    private TaskStatus status;
    private Materie materie;


    public Task(UUID id, String titlu , String descriere, LocalDate deadline , Difficulty dificultate, TaskStatus status, Materie materie){
        this.id = id;
        this.titlu= titlu;
        this.descriere= descriere;
        this.deadline = deadline;
        this.dificultate = dificultate;
        this.status=status;
        this.materie=materie;
    }


    //getters

    public UUID getId(){
        return id;
    }

    public String getTitlu(){
        return titlu;

    }

    public String getDescriere(){
        return descriere;
    }

    public LocalDate getDeadline(){
        return deadline;
    }

    public Difficulty getDificultate(){
        return dificultate;
    }

    public TaskStatus getStatus(){
        return  status;
    }

    public Materie getMaterie(){
        return materie;
    }

    //settere

    public void setTitlu(String titlu){
        this.titlu = titlu;
    }

    public void setDescriere(String descriere){
        this.descriere=descriere;
    }

    public void setDeadline(LocalDate deadline){
        this.deadline=deadline;
    }

    public void setDificultate(Difficulty dificultate){
        this.dificultate=dificultate;
    }

    public void setStatus(TaskStatus status){
        this.status=status;
    }

    public void setMaterie(Materie materie){
        this.materie=materie;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", titlu='" + titlu + '\'' +
                ", descriere='" + descriere + '\'' +
                ", deadline=" + deadline +
                ", dificultate=" + dificultate +
                ", status=" + status +
                ", materie=" + materie.getNume() +
                '}';
    }
}
