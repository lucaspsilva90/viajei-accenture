package com.accenture.gama.viajei.model.amadeus;

import com.accenture.gama.viajei.model.amadeus.enuns.TravelerType;

public class TravelerRequest {
    private int id;
    private TravelerType travelerType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TravelerType getTravelerType() {
        return travelerType;
    }

    public void setTravelerType(TravelerType travelerType) {
        this.travelerType = travelerType;
    }
}
