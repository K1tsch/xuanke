package cn.edu.cuc.myfirst;

public class Course{
    private String name;
    private String teacher;
    private String time;
    private String place;

    public Course()
    {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Course(String name, String teacher, String time, String place)
    {
        super();
        this.name = name;
        this.teacher = teacher;
        this.time = time;
        this.place = place;
    }

    @Override
    public String toString()
    {
        return "Course [name=" + name + ", teacher=" + teacher + ", time=" + time + ", place=" + place
                + "]";
    }

}