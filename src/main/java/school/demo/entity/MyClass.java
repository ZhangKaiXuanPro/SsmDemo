package school.demo.entity;

public class MyClass {
    private Integer classid;

    private String name;

    public MyClass() {
    }

    public MyClass(Integer classid, String name) {
        this.classid = classid;
        this.name = name;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}