package com.alexanderbiehl.widgethub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Widget {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String description;

    public Widget() {}

    public Widget(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Widget widget)) return false;

        return getId() == widget.getId() && getName().equals(widget.getName()) && Objects.equals(getDescription(), widget.getDescription());
    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(getId());
        result = 31 * result + getName().hashCode();
        result = 31 * result + Objects.hashCode(getDescription());
        return result;
    }

    @Override
    public String toString() {
        return "Widget{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

