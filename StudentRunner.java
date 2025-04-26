public class StudentRunner
{ 
  public static void main(String args[]) 
  { 
    // Create students with all attributes defined
    Student s1 = new Student("Alice", 101, "Freshman");
    Student s2 = new Student("Bob", 102, "Sophomore");
    Student s3 = new Student("Charlie", 101, "Junior");  // Same ID as s1
    
    // Test toString method
    System.out.println("Testing toString:");
    System.out.println(s1);
    System.out.println(s2);
    
    // Test equals method
    System.out.println("\nTesting equals method:");
    System.out.println("s1 equals s2: " + s1.equals(s2));  // Should be false (different IDs)
    System.out.println("s1 equals s3: " + s1.equals(s3));  // Should be true (same IDs)
    System.out.println("s2 equals s3: " + s2.equals(s3));  // Should be false (different IDs)
  }
}
