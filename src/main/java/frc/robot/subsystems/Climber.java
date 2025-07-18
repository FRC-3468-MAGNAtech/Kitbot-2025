// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SoftLimitConfig;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimberConstants;

public class Climber extends SubsystemBase {
  /** Creates a new Climber. */
  private SparkMax ClimberMotor;
  SoftLimitConfig reverseLimit;
 
  public Climber() {
    
  
    ClimberMotor = new SparkMax(ClimberConstants.ClimberID, MotorType.kBrushless);
    SparkMaxConfig config = new SparkMaxConfig();
    config.idleMode(IdleMode.kBrake);
    config.inverted(false);
    config.smartCurrentLimit(40);

    ClimberMotor.configure(config, ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);
  }
    public void climbUp() {
      ClimberMotor.set(8.5);
    }
    public void climbDown() {
      ClimberMotor.set(-1);
    }
    public void climbStop() {
      ClimberMotor.set(0);
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
