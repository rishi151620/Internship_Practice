import java.util.Scanner;
class LastOccurence {
  static void lastOccurence(String str1){
  int i, flag = 0;
  char ch;
  System.out.print("\nEnter the Character to Find =  ");
    Scanner sc=new Scanner(System.in);
	  ch = sc.next().charAt(0);
   for(i=str1.length()-1;i>=0;i--)
		{
			if(str1.charAt(i) ==  ch) {
        flag++;
        break;
        
		  }
		}
		if(flag == 0) {
			System.out.println("\nSorry! We haven't found the Character ");
		}
		else{
			System.out.println("the last occurrence of char "+str1.charAt(i)+" is at position"+" "+i);
		}
  }


	public static void main(String[] args) {
		String str;
		
		
		
		Scanner sc= new Scanner(System.in);

		System.out.print("\nEnter String to Find First Char Occur =  ");
		str = sc.nextLine();
    lastOccurence(str);
		
		
		
		
	}

}