package derek.builder;

public class TestRobotBuilder {

	public static void main(String[] args) {

		// Get a RobotBuilder of type OldRobotBuilder

		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		RobotBuilder newStyleRobot = new NewRobotBuilder();

		// Pass the OldRobotBuilder specification to the engineer

		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		RobotEngineer robotEngineer2 = new RobotEngineer(newStyleRobot);

		// Tell the engineer to make the Robot using the specifications
		// of the OldRobotBuilder class

		robotEngineer.makeRobot();
		robotEngineer2.makeRobot();
		// The engineer returns the right robot based off of the spec
		// sent to it on line 11

		Robot firstRobot = robotEngineer.getRobot();
		Robot secondRobot = robotEngineer2.getRobot();
		System.out.println("Robot Built");

		firstRobot.getRobotData();
		secondRobot.getRobotData();
//		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
//
//		System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
//
//		System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
//
//		System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());
//
//		System.out.println("Robot Built");
//
//		System.out.println("Robot Head Type: " + secondRobot.getRobotHead());
//
//		System.out.println("Robot Torso Type: " + secondRobot.getRobotTorso());
//
//		System.out.println("Robot Arm Type: " + secondRobot.getRobotArms());
//
//		System.out.println("Robot Leg Type: " +secondRobot.getRobotLegs());

	}

}