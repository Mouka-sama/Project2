import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;
import lejos.robotics.Color;

public class Color {
	float rvb[]=new float[3];
	Color color = new Color(0,0,0);
	float r,v,b;
	
	public Color(float[] rvb){
		this.rvb[0]=rvb[0];
		this.rvb[1]=rvb[1];
		this.rvb[2]=rvb[2];
	}
					
	public float getRED(){
		return rvb[0];
	}
	
	public float getGREEN(){
		return rvb[1];
	}
	
	public float getBLUE(){
		return rvb[2];
	}
}