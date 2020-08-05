public class TestTax {
    public static void main(String[] args) {
        Tax t=new Tax();


        t.grossIncome=5000;


        t.dependants=2;
        t.state="NJ";

        double yourTax=t.calcTax();

        //printing the result
        System.out.println("your tax is : "+ yourTax);
    }
}
