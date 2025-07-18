// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
import frc.robot.commands.ArcadeDrive;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.RunCommand;

public final class Autos {
  /** Example static factory for an autonomous command. */
  public static Command driveForward(DriveTrain subsystem) {
    return Commands.deadline(Commands.waitSeconds(2), new RunCommand(() -> subsystem.arcadeDrive(0.25, 0)));
  }


  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
