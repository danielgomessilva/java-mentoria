package encapulsation;

public class Child extends Father{
    private static Child instance;

    public Child(String lastName) {
        super(lastName);

        System.out.println("Construindo classe");

    }
//    public Child() {
//        this("Father");
//        System.out.println("Chama construtor 2");
//
//    }
//    public static Child GetInstance(){
//        if(instance == null)
//            instance = new Child("Father");
//
//        return instance;
//    }
    private Child(Child child){
        super(child);
    }
    public Child GetClone(){
        return new Child(this);
    }
    public void PrintFatherAttributes(){

        System.out.println("type: "+ super.type);
        System.out.println("lastName: "+ super.lastName);
        System.out.println("name: "+ super.name);
        System.out.println("id: "+ super.myId);
    }

}
