/* File: Member.java
 * Author: Adrianne Huang
 * Date: 2017
 * Description: A class that represents a member.
 */
package transferobjects;

public class Member {

    private int memberId;
    private int isAdmin;
    private String alias;
    private String fName;
    private String lName;
    private String email;
    private String userName;
    private String password;
    private String salt;

    /**
     * Empty member constructor.
     */
    public Member() {
    }

    /**
     * Constructor that creates a member with specific information.
     *
     * @param memberId
     * @param alias
     * @param fName
     * @param lName
     * @param email
     * @param userName
     * @param password
     * @param isAdmin
     */
    public Member(int memberId, int isAdmin, String alias, String fName, String lName, String email, String userName, String password, String salt) {
        this.memberId = memberId;
        this.isAdmin = isAdmin;
        this.alias = alias;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.salt = salt;
    }

    /**
     * Returns the memberID of the current member.
     *
     * @return memberId
     */
    public int getMemberId() {
        return memberId;
    }

    /**
     * Sets the memberID of the current member.
     *
     * @param memberId
     */
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    /**
     * Returns whether the member is an administrator or not.
     *
     * @return 0 or 1
     */
    public int isAdmin() {
        return isAdmin;
    }

    /**
     * Sets 0 or 1 if the member is an administrator.
     *
     * @param isAdmin
     */
    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * Returns the alias of the current member.
     *
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the alias of the current member.
     *
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return first name
     */
    public String getFirstName() {
        return fName;
    }

    /**
     * Sets the first name.
     *
     * @param name
     */
    public void setFirstName(String name) {
        this.fName = name;
    }

    /**
     * @return last name
     */
    public String getLastName() {
        return lName;
    }

    /**
     * Sets the last name.
     *
     * @param name
     */
    public void setLastName(String name) {
        this.lName = name;
    }

    /**
     * @return email of the member
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email for the member.
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the username for the member.
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the username for the member.
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Returns the password of the member.
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password for the member.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns how much salt is needed for the member.
     *
     * @return
     */
    public String getSalt() {
        return salt;
    }

    /**
     * Sets how much salt is needed for the member.
     *
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }
}
