package classes;

public class Clock {

	// instance variables
	private int hours;
	private int minutes;
	private int seconds;

	//Constructors
	public Clock() {
		
	}

	public Clock(int hours, int minutes, int seconds) {
		this();
		addHours(hours);
		addMinutes(minutes);
		addSeconds(seconds);
		

	}

	// Set and get methods

	public void setSeconds(int seconds) {
		if (seconds >= 0 && seconds < 60) {
			this.seconds = seconds;
		} else {
			System.out.println("Seconds set up to default 0");

		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setMinutes(int minutes) {
		if (minutes >= 0 && minutes < 60) {
			this.minutes = minutes;
		} else
			System.out.println("Time set up to default 0");
	}

	public int getMinutes() {
		return minutes;
	}

	public void setHours(int hours) {
		if (hours >= 0 && hours < 24) {
			this.hours = hours;
		} else {
			System.out.println("Hors set up to default 12");
		}
	}

	public int getHours() {
		return hours;
	}
	
	
	

	// add seconds methods

	public void addSeconds(int seconds) {
		
			
		this.seconds = this.seconds + seconds;
		
								
		for (int i = 0; i < this.seconds; i++) {
				
			if (this.seconds>59) {
				addMinutes(1);
				this.seconds = this.seconds - 60;

			}

		}
	}

	// add minutes

	public void addMinutes(int minutes) {

		this.minutes = this.minutes + minutes;

		for (int i = 0; i < this.minutes; i++) {

			if (this.minutes > 59) {
				addHours(1);
				this.minutes -= 60;
			}
		}

	}

	// add hours
							
	public void addHours(int hours) {
		
		
		this.hours = this.hours + hours;
							
		for (int i = 0; i < this.hours; i++) {
				
			if (this.hours> 23) {
				
				this.hours = this.hours-24;
			}
		}
	}


	// to String
	public String toString() {
		return String.format("%d:%d:%d", getHours(), getMinutes(), getSeconds());
	}

}