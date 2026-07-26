//represents dietirian
public class Dietitian extends HealthProfessional {

    private String nutritionArea;
//creates dietitian with professionalid name working days nutritionarea
    public Dietitian(
            int professionalID,
            String name,
            String[] workingDays,
            String nutritionArea) {

        super(professionalID, name, workingDays);
        this.nutritionArea = nutritionArea;
    }
//return nutritionarea
    public String getNutritionArea() {
        return nutritionArea;
    }
//return professional type
    @Override
    public String getProfessionalType() {
        return "Dietitian";
    }
//returns detail as readable text
    @Override
    public String toString() {
        return super.toString()
                + "\nNutrition Area: " + nutritionArea;
    }
}

