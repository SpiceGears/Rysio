// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5883.Rysio;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeftMotor;
    public static SpeedController driveTrainRightMotor;
    public static RobotDrive driveTrainRobotDrive21;
    public static SpeedController shootingSystemSpeedController1;
    public static Compressor shootingSystemCompressor1;
    public static DoubleSolenoid shootingSystemDoubleSolenoid1;
    public static SpeedController aimingSystemSpeedController1;
    public static DigitalInput aimingSystemLimitSwitch1;
    public static DigitalInput aimingSystemLimitSwitch2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftMotor = new Victor(0);
        LiveWindow.addActuator("DriveTrain", "LeftMotor", (Victor) driveTrainLeftMotor);
        
        driveTrainRightMotor = new Victor(1);
        LiveWindow.addActuator("DriveTrain", "RightMotor", (Victor) driveTrainRightMotor);
        
        driveTrainRobotDrive21 = new RobotDrive(driveTrainLeftMotor, driveTrainRightMotor);
        
        driveTrainRobotDrive21.setSafetyEnabled(true);
        driveTrainRobotDrive21.setExpiration(0.1);
        driveTrainRobotDrive21.setSensitivity(0.5);
        driveTrainRobotDrive21.setMaxOutput(1.0);

        shootingSystemSpeedController1 = new Victor(3);
        LiveWindow.addActuator("ShootingSystem", "Speed Controller 1", (Victor) shootingSystemSpeedController1);
        
        shootingSystemCompressor1 = new Compressor(0);
        
        
        shootingSystemDoubleSolenoid1 = new DoubleSolenoid(0, 6, 4);
        LiveWindow.addActuator("ShootingSystem", "Double Solenoid 1", shootingSystemDoubleSolenoid1);
        
        aimingSystemSpeedController1 = new Victor(2);
        LiveWindow.addActuator("AimingSystem", "Speed Controller 1", (Victor) aimingSystemSpeedController1);
        
        aimingSystemLimitSwitch1 = new DigitalInput(0);
        LiveWindow.addSensor("AimingSystem", "Limit Switch 1", aimingSystemLimitSwitch1);
        
        aimingSystemLimitSwitch2 = new DigitalInput(1);
        LiveWindow.addSensor("AimingSystem", "Limit Switch 2", aimingSystemLimitSwitch2);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
