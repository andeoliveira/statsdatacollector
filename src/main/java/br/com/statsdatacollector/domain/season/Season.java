package br.com.statsdatacollector.domain.season;

public class Season {

    private Long year;

    private String startdate;

    private String enddate;

    public String getStartdate() {
        return startdate;
    }

    public Season Builder(String year) {
        this.year = Long.valueOf(year);
        return this;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }
}
