public class Runner {
    public static void main(String[] args){
        School bh = new School("Berkeley High");

        Teacher albrecht = new Teacher("Albrecht", 1, "Math");
        Teacher albin = new Teacher("Albinson", 2, "Computer Science");
        Teacher kaku = new Teacher("Kaku", 3, "English");

        Section math = new Section("Math");
        Section com = new Section("Computer Science");
        Section eng = new Section("English");

        Student abby = new Student("Abby", 4, 11);
        Student eva = new Student("Eva", 5, 11);
        Student nina = new Student("Nina", 6, 11);
        Student lou = new Student("Louisa", 7, 11);
        Student pema = new Student("Pema", 8, 11);
        Student ella = new Student("Ella", 9, 11);


        math.setTeacher(albrecht);
        com.setTeacher(albin);
        eng.setTeacher(kaku);

        math.addStudents(abby);
        math.addStudents(ella);

        com.addStudents(eva);
        com.addStudents(nina);
        com.addStudents(abby);

        eng.addStudents(eva);
        eng.addStudents(lou);
        eng.addStudents(pema);

        System.out.println(math.toString());
        System.out.println(com.toString());
        System.out.println(eng.toString());
    }
}