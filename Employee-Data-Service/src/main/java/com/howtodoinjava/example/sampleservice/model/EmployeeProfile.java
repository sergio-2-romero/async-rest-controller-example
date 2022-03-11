package com.howtodoinjava.example.sampleservice.model;

import java.io.Serializable;

public class EmployeeProfile implements Serializable {

    private static final long serialVersionUID = 145837281923123L;
    private String name;
    private String shortName;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
	public String toString() {
		return "EmployeeProfile [name=" + name + ", shortName=" + shortName + "]";
	}

}
