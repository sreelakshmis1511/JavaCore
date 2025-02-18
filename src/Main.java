//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int rollno = 1;
    static String school = "vemhs";




    public static void main(String[] args) {
        System.out.println("Hi");
        System.out.println(); //type sout
        details();
        Main obj = new Main();
        obj.display();
    }

    public void display(){ //non-static method
        System.out.println(rollno);
        System.out.println(school);
    }

    public static void details(){
        System.out.println(rollno);
        System.out.println(school);
    }
}