package _10_String._1_Java_String;

public class _1_String_Declaration {
    public static void main(String[] args) {
        String first="fdfsdfsdfgsf";
        char[] characterArray=new char[5];
        for(int i=0;i<characterArray.length;i++){
            characterArray[i]=(char)i;
        }
        String second=new String(characterArray);
        System.out.println(first);
        System.out.println(second);
    }
}
