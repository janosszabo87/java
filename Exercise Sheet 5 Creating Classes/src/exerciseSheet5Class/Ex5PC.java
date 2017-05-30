package exerciseSheet5Class;

public class Ex5PC {
	// member variables

	private int ram;
	private int hdd;
	private int os;
	private int monitor;
	private double cost;

	// constant variable

	// ram
	public static final int RAM_4GB = 1;
	public static final int RAM_8_GB = 2;
	public static final int RAM_16_GB = 3;

	// hdd
	public static final int HDD_100GB = 1;
	public static final int HDD_250GB = 2;
	public static final int HDD_500GB = 3;
	// os
	public static final int WINDOWS = 1;
	public static final int LINUX = 2;
	// monitor
	public static final int MONITOR_22 = 1;
	public static final int MONITOR_24 = 2;

	// Constructors

	public Ex5PC() {

	}

	public Ex5PC(int ram, int hdd, int os, int monitor) {
		setRam(ram);
		setHdd(hdd);
		setOs(os);
		setMonitor(monitor);
	}

	// Accessors

	public void setRam(int ram) {
		switch (ram) {
		case RAM_4GB:
			cost = cost + 50;
			break;
		case RAM_8_GB:
			cost = cost + 70;
			break;
		case RAM_16_GB:
			cost = cost + 120;
			break;
		default:
			System.out.println("\nInvalid input! RAM set up to default value RAM 8Gb".toUpperCase());
			ram = RAM_8_GB;
			cost = cost + 70;
			break;
		}
		this.ram = ram;
	}

	public int getRam() {
		return this.ram;
	}

	public void setHdd(int hdd) {
		switch (hdd) {
		case HDD_100GB:
			cost = cost + 30;
			break;
		case HDD_250GB:
			cost = cost + 40;
			break;
		case HDD_500GB:
			cost = cost + 50;
			break;
		default:
			System.out.println("\nInvalid input! Hdd set up to default value HDD 500Gb".toUpperCase());
			hdd = HDD_500GB;
			cost = cost + 50;
			break;
		}
		this.hdd = hdd;
	}

	public int gethdd() {
		return this.hdd;
	}

	public void setOs(int os) {
		switch (os) {
		case WINDOWS:
			cost = cost + 100;
			break;
		default:
			System.out.println("\nOperating System set up to default value Ubuntu".toUpperCase());
			os = LINUX;

		}
		this.os = os;
	}

	public int getOS() {
		return this.os;

	}

	public void setMonitor(int monitor) {
		switch (monitor) {
		case MONITOR_22:
			cost = cost + 200;
			break;
		case MONITOR_24:
			cost = cost + 300;
			break;
		default:
			System.out.println("\nInvalid input! Monitor set up to default value Asus 22".toUpperCase());
			monitor = MONITOR_22;
			cost = cost + 200;
		}
		this.monitor = monitor;
	}

	public int getMonitor() {
		return this.monitor;
	}
	
	public double getCost(){
		return cost;
	}

	// toString
	public String toString() {
		return String.format(
				"Random Access Memory: %s" + "\nHard Disk Drive: %s" + "\nOperating System: %s" + "\nMonitor: %s"+"\nCost: %.2f",
				ramToString(), hddToString(), osToString(), monitorToString(), getCost());

	}

	// Return int to Strings
	public String ramToString() {
		switch (ram) {
		case RAM_4GB:
			return "4Gb of RAM";
		case RAM_8_GB:
			return "8Gb of RAM";
		case RAM_16_GB:
			return "16Gb of RAM";
		default:
			return null;

		}

	}

	public String hddToString() {
		switch (hdd) {
		case HDD_100GB:
			return "HDD 100Gb";
		case HDD_250GB:
			return "HDD 250gb";
		case HDD_500GB:
			return "HDD 500Gb";
		default: 
			return null;
		}
	}

	public String osToString() {
		switch (os) {
		case WINDOWS:
			return "Windows 10";
		case LINUX:
			return "Ubuntu";
		default:
			return null;
		}
	}

	public String monitorToString() {
		switch (monitor) {
		case MONITOR_22:
			return "Asus 22";
		case MONITOR_24:
			return "Asus 24";
		default:
			return null;
		}
	}
}
