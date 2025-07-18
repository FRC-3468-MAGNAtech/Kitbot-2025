// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static class DriveConstants {
    public static final int FrontLeftID = 6;
    public static final int BackLeftID = 5;
    public static final int FrontRightID = 8;
    public static final int BackRightID = 7;
    public static final int CurrentLimit = 40;
  }

  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
    public static final int kDriverControllerPort2 = 1;
  }

  public static class ClimberConstants {
    public static final int ClimberID = 9 ;
  }

  public static class IntakeConstants {
    public static final int intakeID = 11;
    public static final double intake = 0.5;
    public static final double extake = -0.5;
  }

  public static class ArmConstants {
    public static final int armID = 10;
    
    public static final double outSetpoint = 100;
    public static final double inSetpoint = 0;
  }
}
