package com.testspring.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by ninovic on 8/3/2017.
 */
@Entity
@Table(name = "Address")
public class Address implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
