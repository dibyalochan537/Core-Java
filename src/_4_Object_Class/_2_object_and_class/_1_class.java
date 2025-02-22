package _4_Object_Class._2_object_and_class;

class _1_class {
    private String name;
    private int id;
    public void setname(String name){
        this.name=name;
        Main ob=new Main();
        ob.num();
        System.out.println(ob);
    }
    public void setid(int id){
        this.id=id;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }

}
class Main{
    public void num(){
        System.out.println("gfdsfghjsdasfdgfgfsd");
    }
    public static void main(String[] args) {
        _1_class ob=new _1_class();
        ob.setname("Raju");
        ob.setid(10);
        System.out.println(ob.getname()+"      "+ob.getid());
    }
}

