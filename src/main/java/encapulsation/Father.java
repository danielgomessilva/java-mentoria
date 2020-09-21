package encapulsation;

public class Father {
    public String name = "Father";
    protected  String lastName;
    public int type = 1;
    private static int id = 0;
    protected int myId;

    static{
        System.out.println("Construindo atributos staticos");
    }

    public Father(String lastName){
        this.lastName = lastName;
        System.out.println("Construindo primeira classe");
        myId = ++id;
    }
    protected void ChangeFatherName(String name){
        this.name = name;
    }
    protected Father(Father father){
        this.name = father.name;
        this.lastName = father.lastName;
        this.type = father.type;
        this.myId = father.myId;
    }
}
