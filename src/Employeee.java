public class Employeee {
    // constructor same name as class not return type
    // it creates/initialise objects in ram
    //you can use contructor block to initialiaze some default values

    int Employeeid;
    String dept;

    public Employeee(int id, String dep) {
        Employeeid = id;
        dept = dep;
    }

    public static void main(String[] args) {
        Employeee ahad = new Employeee(34,"CSE");
        Employeee harsha = new Employeee(35,"Python");
        System.out.println(ahad.dept);
        System.out.println(harsha.dept);
    }
}