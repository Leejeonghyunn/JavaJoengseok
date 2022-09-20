/**
 * 메서드명 : max
 * 기능 : 주어진 int 형 배열의 값 중에서 제일 큰 값을 반환한다
 *       만일 주어진 배열이 null 이거나 크기가 0인 경우, -999999를 반환한다
 * 반환타입 : int
 * 매개변수 : int[] arr - 최대값을 구할 배열
 */
public class Java6_20 {
    public static int max(int[] arr) {

        if (arr == null || arr.length == 0) { //유효성 체크 - null 이거나 크기가 0인 배열은 -999999를 반환한다
            return -999999;
        }
        int max = arr[0]; //배열의 첫 번째 값으로 최대값을 초기화 한다

        for (int i = 1; i<arr.length; i++) { //배열의 두 번째 값부터 비교한다
            if(arr[i] > max)
                max = arr[i];
            //최대값 max를 배열 1번째 값으로 초기화 했으므로 첫번쨰 값은 비교할 필요가 없다
            //arr[1]부터 비교하고 그 값이 max보다 크면 그 값을 변수 max에 저장한다
        }
        return max; //배열의 요소중 가장 큰 값 반환
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};

        System.out.println(java.util.Arrays.toString(data)); // [3,2,9,4,7]

        System.out.println("최대값 : " + max(data)); //최대값 : 9
        System.out.println("최대값 : " + max(null)); //null -> -999999
        System.out.println("최대값 : " + max(new int[]{})); //크기가 0인 배열 -> -999999

    }
}
