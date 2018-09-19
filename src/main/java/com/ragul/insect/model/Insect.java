package com.ragul.insect.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Insect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String fileDownloadUri;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdDate = new Date();


    public Insect() {
    }

    public Insect(String name, String description, String fileDownloadUri) {
        this.name = name;
        this.description = description;
        this.fileDownloadUri = fileDownloadUri;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "Insect{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", fileDownloadUri='" + fileDownloadUri + '\'' +
                '}';
    }
}
