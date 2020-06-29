package com.tcs.assurance.prueba.models.builders;

import com.tcs.assurance.prueba.models.entity.UserInformation;
import javafx.util.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserInformationBuilder implements Builder<UserInformation> {
    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String gender;

    protected static UserInformation userInformation;
    private List<UserInformationBuilder> listPerson = new ArrayList<>();

    private UserInformationBuilder(Map<String, String> data) {
        this.firstName = data.get("firstName");
        this.lastName = data.get("lastName");
        this.email = data.get("email");
        this.month = data.get("month");
        this.day = data.get("day");
        this.year = data.get("year");
        this.gender = data.get("gender");
    }

    public static UserInformationBuilder PersonInformation(List<Map<String, String>> DataPerson) {
        return new UserInformationBuilder(DataPerson);
    }

    public UserInformationBuilder(List<Map<String, String>> dataCard) {
        createConstructor(dataCard);
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

    private void createConstructor(List<Map<String, String>> dataCard) {
        for (Map<String, String> data : dataCard) {
            listPerson.add(new UserInformationBuilder(data));
        }
    }

    public static void setPerson(UserInformation userInformation) {
        UserInformationBuilder.userInformation = userInformation;
    }

    @Override
    public UserInformation build() {
        UserInformation createdPersona = new UserInformation(this);
        UserInformationBuilder.setPerson(createdPersona);
        return createdPersona;
    }

    public List<UserInformationBuilder> getListPersona() {
        return listPerson;
    }
}