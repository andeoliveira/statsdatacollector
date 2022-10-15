package br.com.statsdatacollector.application.api.season.sync;

public class SeasonResponse {

    private Long year;

    public SeasonResponse Builder(Long year) {
        this.setYear(year);
        return this;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }
}
