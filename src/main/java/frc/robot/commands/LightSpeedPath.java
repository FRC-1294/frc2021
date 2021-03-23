/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.subsystems.DriveAutoSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class LightSpeedPath extends SequentialCommandGroup {
  /**
   * Creates a new LightSpeedPath.
   */
  public LightSpeedPath() {
    DriveAutoSubsystem driveAuto = Robot.m_robotContainer.m_driveAutoSubsystem;
    int pidType = 0;
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    addCommands(
      new MoveByCommand(31, driveAuto, pidType),
      new TurnByCommand(45, driveAuto, pidType),
      new MoveByCommand(30, driveAuto, pidType),
      new TurnByCommand(45, driveAuto, pidType),  
      new MoveByCommand(121, driveAuto, pidType),
      new TurnByCommand(-45, driveAuto, pidType),
      new MoveByCommand(50, driveAuto, pidType),
      new TurnByCommand(-45, driveAuto, pidType),
      new MoveByCommand(35.4, driveAuto, pidType),
      new TurnByCommand(90, driveAuto, pidType),
      new MoveByCommand(40, driveAuto, pidType),
      new TurnByCommand(45, driveAuto, pidType),
      new MoveByCommand(60, driveAuto, pidType),
      new TurnByCommand(90, driveAuto, pidType),
      new MoveByCommand(145, driveAuto, pidType),
      new TurnByCommand(90, driveAuto, pidType),
      new MoveByCommand(60, driveAuto, pidType),
      new TurnByCommand(-90, driveAuto, pidType),
      new MoveByCommand(80, driveAuto, pidType),
      new LightSpeedCheckLap()               
    );
  }
}
