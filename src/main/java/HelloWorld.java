public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World! We are learning something");
        int secondsInAnHour = 3600;
        int secondsInAMinute = 60;

        int totalSeconds = 23;
        int hours = totalSeconds / secondsInAnHour;
        int minAndSeconds = totalSeconds % secondsInAnHour;
        int minutes = minAndSeconds / secondsInAMinute;
        int seconds = minAndSeconds % secondsInAMinute;
        System.out.println(totalSeconds + " seconds = " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
        secondsToHoursMinutesAndSeconds(totalSeconds);
    }

    public static void secondsToHoursMinutesAndSeconds(int totalSeconds) {
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        if (totalSeconds > 60) {
            minutes = totalSeconds / 60;
            if (minutes > 60) {
                hours = minutes / 60;
                minutes %= 60;
            }
            seconds = totalSeconds % 60;
        } else {
            seconds = totalSeconds;
        }
        System.out.println(totalSeconds + " seconds = " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
