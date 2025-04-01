public class LamdaExpression_1 {
    public static void main(String[] args) {

       MathOperation sumOperation =  (a, b)-> a+b;  //functional Programming
      int res = sumOperation.operate(3, 3);
      System.out.println(res);
        
    }
}

class SumOperation implements MathOperation{

    @Override
    public int operate(int a, int b) {
        return a+b;
    }
       
}

@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);

}
