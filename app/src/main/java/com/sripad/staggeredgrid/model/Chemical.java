package com.sripad.staggeredgrid.model;

/**
 * This is the class that hold the name and the image of the chemical.
 * Created by Sripad on 12/20/2015.
 */
public class Chemical {

    private String chemicalName;
    private int chemicalImage;

    public Chemical(String chemicalName, int chemicalImage) {
        this.chemicalName = chemicalName;
        this.chemicalImage = chemicalImage;
    }

    public String getChemicalName() {
        return chemicalName;
    }

    public int getChemicalImage() {
        return chemicalImage;
    }
}
