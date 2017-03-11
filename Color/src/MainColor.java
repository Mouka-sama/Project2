import lejos.hardware.Button;
import lejos.hardware.Button;
import lejos.hardware.Sound;

public class MainColor{
	
	public static void main (String[] args) throws InterruptedException{
		
		Button.LEDPattern(4);            
        Button.waitForAnyPress();
        
       
        TestColor col = new TestColor();
        
        
        System.out.println("Put on White ");
        Button.waitForAnyPress();
        col.White();
        col.afficheRGB();
        Thread.sleep(1500);
    	
    	System.out.println("Put on Red ");
        Button.waitForAnyPress();
        col.Red();
        col.afficheRGB();
        Thread.sleep(1500);
    	
    	System.out.println("Put on Black");
        Button.waitForAnyPress();
        col.Black();
        col.afficheRGB();
        Thread.sleep(1500);
    	
    	System.out.println("Put on Blue");
        Button.waitForAnyPress();
        col.Blue();
        col.afficheRGB();
        Thread.sleep(1500);
        
        System.out.println("Put on blue");
        Button.waitForAnyPress();
        col.Green();
        col.afficheRGB();
        Thread.sleep(1500);
        
        System.out.println("Put on yellow");
        Button.waitForAnyPress();
        col.Yellow();
        col.afficheRGB();
        Thread.sleep(1500);
        
        System.out.println("Put on Gray");
        Button.waitForAnyPress();
        col.Gray();
        col.afficheRGB();
        Thread.sleep(1500);

        Sound.beepSequenceUp();
        Sound.buzz();
        
        Sound.beepSequenceUp(); 
        Button.LEDPattern(2);  

    }
}