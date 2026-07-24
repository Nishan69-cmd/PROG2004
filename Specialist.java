public class Specialist extends HealthProfessional {

    private String specialty;

    public Specialist(
            int professionalID,
            String name,
            String[] workingDays,
            String specialty) {

        super(professionalID, name, workingDays);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String getProfessionalType() {
        return "Specialist";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSpecialty: " + specialty;
    }
}

