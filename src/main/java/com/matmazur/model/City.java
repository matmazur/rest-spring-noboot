package com.matmazur.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class City {

    private String name;
    private long population;

    public City(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
