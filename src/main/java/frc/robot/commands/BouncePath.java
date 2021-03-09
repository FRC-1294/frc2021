/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveAutoSubsystem;


public class BouncePath extends SequentialCommandGroup {
  /**
   * Creates a new BouncePath.
   */
  static int pidType = 0;

  public BouncePath(DriveAutoSubsystem driveAuto) {
    
    super(
      new TurnByCommand(-63, driveAuto, pidType), 
      new MoveByCommand(67, driveAuto, pidType), 
      new TurnByCommand(132, driveAuto, pidType), 
      new MoveByCommand(162, driveAuto, pidType), 
      new TurnByCommand(-64, driveAuto, pidType), 
      new MoveByCommand(153, driveAuto, pidType), 
      new TurnByCommand(152, driveAuto, pidType), 
      new MoveByCommand(157, driveAuto, pidType), 
      new TurnByCommand(-78, driveAuto, pidType), 
      new MoveByCommand(157, driveAuto, pidType), 
      new TurnByCommand(40, driveAuto, pidType), 
      new MoveByCommand(87, driveAuto, pidType)
    );
  }
}
