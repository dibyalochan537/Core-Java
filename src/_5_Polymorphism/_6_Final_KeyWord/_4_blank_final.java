package _5_Polymorphism._6_Final_KeyWord;

public class _4_blank_final {
    final static int x;
    final int y;
    _4_blank_final(){
        y=98;
    }
    _4_blank_final(String x){
        y=87;
    }
    static{
        x=87;
    }
    public static void main(String[] args) {
        _4_blank_final obj=new _4_blank_final();
        _4_blank_final obj2=new _4_blank_final("fdhdsdf");
    }
}
