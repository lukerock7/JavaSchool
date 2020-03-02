public class Runner {
    public static void main(String[] args){
        School bhs = new School("Berkeley High");

        Section math = new Section("Math");
        Section compsci = new Section("Computer Science");
        Section eng = new Section("English");

        Teacher albinsum = new Teacher("Albinsum", 1, "Math");
        Teacher albingram = new Teacher("Albingram", 2, "Computer Science");
        Teacher albinglish = new Teacher("Albinglish", 3, "English");

        Student albin2 = new Student("Mr.Albinson's First Favorite Student", 4, 11);
        Student albin3 = new Student("Mr.Albinson's Second Favorite Student", 5, 11);
        Student albin4 = new Student("Mr.Albinson's Third Favorite Student", 6, 11);
        Student albin5 = new Student("Mr.Albinson's Fourth Favorite Student", 7, 11);
        Student albin6 = new Student("Mr.Albinson's Fifth Favorite Student", 8, 11);
        Student albin7 = new Student("Mr.Albinson's Sixth Favorite Student", 9, 11);


        math.setTeacher(albinsum);
        compsci.setTeacher(albingram);
        eng.setTeacher(albinglish);

        math.addStudents(albin2);
        math.addStudents(albin3);

        compsci.addStudents(albin4);
        compsci.addStudents(albin5);
        compsci.addStudents(albin6);

        eng.addStudents(albin6);
        eng.addStudents(albin7);
        eng.addStudents(albin4);

        System.out.println(math.toString());
        System.out.println(compsci.toString());
        System.out.println(eng.toString());
    }
}