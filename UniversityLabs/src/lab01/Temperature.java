package lab01;

public class Temperature {
	
	private double temperature;
	private String scale;
	
	public Temperature() {
		temperature = 0;
		scale = "C";
	}
	
	public Temperature(int temperature) {
		this.temperature = temperature;
		scale = "C";
	}
	
	public Temperature(String scale) {
		temperature = 0;
		this.scale = scale;
	}
	
	public Temperature(double temperature, String scale) {
		this.temperature = temperature;
		this.scale = scale;
	}
	
	public double getDegreesC() {
		if(scale.equals("C")) {
			return(temperature);
		} else {
			return(5 * (temperature - 32) / 9);
		}
	}
	
	public double getDegreesF() {
		if(scale.equals("F")) {
			return(temperature);
		} else {
			return(9 * (temperature / 5) + 32);
		}
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void setScale(String scale) {
		this.scale = scale;
	}
	
	public void setScaleAndTemperature(double temperature, String scale) {
		this.setTemperature(temperature);
		this.setScale(scale);
	}
	
	public String getScale() {
		return(scale);
	}
}
