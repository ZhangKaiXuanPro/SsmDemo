package school.demo.entity;

public class MyScore {
    private Integer courseid;

    private Integer studentid;

    private Integer score;



    public MyScore(Integer courseid, Integer studentid, Integer score) {
        this.courseid = courseid;
        this.studentid = studentid;
        this.score = score;
    }

    public MyScore() {
    }
    public Integer getCourseid() {
        return courseid;
    }
    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}