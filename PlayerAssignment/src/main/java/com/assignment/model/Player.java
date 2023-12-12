package com.assignment.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Player {

    public Player() {
    }

    public Player(String playerId, Integer birthYear, Integer birthMonth, Integer birthDay, String birthCountry, String birthState, String birthCity, Integer deathYear, Integer deathMonth, Integer deathDay, String deathCountry, String deathState, String deathCity, String nameFirst, String nameLast, String nameGiven, Integer weight, Integer height, Character bats, Character throws_, LocalDateTime debut, LocalDateTime finalGame, String retroId, String bbrefId) {
        this.playerId = playerId;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthCountry = birthCountry;
        this.birthState = birthState;
        this.birthCity = birthCity;
        this.deathYear = deathYear;
        this.deathMonth = deathMonth;
        this.deathDay = deathDay;
        this.deathCountry = deathCountry;
        this.deathState = deathState;
        this.deathCity = deathCity;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.nameGiven = nameGiven;
        this.weight = weight;
        this.height = height;
        this.bats = bats;
        this.throws_ = throws_;
        this.debut = debut;
        this.finalGame = finalGame;
        this.retroId = retroId;
        this.bbrefId = bbrefId;
    }

    @Id
    private String playerId;
    private Integer birthYear;
    private Integer birthMonth;

    private Integer birthDay;

    private String birthCountry;

    private String birthState;

    private String birthCity;

    private Integer deathYear;

    private Integer deathMonth;

    private Integer deathDay;

    private String deathCountry;

    private String deathState;

    private String deathCity;

    private String nameFirst;

    private String nameLast;

    private String nameGiven;

    private Integer weight;

    private Integer height;

    private Character bats;

    @Column(name = "throws")
    private Character throws_;

    private LocalDateTime debut;

    private LocalDateTime finalGame;

    private String retroId;

    private String bbrefId;

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    public Integer getDeathMonth() {
        return deathMonth;
    }

    public void setDeathMonth(Integer deathMonth) {
        this.deathMonth = deathMonth;
    }

    public Integer getDeathDay() {
        return deathDay;
    }

    public void setDeathDay(Integer deathDay) {
        this.deathDay = deathDay;
    }

    public String getDeathCountry() {
        return deathCountry;
    }

    public void setDeathCountry(String deathCountry) {
        this.deathCountry = deathCountry;
    }

    public String getDeathState() {
        return deathState;
    }

    public void setDeathState(String deathState) {
        this.deathState = deathState;
    }

    public String getDeathCity() {
        return deathCity;
    }

    public void setDeathCity(String deathCity) {
        this.deathCity = deathCity;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getNameGiven() {
        return nameGiven;
    }

    public void setNameGiven(String nameGiven) {
        this.nameGiven = nameGiven;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Character getBats() {
        return bats;
    }

    public void setBats(Character bats) {
        this.bats = bats;
    }

    public Character getThrows_() {
        return throws_;
    }

    public void setThrows_(Character throws_) {
        this.throws_ = throws_;
    }

    public LocalDateTime getDebut() {
        return debut;
    }

    public void setDebut(LocalDateTime debut) {
        this.debut = debut;
    }

    public LocalDateTime getFinalGame() {
        return finalGame;
    }

    public void setFinalGame(LocalDateTime finalGame) {
        this.finalGame = finalGame;
    }

    public String getRetroId() {
        return retroId;
    }

    public void setRetroId(String retroId) {
        this.retroId = retroId;
    }

    public String getBbrefId() {
        return bbrefId;
    }

    public void setBbrefId(String bbrefId) {
        this.bbrefId = bbrefId;
    }
}
