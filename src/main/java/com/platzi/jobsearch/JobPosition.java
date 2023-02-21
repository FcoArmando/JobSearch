package com.platzi.jobsearch;

import java.util.Objects;

public class JobPosition {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Object getOrigin() {
        return origin;
    }

    public void setOrigin(Object origin) {
        this.origin = origin;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private Object origin;
    private Object location;
    private String image;
    private String episode;
    private String url;
    private String created;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPosition that = (JobPosition) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(status, that.status) && Objects.equals(species, that.species) && Objects.equals(type, that.type) && Objects.equals(gender, that.gender) && Objects.equals(origin, that.origin) && Objects.equals(location, that.location) && Objects.equals(image, that.image) && Objects.equals(episode, that.episode) && Objects.equals(url, that.url) && Objects.equals(created, that.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, species, type, gender, origin, location, image, episode, url, created);
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", origin=" + origin +
                ", location=" + location +
                ", image='" + image + '\'' +
                ", episode='" + episode + '\'' +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                '}';
    }
}
