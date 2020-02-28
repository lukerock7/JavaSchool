public class Runner {
    public static void main(String[] args){
        School bh = new School("Berkeley High");

        Teacher albrecht = new Teacher("Albinsum", 1, "Math");
        Teacher albin = new Teacher("Albingram", 2, "Computer Science");
        Teacher kaku = new Teacher("Albinglish", 3, "English");

        Section math = new Section("Math");
        Section com = new Section("Computer Science");
        Section eng = new Section("English");

        Student albin2 = new Student("Mr.Albinson 2.0", 4, 11);
        Student albin3 = new Student("Mr.Albinson 3.0", 5, 11);
        Student albin4 = new Student("Mr.Albinson 4.0", 6, 11);
        Student albin5 = new Student("Mr.Albinson 5.0", 7, 11);
        Student albin6 = new Student("Mr.Albinson 6.0", 8, 11);
        Student albin7 = new Student("Mr.Albinson 7.0", 9, 11);


        math.setTeacher(albrecht);
        com.setTeacher(albin);
        eng.setTeacher(kaku);

        math.addStudents(albin2);
        math.addStudents(albin3);

        com.addStudents(albin4);
        com.addStudents(albin5);
        com.addStudents(albin6);

        eng.addStudents(albin6);
        eng.addStudents(albin7);
        eng.addStudents(albin4);

        System.out.println(math.toString());
        System.out.println(com.toString());
        System.out.println(eng.toString());
    }
}