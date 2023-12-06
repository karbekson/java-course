package tech.dar.practice8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DayOfWeek {

    /*
        Написать функцию в Java, которая принимает строку в формате даты
        (например, "2023-12-06") и возвращает день недели, соответствующий этой дате.
     */
    public String getDayOfWeek(String strDate) {
        Date date = parseDate(strDate);
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        Map<Integer, String> daysMap = new HashMap<>() {{
            put(1, "Sunday");
            put(2, "Monday");
            put(3, "Tuesday");
            put(4, "Wednesday");
            put(5, "Friday");
            put(6, "Saturday");
        }};
        return daysMap.get(dayOfWeek);
    }

    /*
        Создать функцию, которая добавляет определенное количество дней к заданной дате
        и возвращает новую дату.
     */
    public Date addDaysToDate(String strDate, int days) {
        Date date = parseDate(strDate);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);
        return c.getTime();
    }

    /*
    Написать метод, который принимает две даты и вычисляет разницу между ними в днях.
    */
    public int getDaysBetween(String strDate1, String strDate2) {
        Date date1 = parseDate(strDate1);
        Date date2 = parseDate(strDate2);
        long millis = Math.abs(date1.getTime() - date2.getTime());
        return (int) (millis / 1000 / 60 / 60 / 24);
    }

    /*
    Написать функцию, которая возвращает дату следующего вторника относительно заданной даты.
    */
    public Date getNextTuesday(String strDate) {
        Date date = parseDate(strDate);

        Calendar c = Calendar.getInstance();
        c.setTime(date);

        // TODO: сделать в одну строку математическую функцию
        int currentDayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        int days = 0;

//        if (currentDayOfWeek >= 3)
//            days = 7 - (currentDayOfWeek - 3);
//        if (currentDayOfWeek < 3)
//            days = 3 - currentDayOfWeek;

        days = currentDayOfWeek >= 3 ? 7 - (currentDayOfWeek - 3) : 3 - currentDayOfWeek;

        c.add(Calendar.DATE, days);
        return c.getTime();
    }

    private Date parseDate(String strDate) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            return df.parse(strDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Date();
    }
}
