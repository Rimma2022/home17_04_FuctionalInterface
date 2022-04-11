public class People {
    private double height;
    private double weight;
    private double BMI;


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public People(double height, double weight) {
        this.height = height;
        this.weight = weight;
        this.BMI = weight/ (height*height);
    }

    @Override
    public String toString() {
        String str = "Height: " + height + ", weight: " + weight + ", BMI: " + BMI + "\n";
        return str;
    }


}
