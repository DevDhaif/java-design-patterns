package builder;

//The director class creates a Faculty using the builder interface 
//that is defined (EngineeringBuilder/CsItBuilder)

public class FacultyDirector {
	private FacultyBuilder facultyBuilder;

	// EngineeringBuilder Information is sent to the Director

	public FacultyDirector(FacultyBuilder facultyBuilder) {
		this.facultyBuilder = facultyBuilder;
	}

	// Return the Faculty made from the (EngineeringBuilder/CsItBuilder) info

	public Faculty getFaculty() {
		return this.facultyBuilder.getFaculty();
	}

	// Execute the methods specific to the FacultyBuilder that implements
	// FacultyBuilder (EngineeringBuilder/CsItBuilder)
	public void makeFaculty() {
		this.facultyBuilder.buildFacultyName();
		this.facultyBuilder.buildFacultySemesters();
		this.facultyBuilder.buildFacultyDepartments();
		this.facultyBuilder.buildFacultySemesterFees();
		this.facultyBuilder.buildFacultyTotalFees();
		this.facultyBuilder.buildFacultyLocation();
	}
}
