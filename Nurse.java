public class Nurse extends HealthProfessional {

    private String ward;

    public Nurse(
            int professionalID,
            String name,
            String[] workingDays,
            String ward) {

        super(professionalID, name, workingDays);
        this.ward = ward;
    }

    public String getWard() {
        return ward;
    }

    @Override
    public String getProfessionalType() {
        return "Nurse";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nWard: " + ward;
    }
}