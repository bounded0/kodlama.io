public class Instructor extends User{


    public String myLesson;

    public Instructor(int id, String name, String surname, String myLesson) {
        super(id, name, surname);
        this.myLesson = getMyLesson();
    }


    public String getMyLesson() {
        return myLesson;
    }

    public void setMyLesson(String myLesson) {
        this.myLesson = myLesson;
    }


}

