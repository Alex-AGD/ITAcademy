package timeTask22;

import java.util.Objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int second) {
        this.hours = second / 3600;
        this.minutes = (second % 3600) / 60;                 //1st contructor
        this.seconds = second % 60;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;                             //2st contructor
        this.seconds = seconds;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hours == time.hours &&
                minutes == time.minutes &&
                seconds == time.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return "Time " + "hours = " + hours + ", minutes = " + minutes + ", seconds = " + seconds;
    }
}
