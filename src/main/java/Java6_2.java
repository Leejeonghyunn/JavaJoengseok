public class Java6_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String student = s.info();
        System.out.println(student);
    }
}

class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math) { //생성자
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public String info() { //학생의 정보를 추가하는 info() 메서드
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + (kor + eng + math)
                + "," + ((int) ((kor + eng + math) / 3f * 10 + 0.5f) / 10f);
    }
    //출력값 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
}
