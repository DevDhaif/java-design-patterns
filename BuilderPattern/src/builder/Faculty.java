package builder;

//The concrete Faculty class based on the FacultyPlan interface
public class Faculty implements FacultyPlan {

	private String facultyName;
	private Integer facultySemesters;
	private Integer facultyDepartments;
	private Double facultySemesterFees;
	private Double facultyTotalFees;
	private String facultyLocation;

	public void setName(String name) {
		facultyName = name;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setSemesters(Integer semesters) {
		facultySemesters = semesters;
	}

	public Integer getFacultySemesters() {
		return facultySemesters;
	}

	public void setDepartments(Integer departments) {
		facultyDepartments = departments;
	}

	public Integer getFacultyDepartments() {
		return facultyDepartments;
	}

	public void setSemesterFees(Double semesterFees) {
		facultySemesterFees = semesterFees;
	}

	public Double getFacultySemesterFees() {
		return facultySemesterFees;
	}

	public void setTotalFees(Double totalFees) {
		facultyTotalFees = totalFees;
	}

	public Double getFacultyTotalFees() {
		return facultyTotalFees;
	}

	public void setLocation(String location) {
		facultyLocation = location;
	}

	public String getFacultyLocation() {
		return facultyLocation;
	}

	public void getFacultyData() {
		System.out.println("Faculty of 😋 : " + facultyName + "\n" + "Semesters : " + facultySemesters + "\n" + "Departments : "
				+ facultyDepartments + "\n" + "Semester Fees : " + facultySemesterFees + "\n" + "Total Fees : "
				+ facultyTotalFees + "\n" + "Location : " + facultyLocation + "\n");
	}
}
