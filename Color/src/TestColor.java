public class TestColor {
	ColorSensor colorSensor;
	boolean booleen,bool;
	float r,v,b;
	Color color;
	char c ;
	
	public TestColor(){
		colorSensor = new ColorSensor();
		color = colorSensor.getColor();
		r = color.getRED();
		v = color.getGREEN();
		b = color.getBLUE();
	}
	
	
	//retourne true if detect White
	public boolean White(){
		
		booleen=true;
		if(0.230>r || r>0.300) 	booleen=false;
		if(0.350>v || v>0.500) 	booleen=false;
		if(0.180>b || b>0.250)	booleen=false;
		if (booleen==true)System.out.println("White detect");
		return booleen;
	}
	
	//retourne true if detect Blue
	public boolean Blue(){
		
		booleen=true;
		if(0.020>r  || r>0.050)	booleen=false;
		if(0.150>v || v>0.200) 	booleen=false;
		if(0.110>b || b>0.150)	booleen=false;
		if (booleen==true)System.out.println("Blue detect");
		return booleen;
	}
	
	//retourne true if detect yellow
	public boolean Yellow(){
		
		booleen=true;
		if(0.220>r || r>0.260)	booleen=false;
		if(0.320>v || v>0.360)	booleen=false;
		if(0.020>b   || b>0.100)	booleen=false;
		if (booleen==true)System.out.println("Yellow detect");
		return booleen;
	}
	
	//retourne true if detect Black
	public boolean Black(){
		booleen=true;
		if(0.000>r || r>0.040)	booleen=false;
		if(0.020>v || v>0.060)	booleen=false;
		if(0.000>b || b>0.040)	booleen=false;
		if (booleen==true)System.out.println("Black detect");
		return booleen;
	}
	
	//retourne true if detect Red
	public boolean Red(){
		 
		booleen=true;
		if(0.130>r || r>0.170)			booleen=false;
		if(0.030>v || v>0.070)			booleen=false;
		if(0.010>b  || b>0.040)			booleen=false;
		if (booleen==true)System.out.println("Red detect");
		return booleen;
	}
	
	//retourne true if detect Green
	public boolean Green(){
		
		booleen=true;
		if(0.2>r || r>0.12)	booleen=false;
		if(0.50>v  || v>0.130)	booleen=false;
		if(0>b  || b>0.1)	booleen=false;
		if (booleen==true)System.out.println("green detect");
		return booleen;
	}
	//retourne true if detect Gray
public boolean Gray(){
		
		booleen=true;
		if(0.00>r || r>0.12)	booleen=false;
		if(0.00>v  || v>0.130)	booleen=false;
		if(0.00>b  || b>0.1)	booleen=false;
		if (booleen==true)System.out.println("Gray detecte");
		return booleen;
	}
	
	
	public char returnCouleur(){
		if(White()){
			System.out.println("\nWhite");
			c='w';
		}
		
		else if (Blue()){
			System.out.println("\nBlue");
			c='b';
		}
		
		else if (Yellow()){
			System.out.println("\nYellow");
			c='y';
		}
		
		else if (Black()){
			System.out.println("\nBlack");
			c='n';
		}
		
		else if (Red()){
			System.out.println("\nRed");
			c='r';
		}
		
		else if (Green()){
			System.out.println("\nGreen");
			c='G';
		}
		
		else if (Gray()){
			System.out.println("\nGray");
			c='g';
		}
		
		return c;
	}
	
	
	public void afficheRGB(){
		System.out.println("\nRed : " +r+ "\nGreen : " +v+ "\nBlue : "+b);
	}
	
	//
	public void detecte(){
		r=color.getRED();
		v=color.getGREEN();
		b=color.getBLUE();
	}
	

	
	public boolean estCouleur (char c){
		bool = false;
		detecte();
		if (c=='r'&&Red()) bool = true;
		if (c=='G'&&Green()) bool = true;
		if (c=='b'&&Blue()) bool = true;
		if (c=='w'&&White()) bool = true;
		if (c=='n'&&Black()) bool = true;
		if (c=='j'&&Yellow()) bool = true;
		if (c=='g'&&Gray()) bool = true;
		return bool;
	}
}