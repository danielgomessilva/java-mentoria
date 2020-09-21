import encapulsation.Child;
import encapulsation.Father;

public class Program {
    public static void main(String [] args){
        System.out.println("Iniciando");
        Child obj2 = new Child("Daniel");
        obj2.PrintFatherAttributes(); //Daniel

        Child obj = new Child("Father");
        obj.PrintFatherAttributes(); //Father

        Child obj3 = obj;
        obj3.name ="Object3";

        obj3.PrintFatherAttributes(); //Object3
        obj.PrintFatherAttributes(); //Father

        Child obj4 = obj.GetClone();
        obj4.name ="Object4";

        obj4.PrintFatherAttributes(); //Object3
        obj.PrintFatherAttributes(); //Father

        Integer valor = 1;
        Integer valor2 = valor;
        valor2 = 2;

        System.out.println("Valor: "+ valor);
        System.out.println("Valor: "+ valor2);


        System.out.println("Termino");
    }
}
