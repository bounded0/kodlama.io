public class Main {
    public static void main(String[] args){
        Student student = new Student(23,"lelele","lelelel","Java");

        UserManager userManager = new UserManager();
        userManager.add(student);
        StudentManager studentManager = new StudentManager();
        studentManager.joinLesson(student);
        Instructor instructor = new Instructor(50,"Engin","Demiroğ","Java");




    }
}
