/**
 * 정의된 메서드를 작성하고 테스트하시오
 * 메서드명 : isNumber
 * 기능 : 주어진 문자열이 모두 숫자로만 이루어져 있는지 확인한다. 모두 숫자로만 이루어져 있으면 true를 반환하고,
 *       그렇지 않으면 false를 반환한다.
 *       만일 주어진 문자열이 null이거나 빈 문자열 " " 이라면 false를 반환한다
 * 반환타입 : boolean
 * 매개변수 : String str - 검사할 문자열
 */
public class Java6_18 {
    public static boolean isNumber(String str) {

        if (str == null || str.equals("")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //반복문을 통해 문자열에서 한 문자씩 차례대로 읽어와 char타입의 변수 ch에 저장한다

            if(ch < '0' || ch > '9'){ //읽어온 문자(ch)가 숫자가 아니면 false를 반환한다
                return false;
            }
        }
        return true; //boolean 반환값
    }

    public static void main(String[] args) {

        String str = "123"; //문자열
        System.out.println(str + "는 숫자입니까?" + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));
    }
}
