package org.example.builderPattern;

public class User {
    private String userId;
    private String userName;
    private String emailId;

    private User() {
   // initialise - how? - with the help of another builder class
    }

    // no setter - why? - so that we cannot set the data for this object
}
