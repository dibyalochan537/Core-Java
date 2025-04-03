package _6_Abstraction_In_Java._1_Abstract_Class;

abstract class PrivateDataMember{
    private int id;
    private String name;
    static int number;
    PrivateDataMember(int myId){
        this.id=myId;
        System.out.println("Id is : "+this.id);
    }
    PrivateDataMember(){
    }
    public String setName(String mySetName){
        this.name=mySetName;
        return mySetName;
    }
    public String getName(){
        return this.name;
    }
}
public class _3_Abstract_Class_Private_DataMember extends PrivateDataMember{
    _3_Abstract_Class_Private_DataMember(int mySuperId){
        super(mySuperId);
        String myName=super.setName("Raju");
        String myName2=super.getName();
        System.out.println(myName+"    "+myName2);
    }
    public static void main(String[] args) {
        _3_Abstract_Class_Private_DataMember obj=new _3_Abstract_Class_Private_DataMember(18);
        PrivateDataMember.number=98;
        B obj2=new B();
    }
}
class B extends PrivateDataMember{
    B(){
        super();
        System.out.println(PrivateDataMember.number);
    }
}
