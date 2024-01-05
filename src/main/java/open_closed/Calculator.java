package open_closed;

public class Calculator {
    public  int calculateNumber(int number1,int number2,Operation operation){
        return operation.performOperation(number1,number2);
    }
}
