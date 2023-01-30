package classes;


import java.util.ArrayList;

/**
* This is an account type that contains related pharmacy data.
* @author Umut Divarcı
* @date 23.04.2021  
*/

public class Pharmacy extends Account {

    // Properties
    final String name;
    String city;
    public ArrayList<Employee> employees;
    public ArrayList<Medicine> medicalStock;

    // Constructors
    public Pharmacy ( String userName, String password, String mail, String name, String city) 
    {
        super ( userName, password, mail);
        this.name = name;
        this.city = city;
        this.employees = new ArrayList<Employee>();
        this.medicalStock = new ArrayList<Medicine>();
    }

    // Methods

    /** 
     * @return String
     */

    public String getName()
    {
        return name;
    }
    
    
    /** 
     * @return String
     */
    public String getCity()
    {
        return city;
    }

    
    /** 
     * @return ArrayList<Employee>
     */
    public ArrayList<Employee> getEmployees()
    {
        return employees;
    }

    
    /** 
     * @return ArrayList<Medicine>
     */
    public ArrayList<Medicine> getMedicalStock()
    {
        return medicalStock;
    }

    
    /** 
     * Adds a new employee to the pharmacy.
     * @param newEmployee
     */
    public void addEmployee ( Employee newEmployee)
    {
        employees.add( newEmployee);
    }

    
    /** 
     * Removes an employee from pharmacy.
     * @param currentEmployee
     */
    public void removeEmployee ( Employee currentEmployee)
    {
        employees.remove( currentEmployee);
    }

    
    /** 
     * Adds a new medicine type to the medical stocks.
     * @param newMedicine
     */
    public void addMedicine ( Medicine newMedicine)
    {
        medicalStock.add( newMedicine);
    }

    
    /** 
     * Removes a medicine type from stocks.
     * @param currentMedicine
     */
    public void removeMedicine ( Medicine currentMedicine)
    {
        medicalStock.remove( currentMedicine);
    }
}
