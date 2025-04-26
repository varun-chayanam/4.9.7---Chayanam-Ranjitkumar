public class Student 
{ 
  private String name;
  private int id;
  private String year;  // e.g., "Freshman", "Sophomore", etc.
  
  // Constructor requiring all three attributes
  Student(String name, int id, String year) 
  { 
    this.name = name;
    this.id = id;
    this.year = year;
  }
  
  // Override toString method
  @Override
  public String toString()
  {
    return "Student[name=" + name + ", id=" + id + ", year=" + year + "]";
  }
  
  // Override equals method - equality based on id
  @Override
  public boolean equals(Object obj)
  {
    // Check if the object is comparing to itself
    if (this == obj) {
        return true;
    }
    
    // Check if object is null or different class
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    
    // Cast obj to Student and compare ids
    Student other = (Student) obj;
    return this.id == other.id;
  }
}
