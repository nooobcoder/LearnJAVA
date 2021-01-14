package LambdaExpressions;

/* It is important to emphasize that a lambda expression can use and modify aninstance variable from its invoking class. It just can’t use a local variable of itsenclosing scope unless that variable is effectively final. */
interface CaptureFunc {
    int func(int n);
}

public class VariableCaptureLambdaExpressions {
    public static void main(String[] args) {
        // A local variable that can be captured
        int num = 10;
        int t = 2;

        CaptureFunc myLambda = (n) -> {
            // This use of num is okay, as it is not modifying 'num'
            int v = num + n;
            int copy = t;

            // The following is illegal, as it is getting modified thus wasting the capture
            // state
            // num++;

            return v;
        };

        // The following statement is also illegal because it would remove the
        // effectively final status from num.
        // num = 9;
        // t = 47; // This would cause error too
        // The point is that, whenever an outside variable is even used in a lambda, it
        // is captured and can no longer be modified at any point of time later
    }
}
