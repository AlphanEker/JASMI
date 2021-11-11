package classes;

import java.util.ArrayList;

public class Doctor extends Account{

    // Properties
    final String name;
    final long identityNumber;
    ArrayList<String> patients;
    Date schedule;
    Hospital currentHospital;
    double salary;

    // Constructors
    public Doctor ( String userName, String password, String mail, String name, long identityNumber,
     Hospital currentHospital)
    {
        super ( userName, password, mail);
        schedule = new Date();
        this.name = name;
        this.identityNumber = identityNumber;
        this.currentHospital = currentHospital;
        salary = 0.0;
        patients = new ArrayList<String>();
    }

    // Methods
    protected void setSalary ( double newSalary)
    {
        salary = newSalary;
    }

    protected void setCurrentHospital ( Hospital newHospital)
    {
        currentHospital = newHospital;
    }

    protected void setAppointment ( int i)
    {
        schedule.getDay(i).setAvailabilityFalse();
        schedule.getDay(i).setNote(0);
    }

    public boolean getAvailability(int i){

        return schedule.getDay(i).getAvailability();
    }
    
    protected Date getSchedule(){

        return schedule;
    }

    protected long getIdentityNumber()
    {
        return identityNumber;
    }

    public Date getDate(){

        return schedule;
    }

    public ArrayList<String> getCurrentPatients()
    {
        return patients;
    }

    public double getSalary()
    {
        return salary;
    }

    public String getName()
    {
        return name;
    }

}
    
