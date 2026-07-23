public class GeneralPracticitioner extends HealthProfessional {

    private String clinicRoom;

    public GeneralPracticitioner(
            int professionalID,
            String name,
            String[] workingDays,
            String clinicRoom) {

        super(professionalID, name, workingDays);
        this.clinicRoom = clinicRoom;
    }

    public String getClinicRoom() {
        return clinicRoom;
    }

    @Override
    public String getProfessionalType() {
        return "General Practitioner";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nClinic Room: " + clinicRoom;
    }
}