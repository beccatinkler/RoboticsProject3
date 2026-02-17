//Import packages
import lejos.nxt.*;
import lejos.robotics.navigation.*;
public class TravelTest 
{

	/**
	 * Robot traces out square w/ side lengths of 1 meter
	 * 
	 * author: Becca Tinkler
	 * 
	 */
	
	// Global variables
	DifferentialPilot pilot;
	
	// Have robot travel 93.5 cm (account for movement forward after stopping)
	public void go()
	{
		pilot.travel(93.5);
	}
	
	// Have robot turn 90*
	public void turn()
	{
		pilot.travel(100, true);
		pilot.rotate(90.0);
	}
	
	public static void main(String[] args) 
	{
		// Display program name
		LCD.drawString("Square", 0, 0);
			
		// Wait for button press to start
		Button.waitForPress();
		LCD.clear();
				
		// Create new RotationTest object and set motor speed
		TravelTest robot = new TravelTest();
		robot.pilot = new DifferentialPilot(3.1, 17.25, Motor.A, Motor.C);
		robot.pilot.setTravelSpeed(25);
		
		// Call go() and turn() methods
		// Loop through four times to complete square
		for (int i = 0; i < 4; i++)
		{
			robot.go();
			robot.turn();
		}
		
		// Wait for button press to end 
		Button.waitForPress();
	}
	
}
