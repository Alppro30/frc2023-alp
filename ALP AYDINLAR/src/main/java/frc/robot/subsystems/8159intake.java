// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.Subsystembase; 

public class IntakeSubsystem extends SubsystemBase {

private final TalconX intakerightMotor = new TalconX(3);
private final TalconX intakeleftMotor = new TalconX(4);

       public IntakeSubsystem() {
      } 
  public void setPosition(boolean open ) {
      if (open) {
    intakeleftMotor.set(1);
    intakerightMotor.set(1);
  } else {
    intakerightMotor.set(-1);
    intakeleftMotor.set(-1);
  }
  
  }
}

// CODED BY ALP WITH ♡
