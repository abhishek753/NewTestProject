package exceptionHandling;

public class Finally_Block {

	public static void main(String[] args) {
		
		try {
		// DB Connection - Successfully
		// Executing some queries.
		// Validating the data and comparing from web site.
		// Closing connection.
			
			int i[] = new int[4];
			
			i[5] = 100;
			System.out.println("Close DB Connection in try block");

		}
		catch(Exception e) {
			System.out.println("Error occurred");
		}finally {
			System.out.println("Clossing the DB Connection in finally block");
		}
	}

}
