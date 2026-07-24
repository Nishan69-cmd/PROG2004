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

    }
}
