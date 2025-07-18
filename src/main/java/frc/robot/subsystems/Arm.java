// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.ControlType;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.ClosedLoopConfig.FeedbackSensor;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ArmConstants;

public class Arm extends SubsystemBase {
  /** Creates a new Arm. */
  SparkMax armMtr;
  AbsoluteEncoder armEncoder;
  SparkClosedLoopController armPID;

  public Arm() {
    armMtr = new SparkMax(ArmConstants.armID, MotorType.kBrushless);

    SparkMaxConfig config = new SparkMaxConfig();
    config.closedLoop.pid(0.001, 0, 0.0017);
    config.closedLoop.feedbackSensor(FeedbackSensor.kAbsoluteEncoder);
    config.idleMode(IdleMode.kBrake);
    config.smartCurrentLimit(40);
    config.closedLoopRampRate(0.5);
    armEncoder = armMtr.getAbsoluteEncoder();
    armPID = armMtr.getClosedLoopController();
  }

  public void armUp() {
    armMtr.set(0.3);
  }

  public void armDown() {
    armMtr.set(-0.3);
  }

  public void armStop() {
    armMtr.set(0);
  }
  
  public void pointMove(double rot) {
    armPID.setReference(rot, ControlType.kPosition);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
