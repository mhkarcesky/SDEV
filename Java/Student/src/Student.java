public class Student extends Person {

    private String school = "TheSchool";

    public Student(String name, String citizen, String school) {
        super(name, citizen);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "\nStudent [name = " + super.getName() +
                "Citizenship=" + super.getCitizen() + "school=" + school + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        return (school.equals(other.school)) &&
                super.equals(other);
    }

}
