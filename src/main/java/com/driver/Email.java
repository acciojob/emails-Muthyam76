package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(oldPassword.equals(newPassword) && newPassword.length()>=8){
            int upperCase=0;
            int lowerCase=0;
            int digit=0;
            int special=0;
            for(int i=0;i<newPassword.length();i++){
                char c=newPassword.charAt(i);
                if(c>=65 && c<=90)
                    upperCase++;
                else if(c>=97 && c<=122)
                    lowerCase++;
                else if(c>='0' && c<='9')
                    digit++;
                else
                    special++;
            }
            if(upperCase>0 && lowerCase>0 && digit>0 && special>0){
                password=newPassword;
            }

        }
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
