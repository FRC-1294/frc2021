/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveAutoSubsystem;
import frc.robot.commands.MoveByCommand;
import frc.robot.commands.TurnByCommand;

//ANGLE UNITS = DEGREES
//LENGTH UNITS = INCHES

public class Red extends SequentialCommandGroup {
  DriveAutoSubsystem m_driveAuto;
  boolean isFinished;

  public Red(DriveAutoSubsystem driveAuto){
    this.m_driveAuto = driveAuto;

    // amount (degrees or inches), driveAuto, pidType (0)
    addCommands(new TurnByCommand(45, driveAuto, 0));
    addCommands(new MoveByCommand(5 * Math.sqrt(2) * 12, driveAuto, 0));
    addCommands(new TurnByCommand((int) (Math.atan(5/2.5) - 45) * -1, driveAuto, 0));
    addCommands(new MoveByCommand(Math.sqrt(31.25) * 12, driveAuto, 0));
    addCommands(new TurnByCommand((int) (Math.atan(2.5/7.5) + (int) Math.atan(7.5/2.5)) * -1, driveAuto, 0));
    addCommands(new MoveByCommand(Math.sqrt(62.5) * 12, driveAuto, 0));
    addCommands(new TurnByCommand(90 + (int) Math.atan(2.5/7.5), driveAuto, 0));
    addCommands(new MoveByCommand(12.5 * 12, driveAuto, 0));
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
    m_driveAuto.setFrontLeftSpeed(0);
    m_driveAuto.setFrontRightSpeed(0);
    m_driveAuto.setRearLeftSpeed(0);
    m_driveAuto.setRearRightSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return isFinished;
  }
}
