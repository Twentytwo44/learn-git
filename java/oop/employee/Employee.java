package employee;
class Employee {
    // Atribute of the class
    private String name;
    private int ID;
    private int age;
    private double salary;
    int test;


    // static
        // static attribute and final 
    static final  int minSalary = 10000;
    static int maxSalary = 1000000;
        // static method
    static void job(){
        System.out.println("Web development & Cloud development");}

    // method of the class
    public void setALL(String name, int ID, int age, double salary){
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.salary = salary;

    }
    // display method
    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.ID);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
    }
    // getter method 
    public String getName(){
       return this.name;
    }
    public int getID(){
       return this.ID;
    }
    public int getAge(){
       return this.age;
    }
    public double getSalary(){
       return this.salary;
    }

    // default constructor
    public Employee(String name){
        this.name = name;
    }
    
    // constructor 
    public Employee(){
        System.out.println("I am employee.");
        }    


    public Employee(String name, int ID, int age, double salary){
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.salary = salary;
    }

    public void bonus (){
        System.out.println("Bonus: " + this.salary*0.5);
    }


   
  


}
