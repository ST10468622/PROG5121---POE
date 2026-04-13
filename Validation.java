/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiApp;

/**
 *
 * @author Lisakhanya
 */
public class Validation {
     public boolean checkUserName(String userName) {
        return userName.contains("_") && userName.length() <= 5;
    }

    public boolean checkPassword(String password) {
        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isDigit(ch)) hasNumber = true;
            else if (!Character.isLetterOrDigit(ch)) hasSpecial = true;
        }

        return hasUpper && hasNumber && hasSpecial;
    }

    public boolean checkPhoneNumber(String phone) {
        return phone.startsWith("+27") &&
               phone.length() == 12 &&
               phone.substring(3).matches("\\d+");
    }
}
