package edu.sbcc.cs105;

/**
 * Security
 */
public class Security {

    public static boolean authenticateUser(String userName, String password){

        return password.equals("secret");
    }
}
