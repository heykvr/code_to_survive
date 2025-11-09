class EngineeringStudent {
    private String name;
    private int age;
    private String studentId;
    private String engineeringField;
    private double gpa;

    public EngineeringStudent(String name, int age, String studentId, String engineeringField, double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.engineeringField = engineeringField;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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