/**
 * 메서드명 : shuffle
 * 기능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다. 처리한 배열을 반환한다.
 * 반환타입 : int[]
 * 매개변수 : int[] arr - 정수값이 담긴 배열
 */
public class Java6_17 {
    //인스턴스 변수 존재x
    public static int[] shuffle(int[] arr) { //static 메서드 - 메서드 내에 외부 인스턴스변수 존재하지 않음, 매개변수(지역변수)로만 주입

        if(arr == null || arr.length == 0) { //유효성 체크 반환
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            int k = (int) (Math.random() * arr.length); //int로 형변환

            int tmp = arr[i]; //arr[i]와 arr[k]의 값을 서로 바꾼다
            arr[i] = arr[k];
            arr[k] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}

