package com.accenture.gama.viajei.entities;

import java.util.List;

import com.accenture.gama.viajei.entities.enuns.CurrencyCode;
import com.accenture.gama.viajei.entities.enuns.FlightOfferSource;


public class FlightOfferSearchRequest {
    private CurrencyCode currencyCode;
    private List<OriginDestination> originDestinations;
    private List<TravelerRequest> travelers;
    private List<FlightOfferSource> sources;
    private SearchCriteria searchCriteria;
    

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    public List<OriginDestination> getOriginDestinations() {
        return originDestinations;
    }

    public void setOriginDestinations(List<OriginDestination> originDestinations) {
        this.originDestinations = originDestinations;
    }

    public List<TravelerRequest> getTravelers() {
        return travelers;
    }

    public void setTravelers(List<TravelerRequest> travelers) {
        this.travelers = travelers;
    }

    public List<FlightOfferSource> getSources() {
        return sources;
    }

    public void setSources(List<FlightOfferSource> sources) {
        this.sources = sources;
    }

    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }
}