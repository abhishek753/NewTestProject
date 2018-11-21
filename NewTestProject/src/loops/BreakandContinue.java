package loops;

public class BreakandContinue {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			
//			if(i==5)
//				break;
			if(i>=5 && i<=7)
				continue;
			System.out.println(i);
		}
		System.out.println("Outside the Loop");

	}

}
