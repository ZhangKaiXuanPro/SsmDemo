package school.demo.entity;

public class Student {
    private Integer studentid;

    private String name;

    private String sex;

    private Integer age;

    private String tel;

    private String address;

    public Student() {
    }

    public Student(Integer studentid, String name) {
        this.studentid = studentid;
        this.name = name;
    }

    public Student(Integer studentid, String name, String sex, Integer age, String tel, String address) {
        this.studentid = studentid;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tel = tel;
        this.address = address;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}