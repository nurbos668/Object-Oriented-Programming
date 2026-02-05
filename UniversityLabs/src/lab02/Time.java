package lab02;

public class Time {
	int hour;
	int minute;
	int second;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time(12, 59, 34);
		Time t2 = new Time(2, 3, 44);
		
		t.add(t2);
		
		System.out.println(t.toUniversal());
	}
	
	public Time(int hour, int minute, int second) {
		if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		} else {
			System.out.println("Invalid data");
		}
	}
	
	public String toStandard() {
		StringBuilder str = new StringBuilder();
		int h = this.hour;	
		boolean flag = false;
		
		if(h > 12) {
			h -= 12;
			flag = true;
		}
		
		if(h < 10 && h != 0) {
			str.append("0" + h + ":");
		} else {
			str.append(h + ":");
		}
		
		if(minute < 10) {
			str.append("0" + minute + ":");
		} else {
			str.append(minute + ":");
		}
		
		if(second < 10) {
			str.append("0" + second);
		} else {
			str.append(second);
		}
		
		if(!flag) str.append(" AM");
		else str.append(" PM");
		
		return str.toString();
	}
	
	public String toUniversal() {
		StringBuilder str = new StringBuilder();
		
		if(hour < 10) {
			str.append("0" + hour + ":");
		} else {
			str.append(hour + ":");
		}
		
		if(minute < 10) {
			str.append("0" + minute + ":");
		} else {
			str.append(minute + ":");
		}
		
		if(second < 10) {
			str.append("0" + second);
		} else {
			str.append(second);
		}
		
		return str.toString();
	}
	
	public void add(Time t2) {
		int	h = this.hour + t2.hour;
		int m = this.minute + t2.minute;
		int s = this.second + t2.second;
		
		if(h >= 24) {
			h -= 24;
		}
		if(m >= 60) {
			m -= 60;
			h++;
		}
		if(s >= 60) {
			s -= 60;
			m++;
		}
		
		this.hour = h;
		this.minute = m;
		this.second = s;
		
		this.hour = h;
		this.minute = m;
		this.second = s;
		
	}
	
}
