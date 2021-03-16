/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.commands.MoveByCommand;
import frc.robot.commands.TurnByCommand;
import frc.robot.subsystems.DriveAutoSubsystem;
// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class BarrelRacingPathCommand extends SequentialCommandGroup 
{

  DriveAutoSubsystem m_driveAuto;
  /**
   * Creates a new BarrelRacingPathCommand.
   */
  public BarrelRacingPathCommand(DriveAutoSubsystem driveAuto) {

    this.m_driveAuto = driveAuto;

    // Angle units = degrees
    // Length units = inches
    // amount (degrees or inches, driveAuto, pidType(0))
    addCommands(new MoveByCommand(60,driveAuto,0));
    addCommands(new TurnByCommand(-90,driveAuto,0));
    addCommands(new MoveByCommand(75,driveAuto,0));
    addCommands(new TurnByCommand(90,driveAuto,0));
    addCommands(new MoveByCommand(170,driveAuto,0));
    addCommands(new TurnByCommand(90,driveAuto,0));
    addCommands(new MoveByCommand(80,driveAuto,0));
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
  
   
  }


  
}
