public class Class_Object {
    public static void main(String[] args) {
        // Create an object of the class
        Pen p1 = new Pen(); // created a pen object named p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount MyAcc = new BankAccount();
        MyAcc.username = "Hiten Prajapati";
        MyAcc.setPassword("Teri maa ki Chut!");
        System.out.println(MyAcc.username);
        // System.out.println(MyAcc.password);
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen {
    // prop+function
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage (int phy,int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}