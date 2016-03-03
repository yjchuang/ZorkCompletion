import java.util.Scanner;
import java.util.Random;


public class ZorkCompletion {
	
	static Scanner darkly = new Scanner(System.in);
	static int isDiscovered = 0;

	public static void main(String[] args) {
		

		room1();

	}

	private static void roomDescribe(String where, String[] stuff, String directions)
	{
		System.out.println("You are in " + where);
		for (String thing : stuff) {
			System.out.println("You see " + thing);
		}
		System.out.println("You can go " + directions);
	}

	public static void room1()
	{
		String place = "the Foyer";
		String[] things = new String[1];
		things[0] = "a dead scorpion";
		String direct = " to the north (n) or the south (s)";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("n")) 
			{
				room2();
			}
			else if (choice.equals("s")) // exits the house
			{
				System.out.println("You are exiting the house");
				break;
			}
			
		} while (1==1);
	}

	public static void room2()
	{
		String place = "the Front Room";
		String[] things = new String[1];
		things[0] = "a piano";
		String direct = " to the east (e), the south (s) or the west (w)";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("s")) 
			{
				room1();
			} else if (choice.equals("e")) 
			{
				room4();
			} else if (choice.equals("w")) 
			{
				room3();
			}
		} while (1==1);
	}
	
	public static void room3()
	{
		String place = "the Library";
		String[] things = new String[1];
		things[0] = "spiders";
		String direct = " to the north (n), the east (e)";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("n")) 
			{
				room5();
			} else if (choice.equals("e")) 
			{
				room2();
			} 
		} while (1==1);
	}
	
	public static void room4()
	{
		String place = "the Kitchen";
		String[] things = new String[1];
		things[0] = "many bats";
		String direct = " to the north (n), or the west (w)";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("n")) 
			{
				room7();
			} else if (choice.equals("w")) 
			{
				room2();
			} 
		} while (1==1);
	}
	
	public static void room5()
	{
		String place = "the Dining Room";
		String[] things = new String[1];
		things[0] = "dust and emply boxes";
		String direct = " to the south (s) only";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("s")) 
			{
				room3();
			} 
		} while (1==1);
	}
	
	public static void room6()
	{
		Random rnd = new Random();	//get one out of four
		int chance = rnd.nextInt(4);
		
		String place = "the Vault";
		String[] things = new String[1];
		things[0] = "3 walking skeletons";
		String direct;
		if (isDiscovered == 1 || chance == 0)
		{
			direct = " to the secret room (s), or to the parlor (p)";
		}
		else 
		{
			direct = " to the parlor (p)";
		}
		
		
		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();
			if (isDiscovered == 1 || chance == 0) //0 means secret room is discovered
			{
				isDiscovered = 1;
				if (choice.equals("s")) 
				{
					room8();
				} else if (choice.equals("p")) 
				{
					room7();
				} 
			}
			else 
			{
				if (choice.equals("p"))
					room7();
			}
		} while (1==1);
	}
	
	public static void room7()
	{
		String place = "the Parlor Room";
		String[] things = new String[1];
		things[0] = "a treasure chest";
		String direct = " to the south (s) or the west (w)";
		int isDiscovered = 0;

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("s")) 
			{
				room4();
			} else if (choice.equals("w")) 
			{
				room6();
			}
		} while (1==1);
	}
	
	public static void room8()
	{
		String place = "the Secret Room";
		String[] things = new String[1];
		things[0] = "you found gold!!";
		String direct = " to the west (w) to exit the secret room";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("w")) 
			{
				room6();
			} 
		} while (1==1);
	}


}
