public class Dietitian extends HealthProfessional {

    private String nutritionArea;

    public Dietitian(
            int professionalID,
            String name,
            String[] workingDays,
            String nutritionArea) {

        super(professionalID, name, workingDays);
        this.nutritionArea = nutritionArea;
    }

    public String getNutritionArea() {
        return nutritionArea;
    }

    @Override
    public String getProfessionalType() {
        return "Dietitian";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nNutrition Area: " + nutritionArea;
    }
}

