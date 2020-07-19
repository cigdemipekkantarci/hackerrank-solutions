

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        /*
        For Date class:
        year - the year minus 1900.
        month - the month between 0-11.
        date - the day of the month between 1-31.
        */
        Date myDate = new Date(year-1900,month-1,day);
        c.setTime(myDate);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        // 0 - Sunday
        String[] strDays = new String[] { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY","THURSDAY", "FRIDAY", "SATURDAY" };
        return strDays[dayOfWeek - 1];
    }

}

