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

    public abstract String getProfessionalType();

    @Override
    public String toString() {
        String days = "";

        for (int i = 0; i < workingDays.length; i++) {
            days = days + workingDays[i];

            if (i < workingDays.length - 1) {
                days = days + ", ";
            }
        }

        return "Professional Type: " + getProfessionalType()
                + "\nProfessional ID: " + professionalID
                + "\nName: " + name
                + "\nWorking Days: " + days;
    }
}