import java.util.Scanner;

public class SearchName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name[] = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad", "Paul, Brad"};
		String phone[] = {"555-2234", "555-9098", "555-1785", "555-9224", "555-9225"};
		
		boolean flag = false;
		int index = 0;
		
		System.out.println("Please Enter a keyword you want to search: ");
		String search = input.nextLine();
		System.out.println("\n****************** RESULTS *******************************\n");
		for (int i = 0; i < name.length; i++) {
		    if (name[i].toLowerCase().contains(search)) {
		        flag = true;
		        index = i;
		        System.out.println(name[index] + ": \t" + phone[index]);
		    }
		}
		if (!flag) {
			System.out.println("Oopsss! No Matching Name.");
		}
	}
}
