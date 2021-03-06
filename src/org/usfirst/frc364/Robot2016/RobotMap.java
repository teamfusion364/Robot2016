// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc364.Robot2016;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.interfaces.Gyro;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap {

    public static SpeedController driveSystemleftFront;
    public static SpeedController driveSystemleftRear;
    public static SpeedController driveSystemrightFront;
    public static SpeedController driveSystemrightRear;
    public static RobotDrive driveSystemrobotDrive;
    public static SpeedController intakeSystemintakeMotor;
    public static DigitalInput intakeSystemballSensor;
    public static SpeedController shootSystemshootMotor;
    public static SpeedController shootSystemshootMotor2;
    public static AnalogGyro driveSystemgyro;
    public static SpeedController hangSystemwenchMotor;
    public static SpeedController flipSystemflipMotor;
    public static AnalogInput hangSystemwenchPot;
	public static AnalogInput intakeSystemintakePot;
	public static AnalogInput flipSystemflipPot;
	public static SpeedController intakeSystemintakePulley;
	
    public static void init() { 

        driveSystemleftFront = new VictorSP(4);
        driveSystemleftRear = new VictorSP(5);       
        driveSystemrightFront = new VictorSP(1);        
        driveSystemrightRear = new VictorSP(0);
        
        driveSystemrobotDrive = new RobotDrive(driveSystemleftFront, driveSystemleftRear,
              driveSystemrightFront, driveSystemrightRear);
        		
        driveSystemrobotDrive.setSafetyEnabled(true);
        driveSystemrobotDrive.setExpiration(0.1);
        driveSystemrobotDrive.setSensitivity(0.5);
        driveSystemrobotDrive.setMaxOutput(1.0);
        driveSystemgyro = new AnalogGyro(0);

        intakeSystemintakeMotor = new VictorSP(8); 
        intakeSystemballSensor = new DigitalInput(9);
        intakeSystemintakePot = new AnalogInput(1);
        intakeSystemintakePulley = new VictorSP(9);
        
        shootSystemshootMotor = new VictorSP(7);
        shootSystemshootMotor2 = new VictorSP(6);
        
        hangSystemwenchMotor = new VictorSP(2);
        flipSystemflipMotor = new VictorSP(3);
        hangSystemwenchPot = new AnalogInput(2);
        flipSystemflipPot = new AnalogInput(3);
        
        
    }
}
