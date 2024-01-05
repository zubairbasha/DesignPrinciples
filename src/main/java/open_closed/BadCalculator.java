package open_closed;

public class BadCalculator {
    public int  performOperation(int number1,int number2,String type){
        int result=0;
        switch (type){
            case "sum":
                result=number1+number2;
            case "sub":
                result=number1-number2;

        }
        return result;

    }
}
