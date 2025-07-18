// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  SparkMax intakeMtr;

  public Intake() {
    intakeMtr = new SparkMax(IntakeConstants.intakeID, MotorType.kBrushless);

    SparkMaxConfig config = new SparkMaxConfig();

    config.inverted(false);

    intakeMtr.configure(config, ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);
  }

  public void intake() {
    intakeMtr.set(IntakeConstants.intake);
  }

  public void extake() {
    intakeMtr.set(IntakeConstants.extake);
  }

  public void stop() {
    intakeMtr.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
