/**
 * Student 클래스에 두 개의 메서드 getTotal()과 getAverage()를 추가하시오
 * 출력값 - 이름: 홍길동 총점 : 236 평균 78.7
 */
public class Java6_3 {
    public static void main(String[] args) {
        Student2 s = new Student2();

        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름 : " + s.name);
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());
    }
}

class Student2 {
    String name; //멤버변수
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student2(){ //기본 생성자

    }
    Student2(String name, int ban, int no, int kor, int eng, int math) { //생성자
        this.name = name; //지역변수(매개변수)
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() { //총점을 구하는 메서드
        return kor + eng + math;
    }
    float getAverage() { //평균을 구하는 메서드
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }
    public String info() { //학생의 정보를 추가하는 info() 메서드
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + (kor + eng + math)
                + "," + ((int) ((kor + eng + math) / 3f * 10 + 0.5f) / 10f); //소숫점 올림, int 형변환으로 인한 정수화
    }
}


