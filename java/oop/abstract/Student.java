abstract class Student {
    private String name;
    private int age;
    private int id;

    abstract void study();
    abstract void takeExam();
    abstract void register();


    public void setALL(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
