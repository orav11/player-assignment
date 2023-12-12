package com.assignment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class PlayerDTO {
        Integer birthYear;
        Integer birthMonth;
        Integer birthDay;
        String birthCountry;
        String birthState;
        String birthCity;
        Integer deathYear;
        Integer deathMonth;
        Integer deathDay;
        String deathCountry;
        String deathState;
        String deathCity;
        String nameFirst;
        String nameLast;
        String nameGiven;
        Integer weight;
        Integer height;
        Character bats;

        @JsonProperty(value = "throws")
        Character throws_;

        LocalDateTime debut;
        LocalDateTime finalGame;

        public PlayerDTO() {
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

}



