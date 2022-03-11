package com.howtodoinjava.example.async.model;

import java.io.Serializable;
import java.util.List;

public class EmployeeProfiles implements Serializable {
    
    private static final long serialVersionUID = 33332849299994L;
    public List<EmployeeProfile> employeeProfileList;

    public List<EmployeeProfile> getEmployeeProfileList() {
        return this.employeeProfileList;
    }

    public void setEmployeeProfileList(List<EmployeeProfile> employeeProfileList) {
        this.employeeProfileList = employeeProfileList;
    }

    @Override
	public String toString() {
		return "EmployeeProfiles [employeeProfileList=" + employeeProfileList + "]";
	}

}
