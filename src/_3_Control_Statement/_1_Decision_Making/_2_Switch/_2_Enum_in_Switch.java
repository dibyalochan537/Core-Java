package _3_Control_Statement._1_Decision_Making._2_Switch;

public class _2_Enum_in_Switch {
    enum Day{Sun,Mon,Tue,Wed,Thu,Fri,Sat};

    public static void main(String[] args) {
        Day[] day=Day.values();
        for (Day i:day){
            switch (i){
                case Sun:{
                    System.out.println("SUnday");
                }
            }
        }
    }
}
