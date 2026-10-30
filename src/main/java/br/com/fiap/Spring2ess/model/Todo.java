package br.com.fiap.Spring2ess.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TODOS")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;


    @Column(name = "TITLE")
    private String title;


    @Column(name = "COMPLETED")
    private Character completed;


    public Todo() { }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public Character getCompleted() {
        return completed;
    }


    public void setCompleted(Character completed) {
        this.completed = completed;
    }
}