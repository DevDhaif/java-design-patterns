package builder;

public class BuilderDemo {

	public static void main(String[] args) {

		// Get a FacultyBuilder of type EngineeringBuilder
		FacultyBuilder engineeringBuilder = new EngineeringBuilder();
		// Get a FacultyBuilder of type CsItBuilder
		FacultyBuilder csItBuilder = new CsItBuilder();

		// Pass the EngineeringBuilder specification to the director
		FacultyDirector engineeringMaker = new FacultyDirector(engineeringBuilder);
		// Pass the CsItBuilder specification to the director
		FacultyDirector csItMaker = new FacultyDirector(csItBuilder);

		// Tell the director to make the Faculty using the info of the
		// EngineeringBuilder class
		engineeringMaker.makeFaculty();
		// Tell the director to make the Faculty using the info of the
		// CsItBuilder class
		csItMaker.makeFaculty();

		// The director returns the right faculty based on the info sent to it on line
		// 13
		Faculty engineeringFaculty = engineeringMaker.getFaculty();
		// The director returns the right Faculty based on the info sent to it on line
		// 15
		Faculty csItFaculty = csItMaker.getFaculty();

		// Print out all the data for the created objects:
		engineeringFaculty.getFacultyData();
		csItFaculty.getFacultyData();

	}

}
