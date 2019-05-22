import java.io.*;
import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) 
    {   	
    	String str;
    	String command;
    	String parameter;
    	boolean flag = true;
//    	int[][] arrayGame = new int[5][5]; 
    	int row = 0;
    	int col = 0;
    	
    	Scanner scan = new Scanner (System.in);
    
	    do{   
	    	System.out.print("> ");
	    	str = scan.nextLine();
	    	str = str.toLowerCase();
	        String[] arrOfStr = str.split(" +");
	        
	        if(arrOfStr.length == 1) {
	        	command = arrOfStr[0];
	        	
	        	if(command.equals("inventory") || command.equals("i")){
		        	System.out.println("You are carrying:");
		        	System.out.println("brass lantern");
		        	System.out.println("rope");
		        	System.out.println("rations");
		        	System.out.println("staff");
		        	System.out.println("You are at location " + row + "," + col);
	        	}else if(command.equals("quit") || command.equals("q")) {
		        	flag = false;
		    	}else {
		        	System.out.println("Invalid command: " + command);
		        }
	        }else if(arrOfStr.length == 2) {
	        	command = arrOfStr[0];
		        parameter = arrOfStr[1];
		        
	        	if(command.equals("go") || command.equals("g")) {
		        	if(parameter.equals("east"))
		        	{
		        		if(++col < 5)
		        		{
		        			System.out.println("Moving east...");
		        			System.out.println("You are at location " + row + "," + col);
		        		}else {
		        			--col;
		        			System.out.println("You can't go that far east.");
		        		}
		        	}
		        	else if(parameter.equals("west"))
		        	{
			        	if(--col > -1)
		        		{
			        		System.out.println("Moving west...");
		        			System.out.println("You are at location " + row + "," + col);
		        		}else {
		        			++col;
		        			System.out.println("You can't go that far west.");
		        		}
			        }
		        	else if(parameter.equals("north"))
			        {
			        	if(--row > -1)
		        		{
			        		System.out.println("Moving north...");
		        			System.out.println("You are at location " + row + "," + col);
		        		}else {
		        			++row;
		        			System.out.println("You can't go that far north.");
		        		}
			        }
		        	else if(parameter.equals("south"))
			        {
		        		if(++row < 5)
		        		{
		        			System.out.println("Moving south...");
		        			System.out.println("You are at location " + row + "," + col);
		        		}else {
		        			--row;
		        			System.out.println("You can't go that far south.");
		        		}
			        }
		        	else if(parameter.equals("inside"))
			        {
			        	System.out.println("You can't go that way.");
			        }
		        	else 
			        {
			        	System.out.println("Invalid parameter: " + parameter);
			        }
		        }else {
		        	System.out.println("Invalid command: " + command);
		        }
	        }
	    }while(flag);
	    
	    System.out.println("Farewell");
	    System.out.println("You are at location " + row + "," + col);
	    
	    
        	
    }

}