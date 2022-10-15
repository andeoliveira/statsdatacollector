package br.com.statsdatacollector.domain.country;

import java.util.List;

public class CountryData {

    private List<Object> errors;

    private String get;

    private Object paging;

    private List<String> parameters;

    private List<Country> response;

    private Long results;

    public Long getResults() {
        return results;
    }

    public void setResults(Long results) {
        this.results = results;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public Object getPaging() {
        return paging;
    }

    public void setPaging(Object paging) {
        this.paging = paging;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public List<Country> getResponse() {
        return response;
    }

    public void setResponse(List<Country> response) {
        this.response = response;
    }
}
