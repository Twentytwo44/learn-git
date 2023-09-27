package employee;
class Programmer extends Employee{
    private String position;
   

    // constructor
    public Programmer(){
        System.out.println("I am programmer.");
    }
    // method
    public void setPosition(String position){
        this.position = position;
    }

    public void displayPro(){
        System.out.println("Name: " + this.getName());
        System.out.println("ID: " + this.getID());
        System.out.println("Age: " + this.getAge());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Position: " + this.position);
    }
    
    // super constructor
    public Programmer(String name, int ID, int age, double salary, String position){
        super(name, ID, age, salary);
        this.position = position;
    }
    // method overloading 
    public void skill(){
        System.out.println("No skill");
    }   
    public void skill(String...skill){
        System.out.print("Skill: ");
         for(int i=0; i<skill.length; i++){
             System.out.print(skill[i] + " ");
         }
         System.out.print('\n');
    } 


    //overriding method 
    public void bonus (){
        System.out.println("Bonus: " + this.getSalary()*1.5);
    }


}