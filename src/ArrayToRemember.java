import java.util.Scanner;

public class ArrayToRemember {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] data = new String[200];
		int counter = 0;
		boolean complete = false;

		System.out.println("Please enter information: ");
		String line = sc.next();
		if (line.toLowerCase().equals("history")) {
			for (int i = counter-1; i >= 0; i--) {
				System.out.println(data[i]);
			}
		} else {
			data[counter] = line;
			counter++;
		}
		line=sc.next();
		
		do{
			if (line.toLowerCase().equals("history")) {
				for (int i = counter-1; i >= 0; i--) {
					System.out.println(data[i]);
				}
			} else {
				data[counter] = line;
				counter++;
			}
			line=sc.next();
			
			if (counter  % 10 == 0 && counter > 0) {
				System.out.println("Are you finished?(y/n)");
				String yn = sc.next();
				if (yn.toLowerCase().equals("y")) {
					complete = true;
				}
				
			}
		

		}while (complete == false) ;
		for (int i = counter-1; i >= 0; i--) {
			System.out.println(data[i]);
		}

		sc.close();
	}

}
