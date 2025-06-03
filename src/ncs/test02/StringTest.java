package ncs.test02;

public class StringTest {
    public static void main(String args[]) {
        // 문자열 데이터 준비
        String str = "1.22,4.12,5.93,8.71,9.34";

        // 배열에 실수 데이터를 넣는다.
        String[] st = str.split(",");         // str에서 데이터를 분리한다.
        double data[] = new double[st.length];
        for (int i = 0; i < st.length; i++) {
            data[i] = Double.parseDouble(st[i]);
        }

        // 배열 데이터의 합을 구한다.
        double sum = 0;
        for (double num : data) {             // for-each문 사용
            sum += num;
        }

        // 결과 값을 출력한다.
        System.out.printf("합계 : %.2f\n", sum);
        System.out.printf("평균 : %.2f\n", sum / data.length);
    }
}

