package builder;

//The concrete builder class that assembles the info of the 
//finished CsIt Faculty object

public class CsItBuilder implements FacultyBuilder {

	private Faculty faculty;

	public CsItBuilder() {
		this.faculty = new Faculty();
	}

	public void buildFacultyName() {
		faculty.setName("Computer Science & Information Technology");
	}

	public void buildFacultySemesters() {
		faculty.setSemesters(10);
	}

	public void buildFacultyDepartments() {
		faculty.setDepartments(6);
	}

	public void buildFacultySemesterFees() {
		faculty.setSemesterFees(8000.0);
	}

	public void buildFacultyTotalFees() {
		faculty.setTotalFees(80000.0);
	}

	public void buildFacultyLocation() {
		faculty.setLocation("Khartoum- Sudan- ali abdul latif St");
	}

	public Faculty getFaculty() {

		return this.faculty;
	}

}
