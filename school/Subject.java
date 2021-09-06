package school;

public class Subject {
    private String sub;
    private int korean;
    private int math;
    private char esse;
    private char koreanGrade;
    private char mathGrade;
    private int dance;
    private String danceGrade;

    //생성자
    public Subject(int korean, int math) {
        this.korean = korean;
        this.math = math;
    }

    //등급지정 method
    public char rating(int point, char esse) {
        char grade;
        if(this.esse == esse) {
            if(point >= 95) {
                grade = 'S';
            } else if(point >= 90) {
                grade = 'A';
            } else if(point >= 80) {
                grade = 'B';
            } else if(point >= 70) {
                grade = 'C';
            } else if(point >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
        } else {
            if(point >= 90) {
                grade = 'A';
            } else if(point >= 80) {
                grade = 'B';
            } else if(point >= 70) {
                grade = 'C';
            } else if(point >= 55) {
                grade = 'D';
            } else {
                grade = 'F';
            }
        }
        return grade;
    }

    public void danceRating(int dance) {
        if(dance >= 70) {
            this.danceGrade = "pass";
        } else {
            this.danceGrade = "fail";
        }
    }

    //get, set
    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public char getEsse() {
        return esse;
    }

    public void setEsse(char esse) {
        this.esse = esse;
    }

    public char getKoreanGrade() {
        return koreanGrade;
    }

    public void setKoreanGrade(char koreanGrade) {
        this.koreanGrade = koreanGrade;
    }

    public char getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(char mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getDance() {
        return dance;
    }

    public void setDance(int dance) {
        this.dance = dance;
    }

    public String getDanceGrade() {
        return danceGrade;
    }

    public void setDanceGrade(String danceGrade) {
        this.danceGrade = danceGrade;
    }

}
