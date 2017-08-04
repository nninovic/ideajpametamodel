package com.testspring.domain;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * Created by milans on 5/16/2017.
 */
@Entity
@Table(name = "CATEGORY")
public class Category extends BaseEntity<Long> implements Serializable {

    @Column(name = "NAME")
    @Length(min = 3, max = 20, message = "Name must be between {min} and {max} characters long")
    private String name;

    @Column(name = "DESCRIPTION")
    @Length(min = 3, max = 20, message = "Description must be between {min} and {max} characters long")
    private String description;

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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Category that = (Category) o;

        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return HASH_CODE;
    }
}

