/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveAutoSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class SalomPath extends SequentialCommandGroup {
  /**
   * Creates a new SalomPath.
   */
  static int pidType = 0;
  public SalomPath(DriveAutoSubsystem driveAuto) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(new MoveByCommand(50, driveAuto, pidType), 
          new TurnByCommand(-60, driveAuto, pidType),
          new MoveByCommand(60, driveAuto, pidType),
          new TurnByCommand(60, driveAuto, pidType),
          new MoveByCommand(145, driveAuto, pidType),
          new TurnByCommand(70, driveAuto, pidType),
          new MoveByCommand(72, driveAuto, pidType),
          new TurnByCommand(-70, driveAuto, pidType),
          new MoveByCommand(65, driveAuto, pidType),
          new TurnByCommand(-90, driveAuto, pidType),
          new MoveByCommand(60, driveAuto, pidType),
          new TurnByCommand(-90, driveAuto, pidType),
          new MoveByCommand(65, driveAuto, pidType),
          new TurnByCommand(-70, driveAuto, pidType),
          new MoveByCommand(72, driveAuto, pidType),
          new TurnByCommand(70, driveAuto, pidType),
          new MoveByCommand(145, driveAuto, pidType),
          new TurnByCommand(60, driveAuto, pidType),
          new MoveByCommand(72, driveAuto, pidType),
          new TurnByCommand(-60, driveAuto, pidType),
          new MoveByCommand(50, driveAuto, pidType)
    );
  }
}
