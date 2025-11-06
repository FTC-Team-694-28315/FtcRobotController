package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.linearOpMode;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.TankDrive;

@Autonomous(name = "auto", group = "Teamcode")
public class auto extends LinearOpMode {

    public void runOpMode(){
        Pose2d beginPose = new Pose2d(0, 0, 0);

        TankDrive drive = new TankDrive(hardwareMap, beginPose);

        waitForStart();

            if (linearOpMode.isStopRequested()) return;

            Actions.runBlocking(
                    drive.actionBuilder(beginPose)
                            .lineToX(30)
                            .turn(Math.toRadians(90))
                            .lineToY(30)
                            .turn(Math.toRadians(90))
                            .lineToX(0)
                            .turn(Math.toRadians(90))
                            .lineToY(0)
                            .turn(Math.toRadians(90))
                            .build());
    }
}
