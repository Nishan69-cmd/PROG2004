import java.util.ArrayList;

public class AssignmentOne {

    public static void main(String[] args) {

        String[] workingDays = {
                "Monday",
                "Wednesday",
                "Friday"
        };

        GeneralPracticitioner gp1 =
                new GeneralPracticitioner(
                        101,
                        "Dr Smith",
                        workingDays,
                        "Room 1"
                );

        String[] gp2Days = {
                "Tuesday",
                "Thursday"
        };

        GeneralPracticitioner gp2 =
                new GeneralPracticitioner(
                        102,
                        "Dr Jones",
                        gp2Days,
                        "Room 2"
                );

        String[] gp3Days = {
                "Monday",
                "Thursday",
                "Friday"
        };

        GeneralPracticitioner gp3 =
                new GeneralPracticitioner(
                        103,
                        "Dr Wilson",
                        gp3Days,
                        "Room 3"
                );

        String[] nurseDays = {
                "Tuesday",
                "Thursday"
        };

        Nurse nurse1 = new Nurse(
                201,
                "Nurse Emma",
                nurseDays,
                "Emergency Ward"
        );

        String[] specialistDays = {
                "Monday",
                "Tuesday"
        };

        Specialist specialist1 = new Specialist(
                301,
                "Dr Brown",
                specialistDays,
                "Cardiology"
        );

        String[] dietitianDays = {
                "Wednesday",
                "Friday"
        };

        Dietitian dietitian1 = new Dietitian(
                401,
                "Ms Taylor",
                dietitianDays,
                "General Nutrition"
        );

        ArrayList<HealthProfessional> professionals =
                new ArrayList<HealthProfessional>();

        professionals.add(gp1);
        professionals.add(gp2);
        professionals.add(gp3);
        professionals.add(nurse1);
        professionals.add(specialist1);
        professionals.add(dietitian1);

        System.out.println("ALL HEALTH PROFESSIONALS");

        for (HealthProfessional professional : professionals) {
            System.out.println();
            System.out.println(professional);
        }

        Patient patient1 = new Patient(
                "John Smith",
                "0412345678"
        );

        Patient patient2 = new Patient(
                "Sarah Jones",
                "0423456789"
        );

        Patient patient3 = new Patient(
                "Michael Brown",
                "0434567890"
        );

        Appointment appointment1 = new Appointment(
                patient1,
                gp1,
                "09:30"
        );

        Appointment appointment2 = new Appointment(
                patient2,
                nurse1,
                "08:30"
        );

        Appointment appointment3 = new Appointment(
                patient3,
                specialist1,
                "11:00"
        );

        AppointmentManager manager =
                new AppointmentManager();

        manager.addAppointment(appointment1);
        manager.addAppointment(appointment2);
        manager.addAppointment(appointment3);

        System.out.println();
        System.out.println("ALL APPOINTMENTS");
        manager.displayAppointments();

        System.out.println();
        System.out.println("DOUBLE BOOKING TEST");

        Appointment duplicateAppointment =
                new Appointment(
                        patient3,
                        gp1,
                        "09:30"
                );

        manager.addAppointment(duplicateAppointment);

        System.out.println();
        System.out.println("INVALID TIME TEST");

        Appointment invalidAppointment =
                new Appointment(
                        patient1,
                        dietitian1,
                        "09:15"
                );

        manager.addAppointment(invalidAppointment);

        System.out.println();
        System.out.println("SEARCH BY PROFESSIONAL ID");
        manager.displayByProfessionalID(101);

        System.out.println();
        System.out.println("SEARCH BY PATIENT MOBILE");
        manager.displayByPatientMobile("0412345678");

        System.out.println();
        System.out.println("SEARCH FOR NON-EXISTING PROFESSIONAL");
        manager.displayByProfessionalID(999);

        System.out.println();
        System.out.println("APPOINTMENTS SORTED BY TIME");
        manager.displaySortedAppointments();

        GeneralPracticitioner anotherGP =
                new GeneralPracticitioner(
                        101,
                        "Dr Green",
                        workingDays,
                        "Room 5"
                );

        System.out.println();
        System.out.println(
                "Same professional: "
                        + gp1.equals(anotherGP)
        );

        System.out.println();
        System.out.println("CANCEL APPOINTMENT");

        manager.cancelByProfessionalIDAndTime(
                101,
                "09:30"
        );

        manager.displayAppointments();

        System.out.println();
        System.out.println("CANCEL BY PATIENT MOBILE");

        manager.cancelByPatientMobile(
                "0423456789"
        );

        manager.displayAppointments();

        System.out.println();
        System.out.println("CANCEL NON-EXISTING APPOINTMENT");

        manager.cancelByProfessionalIDAndTime(
                999,
                "10:00"
        );
        
        System.out.println();
        System.out.println("CANCEL NON-EXISTING APPOINTMENT");

        manager.cancelByProfessionalIDAndTime(
                999,
                "10:00"
        );
        System.out.println();
System.out.println("SEARCH FOR NON-EXISTING PATIENT");

manager.displayByPatientMobile("0400000000");

System.out.println();
System.out.println("CANCEL NON-EXISTING PATIENT APPOINTMENT");

manager.cancelByPatientMobile("0400000000");
    }
}