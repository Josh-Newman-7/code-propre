package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * A utility class for formatting dates.
 */
public class DateUtils {

    /**
     * Formats a date using the specified pattern.
     *
     * @param pattern The pattern to use for formatting.
     * @param date    The date to be formatted.
     * @return A formatted date string.
     */
    public static String format(String pattern, Date date) {
        return formatInternal(pattern, date);
    }

    /**
     * Formats a date using the default pattern "dd/MM/yyyy HH:mm:ss".
     *
     * @param date The date to be formatted.
     * @return A formatted date string using the default pattern.
     */
    public static String formatDefaut(Date date) {
        return formatInternal("dd/MM/yyyy HH:mm:ss", date);
    }

    /**
     * Internal method for formatting a date using a specified pattern.
     *
     * @param pattern The pattern to use for formatting.
     * @param date    The date to be formatted.
     * @return A formatted date string.
     */
    private static String formatInternal(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }
}
