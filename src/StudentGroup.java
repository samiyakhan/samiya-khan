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
		if(index<0 || index>=students.length)
		{
			throw new IllegalArgumentException("threw an IllegalArgumentException");
		}// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		if(student=null || index<0 || index>=students.length)
			throw new IllegalArgumentException("threw an IllegalArgumentException");
		else 
		{
			students[index]=student;
		}// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		if(student==null)
			throw new IllegalArgumentException("threw an IllegalArgumentException");
		else{
			Student[] abc=new Student[students.length+1];
			abc[0]=student;
			for(int i=1;i<students.length;i++)
				abc[i]=students[i-1];
			students=new Student[abc.length];
			for(int i=0;i<abc.length;i++)
				students[i]=abc[i];
		}
	// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		if(student== null)
			throw new IllegalArgumentException("threw an IllegalArgumentException");
		else{
			Student[] abc=new Student[students.length+1];
			for(int i=0;i<students.length;i++)
				abc[i]=student[abc.length];
			for(int i=0;i<abc.length;i++)
				students[i]=abc[i];
		}// Add your implementation here
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
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException("threw an IllegalArgumentException");
		else{
			Student[] abc=new Student[students.length-1];
			for(int i=0;i<index;i++)
				abc[i]=students[i];
			for(int i=index;i<students.length-1;i++)
				abc[i]=student[i+1];
			students=new Student[abc.length];
			for(int i=0;i<abc.length;i++)
				students[i]=abc[i];
		}// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		Student x; boolean flag=false;int j;
		if(Student == null)
			throw new IllegalArgumentException("threw as IllegalArgumentException");
		else{
			for(int i=0;i<students.length;i++)
			{
				if(students[i]==student)
				{
					flag=true;
					j=1;
					break;
				}
			}
			if(flag==true)
			{
				int index=j;
				Student[] abc=new Student[students.length-1];
				for?(int i=0;i<index;i++)
				abc[i]=students[i];
				for(int i=index;i<students.length-1;i++)
					abc[i]=students[i+1];
				students=new Student[abc.length];
				for(int i=0;i<abc.length;i++)
					students[i]=abc[i];
			}
			else{
				throw new IllegalArgumentException("student not exist");
			}
		}

					// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		if(index>0 || index>students.length)
			throw new IllegalArgumentException("threw an IllegalArgumentException");
		else{
			Student[] abc=Student[index+1];
			for(int i=0;i<=index;i++)
				abc[i]=students[i];
		Students=new Students[abc.length];
		for(int i=0;i<abc.length;i++)
			students[i]=abc[i];
		}
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
		Student[] abc= new Student[index];
		for(int i=0;i<index;i++)
		{
			abc[i]=students[i]; 
		}
		students=new Student[abc.length];
		for(int i=0;i<abc.length;i++)
			student[i]=abc[i];
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		int j;
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==student)
			{
				j=1;
				break;
			}
		}
		Student[] abc=new Student[j];
		for(int i=0;i<abc.length;i++)
			students[i]=abc[i];
	}// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		int c,d,n=students.length;
		student swap;
		for(c=0;c<(n-1);c++)
		{
			for(d=0;d<n-c-1;d++)
			{
				if(students[d]>students[d+1])
				{
					swap=students[d];
					students[d]=students[d+1];
					students[d+1]=swap;
				}
			}
		}// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		int count=0,x=-1;
		for(int i=0;i<students.length;i++)
			if(students[i].birthDate<=date)
				count++;
			Student[] abc=new Student[count];
			for(int i=0;i<students.length;i++)
			{
				if(students[i].birthDate<=date)
					abc[x+1]=students[i];
			}
			students=new Student[abc.length];
			for(int i=0;i<abc.length;i++)
			{
				students[i]=abc[i];
			}
	}
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
