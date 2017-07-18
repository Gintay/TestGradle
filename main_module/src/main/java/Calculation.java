/**
 * Created by yuriy.vasyliv on 18.07.2017.
 */

import com.testpack.MathApplication;

public class Calculation {

    MathApplication math;

    public Calculation() {
        math = new MathApplication();
    }

    public Double Add(Double var1, Double var2)
    {
        return math.Add(var1, var2);
    }

    public Double Substract(Double var1, Double var2)
    {
        return math.Substract(var1, var2);
    }

    public Double Multiply(Double var1, Double var2)
    {
        return math.Multiply(var1, var2);
    }

    public Double Divide(Double var1, Double var2)
    {
        return math.Divide(var1, var2);
    }

}
