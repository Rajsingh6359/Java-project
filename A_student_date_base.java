import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// declartion of arrays and other variables
		int[] rollno;
		String writed = "Write", readd = "Read";
		Scanner scanner = new Scanner(System.in);
 	   int maxstud = 100;
		int maxsub = 6 ;
	    int[][] marks ;
 	   marks = new int[maxstud][maxsub];
  	  String[] subject = {"English","Science","Math","Social-Science","Hindi","Gujarat"};
	    String[]  studentname;
		studentname = new String[maxstud] ;
	    int[] studentstroll = new int[maxstud]; 
		   
		
	
		System.out.println(" This is Student Data Baise\n");
		
		    for (int l =0; l<10;l++){
		 	 System.out.println(" If you want write data" + 
		 	                   "  Type  '' 1 '' or want to read date Type  '' 2''  ");
		 	 
		 	 Scanner wants = new Scanner(System.in);
              int want = wants.nextInt();
	 
		     if(want == 1){
		        System.out.println("Enter your roll number");
	            int roll = scanner.nextInt();
	            scanner.nextLine();
	            System.out.println("Enter your name ");
		        studentname[roll] = scanner.nextLine();
		        System.out.println();
		             
		      // this is a loop for subjet input	  	
   	
   			for(int sub = 0; sub < maxsub ; sub++){
		   	    	System.out.println("Enter your "+ subject[sub] + " Subject marks");
		               marks[roll][sub] = scanner.nextInt();
		   		} 
		      }
		 	  
		  else{
		 	  	System.out.println("Enter Student roll number");
		 	  	int roll = scanner.nextInt();
	               scanner.nextLine();
	               System.out.println(" Student name is "+ studentname[roll]);
	              
	              
		 	    for(int sub = 0; sub < maxsub ; sub++){
		   	    	System.out.print(" Your marks in "+ subject[sub] + " Subject ");
		               System.out.println(marks[roll][sub] );
		   			} 
		 	      }
		 	  }
		 }
   }