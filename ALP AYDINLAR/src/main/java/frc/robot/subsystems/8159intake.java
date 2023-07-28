public class 8159intake {
    import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class 8159Intake extends SubsystemBase {
    private final SpeedController intakeMotor;

    public 8159Intake(SpeedController intakeMotor) {
        this.intakeMotor = intakeMotor;
    }

    public void runIntake(double speed) {
        intakeMotor.set(speed);
    }

    public void stopIntake() {
        intakeMotor.stopMotor();
    }
}

}
