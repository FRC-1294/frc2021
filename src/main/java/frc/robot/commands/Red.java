package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveAutoSubsystem;
import frc.robot.commands.MoveByCommand;
import frc.robot.commands.TurnByCommand;

public class Red extends SequentialCommandGroup {
  DriveAutoSubsystem m_driveAuto;

  public Red(DriveAutoSubsystem driveAuto){
    this.m_driveAuto = driveAuto;

    // amount (degrees or inches), driveAuto, pidType (0)
    addCommands(new MoveByCommand(5 * 12, driveAuto, 0));
    addCommands(new TurnByCommand(45, driveAuto, 0));
    addCommands(new MoveByCommand(Math.sqrt(2) * 5 * 12, driveAuto, 0));
    addCommands(new TurnByCommand(45 * -1, driveAuto, 0));
    addCommands(new MoveByCommand(Math.sqrt(2) * 5 * 12, driveAuto, 0));
    addCommands(new TurnByCommand(45 * -1, driveAuto, 0));
    addCommands(new MoveByCommand(3.5 * 12, driveAuto, 0));
    addCommands(new TurnByCommand(90, driveAuto, 0));
    addCommands(new MoveByCommand(10 * 12, driveAuto, 0));

    SmartDashboard.putData(new Red(driveAuto));
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