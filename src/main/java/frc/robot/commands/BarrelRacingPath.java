/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.MoveByCommand;
import frc.robot.commands.TurnByCommand;
import frc.robot.subsystems.DriveAutoSubsystem;

public class BarrelRacingPath extends SequentialCommandGroup {
  DriveAutoSubsystem m_driveAuto;

   public BarrelRacingPath(DriveAutoSubsystem driveAuto) {
    this.m_driveAuto = driveAuto;

    // Angle units = degrees
    // Length units = inches
    // amount (degrees or inches, driveAuto, pidType(0))
    addCommands(new MoveByCommand(60,driveAuto,0));
    addCommands(new TurnByCommand(-90,driveAuto,0));
    addCommands(new MoveByCommand(75,driveAuto,0));
    addCommands(new TurnByCommand(90,driveAuto,0));
    addCommands(new MoveByCommand(160,driveAuto,0));
    addCommands(new TurnByCommand(90,driveAuto,0));
    addCommands(new MoveByCommand(70,driveAuto,0));
    addCommands(new TurnByCommand(-90,driveAuto,0));
    addCommands(new MoveByCommand(75,driveAuto,0));
    addCommands(new TurnByCommand(-90,driveAuto,0));
    addCommands(new MoveByCommand(75,driveAuto,0));
    addCommands(new TurnByCommand(-90,driveAuto,0));
    addCommands(new MoveByCommand(75,driveAuto,0));
    addCommands(new TurnByCommand(-90,driveAuto,0));
    addCommands(new MoveByCommand(65,driveAuto,0));
    addCommands(new TurnByCommand(-90,driveAuto,0));
    addCommands(new MoveByCommand(175,driveAuto,0));
    addCommands(new TurnByCommand(90,driveAuto,0));
    addCommands(new MoveByCommand(60,driveAuto,0));
    addCommands(new TurnByCommand(-90,driveAuto,0));
    addCommands(new MoveByCommand(50,driveAuto,0));

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    
  
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
