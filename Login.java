/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiApp;

/**
 *
 * @author Lisakhanya
 */
public class Login {
    
    private String storedUsername;
    private String storedPassword;
    private String storedPhone;

    // SETTERS (used by Registration form)
    public void setStoredUsername(String username) {
        this.storedUsername = username;
    }

    public void setStoredPassword(String password) {
        this.storedPassword = password;
    }

    public void setStoredPhone(String phone) {
        this.storedPhone = phone;
    }

    // GETTERS (optional)
    public String getStoredUsername() {
        return storedUsername;
    }

    // Username validation
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Password validation
    public boolean checkPassword(String password) {
        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        return hasUpper && hasNumber && hasSpecial;
    }

    // Phone validation
    public boolean checkPhone(String phone) {
        if (!phone.startsWith("+27")) return false;
        if (phone.length() != 12) return false;

        for (int i = 3; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    // LOGIN CHECK (USED BY MiForm)
    public boolean login(String username, String password) {
        return username.equals(storedUsername) &&
               password.equals(storedPassword);
    }
}
    

