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
    }
}
