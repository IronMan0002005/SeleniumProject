/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;

/**
 *
 * @author CROSBYR
 */
public class Contact {

    private String user;

    private String pass;

    private String email;

    @Override
    public String toString() {
        return "Contact{" + "user=" + user + ", pass=" + pass + ", email=" + email + '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String user, String pass, String email) {
        this.user = user;
        this.pass = pass;
        this.email = email;
    }

}
