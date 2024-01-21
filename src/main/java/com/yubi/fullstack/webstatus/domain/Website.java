package com.yubi.fullstack.webstatus.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "m_website")
public class Website {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_url")
    private String name;

    @Column(name = "status")
    private String status;

    public Website(){}

    public Website(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
