class MbaStudent extends Student {
    private String specialization;
    private int workExperience; // in years

    public MbaStudent(String name , int age , String studentId, String specialization,int workExperience){
        super(name, age, studentId);
        this.specialization = specialization;
        this.workExperience = workExperience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

    public int getWorkExperience() {
        return workExperience;
    }


    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
}

class Student {
    private String name;
    private int age;
    private String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
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
}