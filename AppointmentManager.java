import java.util.ArrayList;
import java.util.Collections;
public class AppointmentManager {
    private ArrayList<Appointment> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<Appointment>();
    }
    private boolean isValidTime(String appointmentTime) {
        String[] validTimes = {
                "08:00", "08:30",
                "09:00", "09:30",
                "10:00", "10:30",
                "11:00", "11:30",
                "12:00", "12:30",
                "13:00", "13:30",
                "14:00", "14:30",
                "15:00", "15:30",
                "16:00"
        };
        for (String time : validTimes) {
            if (time.equals(appointmentTime)) {
                return true;
            }
        }
        return false;
    }
    public boolean addAppointment(Appointment appointment) {

        if (appointment == null) {
            System.out.println("Warning: appointment is missing.");
            return false;
        }

        if (appointment.getPatient() == null
                || appointment.getHealthProfessional() == null
                || appointment.getAppointmentTime() == null
                || appointment.getAppointmentTime().equals("")) {

            System.out.println("Warning: appointment details are incomplete.");
            return false;
        }

        if (!isValidTime(appointment.getAppointmentTime())) {
            System.out.println("Warning: invalid appointment time.");
            return false;
        }

        for (Appointment existingAppointment : appointments) {

            boolean sameProfessional =
                    existingAppointment
                            .getHealthProfessional()
                            .getProfessionalID()
                            == appointment
                            .getHealthProfessional()
                            .getProfessionalID();

            boolean sameTime =
                    existingAppointment
                            .getAppointmentTime()
                            .equals(appointment.getAppointmentTime());

            if (sameProfessional && sameTime) {
                System.out.println(
                        "Warning: professional is already booked at this time."
                );
                return false;
            }
        }

        appointments.add(appointment);
        System.out.println("Appointment added.");
        return true;
    }

    public void displayAppointments() {

        if (appointments.size() == 0) {
            System.out.println("No appointments found.");
            return;
        }

        for (Appointment appointment : appointments) {
            System.out.println();
            System.out.println(appointment);
        }
    }

    public void displayByProfessionalID(int professionalID) {

        boolean found = false;

        for (Appointment appointment : appointments) {

            if (appointment
                    .getHealthProfessional()
                    .getProfessionalID() == professionalID) {

                System.out.println();
                System.out.println(appointment);
                found = true;
            }
        }

        if (!found) {
            System.out.println(
                    "Warning: no appointments found for this professional."
            );
        }
    }

    public void displayByPatientMobile(String mobileNumber) {

        boolean found = false;

        for (Appointment appointment : appointments) {

            if (appointment
                    .getPatient()
                    .getMobileNumber()
                    .equals(mobileNumber)) {

                System.out.println();
                System.out.println(appointment);
                found = true;
            }
        }

        if (!found) {
            System.out.println(
                    "Warning: no appointments found for this patient."
            );
        }
        
    }
    public void displaySortedAppointments() {

        if (appointments.size() == 0) {
            System.out.println("No appointments found.");
            return;
        }

        Collections.sort(appointments);

        for (Appointment appointment : appointments) {
            System.out.println();
            System.out.println(appointment);
        }
    }
}