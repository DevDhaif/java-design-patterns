package builder;

//This is the interface that will be returned from the builder
public interface FacultyPlan {

	public void setName(String name);

	public void setSemesters(Integer semesters);

	public void setDepartments(Integer departments);

	public void setSemesterFees(Double semesterFees);

	public void setTotalFees(Double totalFees);

	public void setLocation(String location);
}
