public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.newFormula()
                .addOperand(5)
                .addOperand(15)
                .calculate(Calculator.Operation.MULT)
                .result()
        );

        Ints intsCalc = new IntsCalculator(calculator);
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));
    }
}
