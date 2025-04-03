package _5_Polymorphism._3_Covariant_Return_Type;

public class _4_Covariant_return_type{
    Number myMethod() {
        return 78;
    }
}
class covariantType extends _4_Covariant_return_type{
    @Override
    Double myMethod() {   // ✅ Valid because Double extends Number
        return 6.9;
    }
}
