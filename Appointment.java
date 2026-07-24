public class Appointment implements Comparable<Appointment> {

    private Patient patient;
    private HealthProfessional healthProfessional;
    private String appointmentTime;

    public Appointment(
        Patient patient,
        HealthProfessional healthProfessional,
        String appointmentTime) {

    if (patient == null
            || healthProfessional == null
            || appointmentTime == null
            || appointmentTime.equals("")) {

        throw new IllegalArgumentException(
                "Appointment details cannot be empty."
        );
    }

    this.patient = patient;
    this.healthProfessional = healthProfessional;
    this.appointmentTime = appointmentTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public HealthProfessional getHealthProfessional() {
        return healthProfessional;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    @Override
    public int compareTo(Appointment other) {
        return this.appointmentTime.compareTo(other.appointmentTime);
    }

    @Override
    public String toString() {
        return "Appointment Time: " + appointmentTime
                + "\n" + patient
                + "\n" + healthProfessional;
    }
}