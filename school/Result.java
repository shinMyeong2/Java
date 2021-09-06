package school;
import java.util.ArrayList;

public class Result {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();

        //학생 정보 입력
        Student ahn = new Student("안성원", "181213", "국어국문학과", 95, 56);
        Student oh = new Student("오태훈", "182330", "컴퓨터공학과", 95, 95);
        Student lee = new Student("이동호", "171518", "국어국문학과", 100, 88);
        Student cho = new Student("조성욱", "172350", "국어국문학과", 89, 95);
        Student choi = new Student("최태평", "171290", "컴퓨터공학과", 85, 56);

        ahn.getCls().setDance(95);
        lee.getCls().setDance(85);
        choi.getCls().setDance(55);

        ahn.getCls().danceRating(95);
        lee.getCls().danceRating(85);
        choi.getCls().danceRating(55);

        studentList.add(ahn);
        studentList.add(oh);
        studentList.add(lee);
        studentList.add(cho);
        studentList.add(choi);

        //국어 점수 출력
        System.out.println("----------------------------------");
        System.out.println("         국어 수강생 학점");
        System.out.println("----------------------------------");
        System.out.println(" 이름  |  학번  |중점과목|  점수");
        System.out.println("----------------------------------");
        for(int i = 0; i < studentList.size(); i++) {
            Student ii = studentList.get(i);
            System.out.printf("%s | %s |  %s  | %d:%s |"
                , ii.getName(), ii.getId(), ii.getCls().getSub(), ii.getCls().getKorean(), ii.getCls().getKoreanGrade());
            System.out.println("\n----------------------------------");
        }

        System.out.println("\n\n");

        //수학 점수 출력
        System.out.println("----------------------------------");
        System.out.println("         수학 수강생 학점");
        System.out.println("----------------------------------");
        System.out.println(" 이름  |  학번  |중점과목|  점수");
        System.out.println("----------------------------------");
        for(int i = 0; i < studentList.size(); i++) {
            Student ii = studentList.get(i);
            System.out.printf("%s | %s |  %s  | %d:%s |"
                , ii.getName(), ii.getId(), ii.getCls().getSub(), ii.getCls().getMath(), ii.getCls().getMathGrade());
            System.out.println("\n----------------------------------");
        }

        System.out.println("\n\n");

        //댄스 점수 출력
        System.out.println("----------------------------------");
        System.out.println("         댄스 수강생 학점");
        System.out.println("----------------------------------");
        System.out.println(" 이름  |  학번  |중점과목|  점수");
        System.out.println("----------------------------------");
        for(int i = 0; i < studentList.size(); i++) {
            Student ii = studentList.get(i);
            if(ii.getCls().getDanceGrade() != null) {
                System.out.printf("%s | %s |  %s  | %d:%s|"
                    , ii.getName(), ii.getId(), ii.getCls().getSub(), ii.getCls().getDance(), ii.getCls().getDanceGrade());
                System.out.println("\n----------------------------------");
            } else {
                continue;
            }
        }

    }
    
}
