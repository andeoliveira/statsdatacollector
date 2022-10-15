package br.com.statsdatacollector.domain.country;

public class Country {

    private String name;

    private String code;

    private String flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Country Builder(String code, String flag, String name) {
        this.setCode(code);
        this.setFlag(flag);
        this.setName(name);
        return this;
    }
    
}
