package school.demo.entity;

public class Teacher {
    private Integer teacherid;

    private String name;

    private String sex;

    private Integer age;

    public Teacher(Integer teacherid, String name, String sex, Integer age) {
        this.teacherid = teacherid;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Teacher() {
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
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
}