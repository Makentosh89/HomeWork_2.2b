public class Course {
    private String name;
    private String date;
    private int id;
    private String fioTeacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFioTeacher() {
        return fioTeacher;
    }

    public void setFioTeacher(String fioTeacher) {
        this.fioTeacher = fioTeacher;
    }
    @Override
    public String toString(){
        return "\nname : "+getName()+"\ndate : "+getDate()+
                "\nid : "+getId()+"\nfioTeacher : "+getFioTeacher();
    }
}
