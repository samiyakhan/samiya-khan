import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		this.students = new Student[length];
		if(students == null)
		{
			throw new IllegalArgumentException("students is null");
		}
		else
			return null;
	}

	@Override
	public void setStudents(Student[] students) {
		if(index <0 || index >= students.length)
		{
			throw new  IllegalArgumentException("bad index");
		}// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		if ( students == null || index <0 || index>= students.length)
			throw new IllegalArgumentException("throw an IllegalArgumentException");
		else{
			Student[] abc=new Students[students.length+1];
			for(int i=0;i<index;i++)
				abc[i]=students[i];
			abc [index]=student;
			for(int i=index+1;i<students.length+1;i++)
				abc[i]=students[i-1];
			students=new Student[abc.length];
			for(int i=0;i<abc.length;i++)
				students[i]=abc[i];
		}   // Add your implementation here
	}
	

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		if(student = null)
			throw new IllegalArgumentException("threw an IllegalArgumentException");
		else{
			Student[] abc= new Student[students.length+1];
			int j;
			for(int i=0;i<students.length;i++)
			{
				if(students[i]==student)
				{
					j=1;
					break;
				}
				Student[] abc=new Student[j+1];
				for(int i=0;i<=j;i++)
					students[i]=abc[i];
			}
			// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
