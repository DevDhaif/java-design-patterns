package derek.builder;

public class NewRobotBuilder implements RobotBuilder {
	private Robot robot;

	public NewRobotBuilder() {

		this.robot = new Robot();

	}

	public void buildRobotHead() {

		robot.setRobotHead("New Tin Head");

	}

	public void buildRobotTorso() {

		robot.setRobotTorso("New Tin Torso");

	}

	public void buildRobotArms() {

		robot.setRobotArms("New Blowtorch Arms");

	}

	public void buildRobotLegs() {

		robot.setRobotLegs("New Rollar Skates");

	}

	public Robot getRobot() {

		return this.robot;
	}
	
}
