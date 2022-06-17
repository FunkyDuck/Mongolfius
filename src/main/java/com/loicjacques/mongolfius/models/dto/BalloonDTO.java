package com.loicjacques.mongolfius.models.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BalloonDTO {
    private long id;
    private String registration;
    private int places;
    private LocalDate releaseDate;
}
