//represent specialist
public class Specialist extends HealthProfessional {

    private String specialty;
//creates specialist with professionalid name working days specialty
    public Specialist(
            int professionalID,
            String name,
            String[] workingDays,
            String specialty) {

        super(professionalID, name, workingDays);
        this.specialty = specialty;
    }
//returns speciality
    public String getSpecialty() {
        return specialty;
    }
//returns professionaltype
    @Override
    public String getProfessionalType() {
        return "Specialist";
    }
//returns detail as readable text
    @Override
    public String toString() {
        return super.toString()
                + "\nSpecialty: " + specialty;
    }
}

