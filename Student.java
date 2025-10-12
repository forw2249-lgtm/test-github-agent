public class Student {
    // Attributes (fields) of the Student class
    private String name;
    private int id;
    private double grade;
    
    // Constructor to initialize the student object
    public Student(String name, int id, double grade) {
        this.name = name;
        thistermID = termId;
        this.grade = grade;
    }

    // Getters and setters for each attribute
    
    // Name getter
    public String getName() {
        return name;
    }

    // Set the student's name with validation if needed (not implemented here)
    public void setName(String name) {
        this.name = name;
    }
    
    // ID getter and setter, assuming IDs are positive integers only for simplicity in a real scenario you might want to add more sophisticated checks or use an immutable type like Long instead of int if the student can have multiple terms with different ids
    public int getId() {
        return id;
    }
    
    // Set the student's ID with validation (not implemented here)
    public void setId(int id) {
        this.id = id;
    }
    
    // Grade getter and setter, assuming grade is between 0 and 100 for simplicity in a real scenario you might want to add more sophisticated checks or validation rules (e.g., check if the input value falls within an acceptable range)
    public double getGrade() {
        return grade;
    }
    
    // Set the student's grade with possible constraints/validation for simplicity, not implemented here
    public void setGrade(double grade) {
        this.grade = grade;
    }
}