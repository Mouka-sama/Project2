import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;

public class ColorSensor {
	
	public ColorSensor(){
		
	}
	public Color getColor(){
		EV3ColorSensor cs = new	 EV3ColorSensor(SensorPort.S1);
		cs.setFloodlight(true);
		SampleProvider colorRGBSensor = cs.getRGBMode();
		int sampleSize = colorRGBSensor.sampleSize();            
		float[] rgb = new float[sampleSize];
		colorRGBSensor.fetchSample(rgb, 0);
		//cs.close();
		return (new Color(rgb));
	}
}