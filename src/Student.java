public class Student extends Person{
    private Section[] sections = new Section[10];
    private int grade;
    private int sectionsCount = 0;

    public Student(String name, int id, int grade){
        super(name, id);
        this.grade = grade;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setGrade(int g){
        this.grade = g;
    }

    public Section[] getSections(){
        return this.sections;
    }

    public void addSections(Section s){
        this.sections[sectionsCount] = s;
        sectionsCount++;
    }
}