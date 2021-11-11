package classes;
import java.util.ArrayList;
public class Patient extends Account {

    //Variables specific to patient class
    long identityNumber;
    public MedicalRecord medicalRecords;
    String currentCity;
    String name;
    Date date;
    MedicalRecord dietPlan;

    public Patient( String userName, String password, String mail, long identityNumber,
    String currentCity, String name){

        super(userName, password, mail);
        this.identityNumber = identityNumber;
        this.medicalRecords = medicalRecords;
        this.currentCity = currentCity;
        this.name = name;
        date = new Date();
        medicalRecords = null;
        dietPlan = null;
    }

    public void setName(String newName){
        name = newName;
    }
    
    public Date getDate() {
    	return date;
    }

    public void setMedicalRecord(MedicalRecord newMedicalRecord){
        medicalRecords = newMedicalRecord;
    }

    public Long getIdentityNo(){
        return identityNumber;
    }

    public MedicalRecord getMedicalRecord(){
        return medicalRecords;
    } 

    public void setCurrentCity(String newCity){
        currentCity = newCity;
    }

    public String getName(){
        return name;
    }

    public void generateDietaryProgram(MedicalRecord record){
        //to do
    }

    public String displayDietaryPlan(){
        return dietPlan.toString();
    }

    public boolean getAppointment(int date, Doctor doctor){
        if (doctor.getAvailability(date) && getAvailabe(date)) {

            doctor.getSchedule().getDay(date).setAvailabilityFalse();
            doctor.setAppointment(date);
            this.date.getDay(date - 1).setAvailabilityFalse();
            this.date.getDay(date - 1).setNote(1);
            return true;
        }
        return false;
    }
    //@overload
    public boolean getAppointment(int date, Doctor doctor, String s){
        if (doctor.getAvailability(date) && getAvailabe(date)) {

            doctor.getSchedule().getDay(date).setAvailabilityFalse();
            doctor.setAppointment(date);
            this.date.getDay(date - 1).setAvailabilityFalse( s);
            //this.date.getDay(date - 1).setNote(1);
            return true;
        }
        return false;
    }

    public boolean getAvailabe(int i){

        return date.getDay(i).getAvailability();
    }
}
