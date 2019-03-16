package school.demo.entity;

public class Course {
    private Integer courseid;

    private String name;

    private String teacher;

    public Course() {
    }

    public Course(Integer courseid, String name, String teacher) {
        this.courseid = courseid;
        this.name = name;
        this.teacher = teacher;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }
}