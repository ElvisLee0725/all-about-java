import com.elvislee.exceptions.FooRuntimeException;

public class MyFileUtils {
    public int subtractTenFromInput(int number) throws FooRuntimeException {
        if(number < 10) {
            throw new FooRuntimeException("The input number must be greater than 10");
        }
        return number - 10;
    }
}
