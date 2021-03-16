// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveAutoSubsystem;
import frc.robot.commands.MoveByCommand;
import frc.robot.commands.TurnByCommand;

public class Blue extends SequentialCommandGroup {
  boolean isFinished = false;

  /** Creates a new Blue. */
  public Blue(DriveAutoSubsystem driveAuto) {
    addCommands(new MoveByCommand(12.5 * 12, driveAuto, 0));
    addCommands(new TurnByCommand((Math.atan(7.5/2.5) - 45) * -1, driveAuto, 0));
    addCommands(new MoveByCommand(Math.sqrt(62.5) * 12, driveAuto, 0));
    addCommands(new TurnByCommand((180 - Math.atan(2.5/7.5)) * -1, driveAuto, 0));
    addCommands(new MoveByCommand(Math.sqrt(31.25) * 12, driveAuto, 0));
    addCommands(new TurnByCommand(Math.atan(2.5 / 5) * -1, driveAuto, 0));
    addCommands(new MoveByCommand(5 * 12, driveAuto, 0));
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    isFinished = false;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    isFinished = true;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_robotDrive.setFrontLeftSpeed(0);
    m_robotDrive.setFrontRightSpeed(0);
    m_robotDrive.setRearLeftSpeed(0);
    m_robotDrive.setRearRightSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return isFinished;
  }
}
