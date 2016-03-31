package com.test.aitpteam.aitppractice1;

import java.net.HttpURLConnection;

/**
 * Created by gnoej on 3/28/2016.
 */
public class PersonM {
    String gender;
    String fName;
    String lName;
    String street;
    String email;
    String username;
    String password;
    String picture;

    public PersonM() {

    }

    public PersonM(String gender, String fName, String lName, String email, String street, String password, String username, String picture) {
        this.gender = gender;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.street = street;
        this.password = password;
        this.username = username;
        this.picture = picture;
    }
}
