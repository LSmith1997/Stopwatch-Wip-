/**
 * 
 */

/**
 * @author lsm
 *
 */
public class Time {

	
	int hours,minutes,seconds, mSeconds;
	
	public Time(int hh, int mm, int ss, int ms)
	{
		this.hours = hh;
		this.minutes = mm;
		this.seconds = ss;
		this.mSeconds= ms;
	
	
	
	
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	/**
	 * @return the seconds
	 */
	public int getSeconds() {
		return seconds;
	}

	/**
	 * @param seconds the seconds to set
	 */
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	/**
	 * @return the mSeconds
	 */
	public int getmSeconds() {
		return mSeconds;
	}

	/**
	 * @param mSeconds the mSeconds to set
	 */
	public void setmSeconds(int mSeconds) {
		this.mSeconds = mSeconds;
	}
	
	

	
	
}
