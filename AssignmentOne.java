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

        GeneralPracticitioner gp2 = new GeneralPracticitioner(
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

        GeneralPracticitioner gp3 = new GeneralPracticitioner(
                103,
                "Dr Wilson",
                gp3Days,
                "Room 3"
        );

        System.out.println(gp1);
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

        System.out.println();
        System.out.println(nurse1);
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

        System.out.println();
        System.out.println(specialist1);
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

        System.out.println();
        System.out.println(dietitian1);
        ArrayList<HealthProfessional> professionals =
        new ArrayList<HealthProfessional>();

        professionals.add(gp1);
        professionals.add(gp2);
        professionals.add(gp3);
        professionals.add(nurse1);
        professionals.add(specialist1);
        professionals.add(dietitian1);
        System.out.println();
        System.out.println("ALL HEALTH PROFESSIONALS");

        for (HealthProfessional professional : professionals) {
        System.out.println();
        System.out.println(professional);
        }

    }
}
