package com.toniomg.songcreatorbackend.model;

import java.util.List;
import javax.persistence.Entity;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.Data;

@Entity
@Data
public class Song {

    public enum Strum {
        UP,
        DOWN,
        NONE
    }

    public Song() {};

    public Song(String author, String name, boolean isPublic) {
        this.name = name;
        this.isPublic = isPublic;
    }

    public Song(String author, String name) {
        super();
        this.name = name;
        this.isPublic = true;
    }

    @Id
    @GeneratedValue
    private long id;
    private String author;
    private String name;
    private boolean isPublic;

//    private List<String> chordPattern;
//    private List<Strum> strummingPattern;


}





