package open_closed;

public class Main {
    public static void main(String[] args) {
        Operation additionOperation=new AdditionOperation();
        Operation substractOperation=new SubstractOperation();
        Calculator calculator=new Calculator();
        System.out.println( calculator.calculateNumber(10,5,additionOperation));
        System.out.println(calculator.calculateNumber(10,5,substractOperation));
    }
}
