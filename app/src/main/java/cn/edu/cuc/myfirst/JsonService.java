package cn.edu.cuc.myfirst;

/**
 * Created by wenyang on 2017/6/5.
 */

import java.util.List;
import java.util.ArrayList;


public class JsonService {
    public Course getCourse(){
        Course course = new Course("移动多媒体设计", "张宏涛", "1-16周，每周周一1-4节 8:00~11:50", "动画203");
        return course;
    }
    public List<Course> getCourses()
    {
        List<Course> courses = new ArrayList<Course>();
        Course course = new Course("移动多媒体设计", "张宏涛", "1-16周，每周周一1-4节 8:00~11:50", "动画203");
        Course course2 = new Course("大学生就业指导", "刘幼春", "1-8周，每周周一5-6节 13:00~14:50", "48教A205");
        courses.add(course);
        courses.add(course2);
        return courses;
    }

}
