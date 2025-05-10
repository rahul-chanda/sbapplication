package com.sparkx.sbapp.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteDTO {
    private String id;
    private String author;
    private LocalDateTime date;
    private String text;
    private String baseType;
    private String schemaLocation;
    private String type;

    // Getters and Setters
}