Class EngieeringStudent extends Student {
    private String engineeringField;
    private double gpa;

    public EngineeringStudent(String name, int age, String studentId, String engineeringField, double gpa) {
        super(name, age, studentId);
        this.engineeringField = engineeringField;
        this.gpa = gpa;
    }

    public String getEngineeringField() {
        return engineeringField;
    }

    public void setEngineeringField(String engineeringField) {
        this.engineeringField = engineeringField;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}