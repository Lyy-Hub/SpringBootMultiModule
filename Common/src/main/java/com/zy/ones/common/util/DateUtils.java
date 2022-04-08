package com.zy.ones.common.util;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @author xiangtw
 * @date 2021年12月29日 11:33
 * description:
 */
public class DateUtils {

    public static String[] getLast12Months() {
        String[] last12Months = new String[12];
        LocalDate localDate = LocalDate.now();

        for (int i = 0; i < 12; i++) {
            last12Months[11 - i] = localDate.minusMonths(i).getYear() + "-"
                    + fillZero(localDate.minusMonths(i).getMonth().getValue());
        }
        return last12Months;
    }

    public static String fillZero(int i) {
        String month = "";
        if (i < 10) {
            month = "0" + i;
        } else {
            month = String.valueOf(i);
        }
        return month;
    }

    /**
     * 获取当前年月
     *
     * @return
     */
    public static String getYearMonth() {
        return cn.hutool.core.date.DateUtil.format(new Date(), "yyyy-MM");
    }

    /**
     * 获取年份间隔
     *
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @return 间隔年份
     */
    public static int getYearRange(Date startDate, Date endDate) {
        Calendar bef = Calendar.getInstance();
        Calendar aft = Calendar.getInstance();
        bef.setTime(startDate);
        aft.setTime(endDate);
        int day = aft.get(Calendar.DATE) - bef.get(Calendar.DATE);
        int month = aft.get(Calendar.MONTH) - bef.get(Calendar.MONTH);
        int year = aft.get(Calendar.YEAR) - bef.get(Calendar.YEAR);
        // 年月日都相等，返回0
        if (year == 0 && month == 0 && day == 0) {
            return 0;
        }
        if (year < 0) {
            return 0;
        }
        if (year == 0) {
            if (month < 0) {
                return 0;
            } else if (month == 0) {
                if (day < 0) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        }
        if (year > 0) {
            if (month < 0) {
                return year;
            } else if (month == 0) {
                if (day <= 0) {
                    return year;
                } else {
                    return year + 1;
                }
            } else {
                return year + 1;
            }
        }
        return 0;
    }
}
