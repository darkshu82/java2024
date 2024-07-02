import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex02 {
  public static void main(String[] args) {
    Date now = new Date();
    System.out.println(now);

    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
    System.out.println(sf.format(now));

    Calendar today = Calendar.getInstance();

    System.out.println("올해 년도 : " + today.get(Calendar.YEAR));
    System.out.println("이번 달 : " + today.get((Calendar.MONTH) + 1));
    System.out.println("올해 몇 번째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
    System.out.println("이번 달 몇 번째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
    System.out.println("오늘 날짜 : " + today.get(Calendar.DATE));
    System.out.println("이번 달의 몇 번째 날 : " + today.get(Calendar.DAY_OF_MONTH));
    System.out.println("올해의 몇 번째 날 : " + today.get(Calendar.DAY_OF_YEAR));
    System.out.println("요일 (일:1) ~ (토:7) : " + today.get(Calendar.DAY_OF_WEEK));
    System.out.println("월 기준 몇 째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    System.out.println("=========================================");

    Calendar today2 = Calendar.getInstance();
    System.out.println("오전(0) 오후(1) : " + today2.get(Calendar.AM_PM));
    System.out.println("시간 (0~11) : " + today2.get(Calendar.HOUR));
    System.out.println("시간 (0~23) : " + today2.get(Calendar.HOUR_OF_DAY));
    System.out.println("분 (0~59) : " + today2.get(Calendar.MINUTE));
    System.out.println("초 (0~59) : " + today2.get(Calendar.SECOND));
    System.out.println("밀리초 (0~999) : " + today2.get(Calendar.MILLISECOND));
    System.out.println("TIMEZONE (12~12) : " + today2.get(Calendar.ZONE_OFFSET / (60 * 60 * 1000)));
    System.out.println("이 달의 마지막 날짜 : " + today2.getActualMaximum(Calendar.DATE));
    System.out.println("=========================================");

    Calendar cal = Calendar.getInstance();
    cal.set(2024, (7 - 1), 2);
    System.out.println(
        "날짜 : " + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 " + cal.get(Calendar.DATE) + "일");

    int cYear = 2024;
    int cMonth = 7;
    int cDay = 12;

    int pYear = 2024;
    int pMonth = 7;
    int pDay = 1;

    Date cd = new Date();
    Date pd = new Date();

    cd.setYear(cYear);
    cd.setMonth(cMonth - 1);
    cd.setDate(cDay);

    pd.setYear(pYear);
    pd.setMonth(pMonth - 1);
    pd.setDate(pDay);

    System.out.println("cd.getTime() : " + cd.getTime());
    System.out.println("pd.getTime() : " + pd.getTime());

    long temp = ((cd.getTime() - pd.getTime()) / (1000L * 60 * 60 * 24));
    int differentDay = (int) temp;

    System.out.println("경과한 날짜 : " + differentDay + " 일");
    System.out.println("=========================================");

    Calendar currentDay = new GregorianCalendar(cYear, cMonth + 1, cDay);
    Calendar pastDay = new GregorianCalendar(pYear, pMonth + 1, pDay);

    long differentSecond = (currentDay.getTimeInMillis() - pastDay.getTimeInMillis()) / 1000;
    long differentDay2 = differentSecond / (60 * 60 * 24);
    
    System.out.println(differentDay2 + " 일이 지났습니다.");

  }
}
