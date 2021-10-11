package com.example.pract3;

public class Butterfly {
    private String butName;
    private String imageName;
    private int population;

    public String getButName() {
        return butName;
    }

    public void setButName(String butName) {
        this.butName = butName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Butterfly(String butName, String imageName, int population) {
        this.butName = butName;
        this.imageName = imageName;
        this.population = population;
    }
}
