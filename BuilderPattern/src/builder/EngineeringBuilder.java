package builder;

//The concrete builder class that assembles the info of the 
//finished Engineering Faculty object

public class EngineeringBuilder implements FacultyBuilder {

	private Faculty faculty;

	public EngineeringBuilder() {
		this.faculty = new Faculty();
	}

	public void buildFacultyName() {
		faculty.setName("Engineering");
	}

	public void buildFacultySemesters() {
		faculty.setSemesters(10);
	}

	public void buildFacultyDepartments() {
		faculty.setDepartments(4);
	}

	public void buildFacultySemesterFees() {
		faculty.setSemesterFees(35000.0);
	}

	public void buildFacultyTotalFees() {
		faculty.setTotalFees(350000.0);
	}

	public void buildFacultyLocation() {
		faculty.setLocation("Khartoum- Sudan- El Gamhuriya Ave");
	}

	public Faculty getFaculty() {

		return this.faculty;
	}

}
