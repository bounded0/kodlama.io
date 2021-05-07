public class Student extends User {
    public String getLesson() {
        return lesson.concat(" ");
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String lesson;

    public Student(int id, String name, String surname) {
        super(id, name, surname);
    }
    public Student(int id, String name, String surname, String lesson){

        super(id,name,surname);
        this.lesson = lesson;

        System.out.println(getName() + getSurName()  + getLesson());

    }
}
