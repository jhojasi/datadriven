package com.tcs.assurance.prueba.models.entity;

import com.tcs.assurance.prueba.models.builders.UserInformationBuilder;

public class UserInformation {
    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String gender;

    public UserInformation(UserInformationBuilder userInformationFields) {
        this.firstName = userInformationFields.getListPersona().get(0).getFirstName();
        this.lastName = userInformationFields.getListPersona().get(0).getLastName();
        this.email = userInformationFields.getListPersona().get(0).getEmail();
        this.month = userInformationFields.getListPersona().get(0).getMonth();
        this.day = userInformationFields.getListPersona().get(0).getDay();
        this.year = userInformationFields.getListPersona().get(0).getYear();
        this.gender = userInformationFields.getListPersona().get(0).getGender();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }
}
