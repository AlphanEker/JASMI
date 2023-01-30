package classes;


/**
* This is a superclass that all account types share.
* @author Umut Divarcı
* @date 23.04.2021  
*/

public class Account {

    // Properties
    public String userName;
    public String password;
    String mail;

    // Constructors

    public Account ( String userName, String password, String mail)
    {
        this.userName = userName;
        this.password = password;
        this.mail = mail;
    }

    
    // Methods

    /** 
     * Sets the user name to the given string.
     * @param newUserName
     */

    public void setUserName ( String newUserName)
    {
        userName = newUserName;
    }

    
    /** 
     * Sets the user name to the given string.
     * @param newPassword
     */
    public void setPassword ( String newPassword)
    {
        password = newPassword;
    }

    
    /** 
     * Sets the user name to the given string.
     * @param newMail
     */
    public void setMail ( String newMail)
    {
        mail = newMail;
    }

    
    /** 
     * @return String
     */
    public String getUserName()
    {
        return userName;
    }

    
    /** 
     * @return String
     */
    public String getPassword()
    {
        return password;
    }
    
    
    /** 
     * @return String
     */
    public String getMail()
    {
        return mail;
    }
}
