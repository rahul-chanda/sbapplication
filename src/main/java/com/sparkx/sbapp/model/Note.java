package com.sparkx.sbapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Note {

    @Id
    private String id;
    private String author;
    private LocalDateTime date;
    private String text;
    private String baseType;
    private String schemaLocation;
    private String type;
}