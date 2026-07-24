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
        
    }
}
