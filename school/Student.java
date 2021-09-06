package school;

public class Student {
    private String name;
    private String id;
    private String spec;
    private Subject cls;

    //생성자
    public Student (String name, String id, String spec, int korean, int math) {
        this.name = name;
        this.id = id;
        this.spec = spec;
        cls = new Subject(korean, math);

        //전공별 필수과목 지정
        if(spec == "국어국문학과") {
            cls.setSub("국어");
            cls.setEsse('k');
        } else if(spec == "컴퓨터공학과") {
            cls.setSub("수학");
            cls.setEsse('m');
        } else {
            System.out.println("전공 입력 실패");
            this.spec = null;
        }

        //과목별 등급지정
        cls.setKoreanGrade(cls.rating(korean, 'k'));
        cls.setMathGrade(cls.rating(math, 'm'));
    }

    //전공 get, set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
        if(spec == "국어국문학과") {
            cls.setSub("국어");
            cls.setEsse('k');
        } else if(spec == "컴퓨터공학과") {
            cls.setSub("수학");
            cls.setEsse('m');
        } else {
            System.out.println("전공 입력 실패");
            this.spec = null;
        }
    }

    public Subject getCls() {
        return cls;
    }

    public void setCls(Subject cls) {
        this.cls = cls;
    }

}
