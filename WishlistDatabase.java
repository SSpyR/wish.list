package wish.list;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WishlistDatabase extends WishlistMain {
	public static String file_name;//public variable for the name of the user's file

	public WishlistDatabase() {
		super();
	}

	public void Database() throws FileNotFoundException {
		//TODO Account for and catch already existing file names

		String itemName, itemName1, itemName2, itemName3;
		double itemCost, itemCost1, itemCost2, itemCost3;
		String confirm, confirm1, confirm2, confirm3;
		String fileName;

		Scanner reader = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		System.out.println("Hello! Welcome to the Wishlist Database!");
		System.out.println();

		System.out.println("What would you like to name your database?");
		fileName = reader.nextLine();//asking the user to name the file that will be created

		PrintWriter out = new PrintWriter("C:\\Users\\lavoiet2\\Downloads\\Coding\\WishlistDatabaseFiles\\" + fileName);//sets the destination for the file created and creates the printwriter object

		file_name = fileName;//sets the global file_name variable to the local fileName variable

		itemName = WishlistInitial.item_name;//sets the local variable itemName to the global variable item_name
		itemCost = WishlistInitial.item_cost;//sets the local variable itemCost to the global variable item_cost

		System.out.println("Would you like to store the initial item you started Wishlist with? (yes/no)");
		confirm = input.nextLine();//asks the user if they want their intial item stored

		if (confirm.equals("yes")) {
			out.println(itemName);//stores the original itemName to file
			out.println(itemCost);//stores the original itemCost to file

			System.out.println("Item Stored in " + fileName);
		} else if (confirm.equals("no")) {
			System.out.println();
			System.out.println("Okay, that item shall not be saved, you will be directed to the rest of the database now.");
		}

		System.out.println();
		System.out.println("Would you like to store any other items into the database? (yes/no)");
		confirm1 = input.nextLine();//asks the user if they would like to store any additional items

		if (confirm1.equals("yes")) {
			System.out.println();
			System.out.println("Okay! This database can hold up to three additional items, so lets get started!");
			System.out.println();

			System.out.println("What is the name of the first item would you like to store?");
			itemName1 = reader.nextLine();//takes the input for the name of the first item
			System.out.println("And what is the price of " + itemName1 + "?");
			itemCost1 = Double.parseDouble(reader.nextLine());//takes the input for the cost of the first item

			out.println(itemName1);//stores the first itemName to file
			out.println(itemCost1);//stores the first itemCost to file

			System.out.println("Item Stored in " + fileName);

			System.out.println();
			System.out.println("Would you like to store another item? (yes/no)");
			confirm2 = input.nextLine();//asks the user if they would like to store another item

			if (confirm2.equals("yes")) {
				System.out.println();
				System.out.println("Okay! What is the name of your second item?");
				itemName2 = reader.nextLine();//takes the input for the name of the second item
				System.out.println("And what is the price of " + itemName2 + "?");
				itemCost2 = Double.parseDouble(reader.nextLine());//takes the input for the cost of the second item

				out.println(itemName2);//stores the second itemName to file
				out.println(itemCost2);//stores the second itemCost to file

				System.out.println("Item Stored in " + fileName);

				System.out.println("Would you like to store another item? (yes/no)");
				confirm3 = input.nextLine();//asks the user if they would like to store another item

				if (confirm3.equals("yes")) {
					System.out.println();
					System.out.println("Okay! What is the name of your third item?");
					itemName3 = reader.nextLine();//takes the input for the name of the third item
					System.out.println("And what is the price of " + itemName3 + "?");
					itemCost3 = Double.parseDouble(reader.nextLine());//takes the input for the cost of the third item

					out.println(itemName3);//stores the third itemName to file
					out.println(itemCost3);//stores the third itemCost to file

					System.out.println("Item Stored in " + fileName);

					System.out.println("Okay! That is all the items that can be stored at this time.");
					System.out.println();
					System.out.println("All of your items were stored under " + fileName + ".txt! Thank you very much for using Wishlist Database!");
				}
			} else if (confirm2.equals("no")) {
				System.out.println();
				System.out.println("Okay, thank you for using Wishlist Database! All items (if any) have been stored!");
			}
		} else if (confirm1.equals("no")) {
			System.out.println();
			System.out.println("Okay, thank you for using Wishlist Database! All items (if any) have been stored!");
		}

		out.close();
		input.close();
		reader.close();
	}

}
