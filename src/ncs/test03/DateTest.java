package ncs.test03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar(1987, 4, 27);  // 생일 (5월은 4로 입력)
        GregorianCalendar calToday = new GregorianCalendar();         // 오늘 날짜

        SimpleDateFormat fm = new SimpleDateFormat("yyyy년 M월 d일 E요일");

        // 생일 출력
        System.out.println("생일 : " + fm.format(cal.getTime()));

        // 현재 날짜 출력
        System.out.println("현재 : " + fm.format(calToday.getTime()));

        // 나이 계산 (한국식 만나이 = 올해 - 태어난 해 + 1)
        int age = calToday.get(Calendar.YEAR) - cal.get(Calendar.YEAR) + 1;
        System.out.println("나이 : " + age + "세");
    }
}