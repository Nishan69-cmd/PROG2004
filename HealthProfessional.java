public abstract class HealthProfessional {

    private int professionalID;
    private String name;
    private String[] workingDays;

    public HealthProfessional(
            int professionalID,
            String name,
            String[] workingDays) {

        this.professionalID = professionalID;
        this.name = name;
        this.workingDays = workingDays;
    }

    public int getProfessionalID() {
        return professionalID;
    }

    public String getName() {
        return name;
    }

    public String[] getWorkingDays() {
        return workingDays;
    }
}