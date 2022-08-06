import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Annual Salary = ");
        double Input = input.nextFloat();

        double annualDeduct = 0;
        double deduction = 0;
        boolean calc = true;
        double[] Tex = {0.2, 0.25, 0.30, 0.32, 0.35};
        double[] Ted = {30000.00, 130000.00, 490000.00, 2410000.00}; 
        while(calc){

            if (Input <= 400000 && Input > 250000){
                annualDeduct = Input * Tex[0];

            } else if (Input <= 800000 && Input > 400000){
                deduction = Input - Ted[0];
                if (deduction > 400000){
                    annualDeduct = (deduction * Tex[1]) + Tex[0];
                } else {
                    annualDeduct = Ted[0];
                }

            } else if (Input <= 2000000 && Input > 800000){
                deduction = Input - Ted[1];
                if (deduction > 800000){
                    annualDeduct = (deduction * Tex[2]) + Tex[1];
                } else {
                    annualDeduct = Ted[1];
                }

            } else if (Input <= 8000000 && Input > 2000000){
                deduction = Input - Ted[1];
                if (deduction > 800000){
                    annualDeduct = (deduction * Tex[3]) + Tex[2];
                } else {
                    annualDeduct = Ted[2];
                }

            } else if (Input > 8000000){
                deduction = Input - Ted[1];
                if (deduction > 2000000){
                    annualDeduct = (deduction * Tex[4]) + Tex[3];
                } else {
                    annualDeduct = Ted[3];        
                }   
            }
            calc = false;
        }
        double Monthlyrate = Input/12;
        System.out.printf("Monthly Rate : %.2f \n", Monthlyrate);

        double Dailyrate = Monthlyrate/22;
        System.out.printf("Daily Rate : %.2f \n", Dailyrate);

        double Hourlyrate = Dailyrate/8;
        System.out.printf("Hourly Rate : %.2f \n", Hourlyrate);

        System.out.printf("Annual Tax Deduction : %.2f \n", annualDeduct); 

        double Monthlydeduct = annualDeduct/12;
        System.out.printf("Monthly Tax Deduction : %.2f \n", Monthlydeduct);

        double Netpay = Monthlyrate - Monthlydeduct;
        System.out.printf("Net Pay : %.2f \n", Netpay);

    }
}
