Class MbaStudent extends Student {
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