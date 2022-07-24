package builder;

//Defines the methods needed for creating Info for the Faculty
public interface FacultyBuilder {
	public void buildFacultyName();

	public void buildFacultySemesters();

	public void buildFacultyDepartments();

	public void buildFacultySemesterFees();

	public void buildFacultyTotalFees();

	public void buildFacultyLocation();

	public Faculty getFaculty();
}
