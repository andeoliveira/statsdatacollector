package br.com.statsdatacollector.infrastructure.country;

import javax.persistence.*;

@Entity
@Table(name = "country")
public class CountryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_seq_gen")
    @SequenceGenerator(name = "country_seq_gen", sequenceName = "country_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name", length = 120, nullable = false)
    private String name;

    @Column(name = "code", length = 2)
    private String code;

    @Column(name = "flag")
    private String flag;

    public CountryEntity Builder(String code, String flag, String name) {
        this.setCode(code);
        this.setFlag(flag);
        this.setName(name);
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
