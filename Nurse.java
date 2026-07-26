//represent nurse
public class Nurse extends HealthProfessional {

    private String ward;
//create nures with professional id name working days and ward
    public Nurse(
            int professionalID,
            String name,
            String[] workingDays,
            String ward) {

        super(professionalID, name, workingDays);
        this.ward = ward;
    }
//returns the nurse ward
    public String getWard() {
        return ward;
    }
// return professional type
    @Override
    public String getProfessionalType() {
        return "Nurse";
    }
//return details as readable text
    @Override
    public String toString() {
        return super.toString()
                + "\nWard: " + ward;
    }
}