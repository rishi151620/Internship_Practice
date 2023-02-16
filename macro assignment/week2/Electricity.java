// 15. WAP to input electricity unit charges and calculate total     electricity bill according to the given condition:
//     For first 50 units Rs. 0.50/unit
//     For next 100 units Rs. 0.75/unit
//     For next 100 units Rs. 1.20/unit
//      For unit above 250 Rs. 1.50/unit
//      An additional surcharge of 20% is added to the bill
import java.util.*; 
class Electricity{ 
        public static void main(String args[]) {   
	      double units;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of units");
	      units=sc.nextLong();
        double pay=0,totalpay;
        if(units<=50)
           pay=units*0.5;
        else if(units>50 && units<=100)
		       pay=50*0.50+(units-50)*0.75;
        else if(units>100&&units<=250)
		       pay=50*0.50+100*0.75+(units-150)*1.20;
        else if(units>250)
		       pay=50*0.50+100*0.75+100*1.20+(units-250)*1.50;
        totalpay=pay+pay*0.20;
        System.out.println("total Bill to pay :"+totalpay); 
   } 
}