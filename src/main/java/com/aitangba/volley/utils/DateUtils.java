package com.aitangba.volley.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by fhf11991 on 2016/8/24.
 */

public class DateUtils {

    private static final SimpleDateFormat FORMAT_STAND_DT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.SIMPLIFIED_CHINESE);
    private static final SimpleDateFormat FORMAT_RFC1123_DT = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);

    public static String formatStandDatetime(Date date) {
        if (date == null) {
            date = new Date();
        }
        return FORMAT_STAND_DT.format(date);
    }

    /**
     * Format {@link Date} as stand datetime string.
     *
     * @param date {@link Date}
     * @return datetime in format "yyyy-MM-dd HH:mm:ss.SSS"
     */
    public static String formatRFC1123Datetime(Date date) {
        if (date == null) {
            date = new Date();
        }
        return FORMAT_RFC1123_DT.format(date);
    }

    /**
     * Convert stand date time string into {@code Date}.
     *
     * @param standDatetime the datetime must use format {@link DateUtils#FORMAT_STAND_DT}
     * @return java.util.Date parsed from String datetime
     */
    public static Date parseFromRFC1123Time(String standDatetime) throws ParseException {
        return FORMAT_RFC1123_DT.parse(standDatetime);
    }
}
