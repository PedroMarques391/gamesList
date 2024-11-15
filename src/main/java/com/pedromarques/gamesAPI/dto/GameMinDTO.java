package com.pedromarques.gamesAPI.dto;

import com.pedromarques.gamesAPI.entities.Game;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String shortDescription;
    private String urlImage;

    public GameMinDTO() {

    }

    public GameMinDTO(Game entity) {
        this.title = entity.getTitle();
        this.id = entity.getId();
        this.year = entity.getYear();
        this.shortDescription = entity.getShortDescription();
        this.urlImage = entity.getUrlImage();
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public Integer getYear() {
        return year;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getUrlImage() {
        return urlImage;
    }
}


