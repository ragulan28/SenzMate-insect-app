package com.ragul.insect.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Insects")
public class Insect {

    @Id
    private String id;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String name;
    private String description;
    private String fileDownloadUri;

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
