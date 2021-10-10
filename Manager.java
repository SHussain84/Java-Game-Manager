
/**
 * Write a description of class Manager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manager
{
    // instance variables - replace the example below with your own
    private String surname;
    private String managerID;

    /**
     * Constructor for objects of class Manager
     */
    public Manager(String userManagerSurname, String userManagerID)
    {
        surname = userManagerSurname;
        managerID = userManagerID;
    }

    public String getSurname() {
        return surname;
    }
    
    public String getManagerID() {
        return managerID;
    }
    
    public void setSurname(String newSurname) {
        surname = newSurname;
    }
    
    public void setManagerID(String newManagerID) {
        managerID = newManagerID;
    }
}
