package com.codewithagadjan.rest_api_todo.model;
import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "tasks")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @Column(name = "tast_time")
    private LocalTime tast_time;


    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}

    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}


    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}

    public LocalTime getTast_time(){return tast_time;}
    public void setTast_time(LocalTime tast_time){this.tast_time=tast_time;}




}
