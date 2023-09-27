package employee;

public class EmMain {
    public static void main(String[] args){
        // create object 1 
        Employee e1 = new Employee();
        e1.setALL("Tony Stark", 1, 40, 1000000);
        e1.display();
        // test is not private
        e1.test = 10;
        System.out.println("Test: " + e1.test);
        
        System.out.println("--------------------");
        // get method
        System.out.println("Name: " + e1.getName());
        System.out.println("ID: " + e1.getID());
        System.out.println("Age: " + e1.getAge());
        System.out.println("Salary: " + e1.getSalary());

        
        System.out.println("--------------------");
        // object 3
        Employee e3 = new Employee("Peter Parker", 3, 20, 100000.0);
        e3.display();

        System.out.println("--------------------");
        Employee e4 = new Employee();
        e4.display();


        // display static 
        System.out.println("--------------------");
        System.out.println("Static Display");
        System.out.println("Min Salary: " + Employee.minSalary);
        System.out.println("Max Salary: " + Employee.maxSalary);
        Employee.job();



        // inheritance
        System.out.println("--------------------");
        Programmer p1 = new Programmer();
        p1.setALL("Thor", 3, 20, 100000.0);
        p1.setPosition("Senior Programmer");
        p1.displayPro();

        // super constructor
        System.out.println("--------------------");
        Programmer p2 = new Programmer("Loki", 4, 20, 100000.0, "Junior Programmer");
        p2.displayPro();

        // final and static
        System.out.println("--------------------");
    
            //System.out.println(Employee.minSalary=1000);
        System.out.println(Employee.maxSalary=10000);


        // method overloading and overriding
        System.out.println("--------------------");
        Programmer p3 = new Programmer("Captain America", 5, 20, 100000.0, "Junior Programmer");
        p3.display();
        p3.skill("Java", "Python", "C++", "C#");
        p3.bonus(); // overriding method
        System.out.println("--------------------");
        Account a1 = new Account();
        a1.setALL("Black Widow", 6, 20, 100000.0);
        a1.display();
        a1.bonus(); // overriding method

    }



}
