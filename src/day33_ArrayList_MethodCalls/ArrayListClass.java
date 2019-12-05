package day33_ArrayList_MethodCalls;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<>();

		// add(object):
		ArrayList<String> shoppinglist = new ArrayList<>();

		shoppinglist.add("apple");// index: 0, size: 1
		shoppinglist.add("orange");// insex: 1, size: 2
		shoppinglist.add("grape");// index2; size: 3

		System.out.println(shoppinglist);

		// add(index, object): adds object at the given index number
//	shoppingList.add("Strawberry");
		shoppinglist.add(1, "Strawberry");
		System.out.println(shoppinglist);

//	shoppingList.add(5 , "Toyota Corolla");  // it does not skip indexes
		System.out.println(shoppinglist);

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0, 5); // [5]
		numbers.add(1, 10); // [5, 10]
		numbers.add(2, 15); // [5, 10, 15]

		numbers.add(1, 1); // [5, 1, 10, 15]

		numbers.add(1, 6); // [5, 6, 1, 10, 15]

		System.out.println(numbers);

//	get(index number): returns the object
		ArrayList<String> names = new ArrayList<>();
		names.add("Homayra");
		names.add("Meri");
		names.add(1, "Mikrigul");
		names.add(1, "Tabriz");
		names.add(0, "Asiya");

		String str1 = names.get(1);
		System.out.println(str1);

//size(): returns the length of the arrayList as an Int value

		int length = names.size();
		System.out.println(length);

		for (int i = 0; i < names.size(); i++) {
			String each = names.get(i) + " ";
			System.out.print(each);
		}
		System.out.println();
		for (String each : names) {
			System.out.print(each + " ");
		}

		// clear(): removes all the objects from the arraylist
		ArrayList<String> students = new ArrayList<>();
		students.add("Holly");
		students.add("Erhan");
		students.add("Nadira");
		students.add("Seyfo");
		students.add("Cihan");

		System.out.println(students);
		System.out.println(students.size()); // 5
		students.clear();
		System.out.println(students);
		System.out.println(students.size()); // 0

		// set(index number, object): the given object will replace the object at the
		// given index number
		ArrayList<String> Javengers = new ArrayList<>();
		Javengers.add("Ferhat");
		Javengers.add(1, "Lexi");
		Javengers.add(1, "Asiya"); // "Shawkrat"
		Javengers.add("Ozgen");
		Javengers.add("Alex");
		Javengers.add(0, "Safwan"); // [Ferhat, Lexi, Asiya, Ozgen, Alex, Safwan]
		// ["Safwan", "Ferhat",

		System.out.println(Javengers);

		Javengers.set(1, "Shawkrat"); // [Ferhat, Lexi, Shawkrat, Ozgen, Alex, Safwan]

		System.out.println(Javengers);

		// contains(object): checks if the given object is contained in the ArrayList or
		// not, and returns boolean value
		ArrayList<String> goodGuys = new ArrayList<>();
		goodGuys.add("Hakan");
		goodGuys.add("Ihsan");
		goodGuys.add("Tim");
		goodGuys.add("Ibrohim");
		goodGuys.add("Dilyar");

		boolean result = goodGuys.contains("Tim");
		System.out.println(result);

		// equals(ArrayList): checks if the two arraylist are equal or not, returns
		// boolean value
		ArrayList<String> badGuys = new ArrayList<>();
		badGuys.add("Hakan");
		badGuys.add("Ihsan");
		badGuys.add("Tim");
		badGuys.add("Ibrohim");
		badGuys.add("Dilyar");

		boolean result2 = badGuys.equals(goodGuys); // false
		System.out.println(result2);

		if (goodGuys.contains("Ibrohim") && badGuys.contains("Ibrohim")) {
			System.out.println("Ibrohim is good guy");
		}

		// remove(int): removes that index number
		ArrayList<Integer> lists = new ArrayList<>();
		lists.add(1); // auto-boxing index: 0
		lists.add(2); // auto-boxing index: 1
		lists.add(3); // auto-boxing index: 2
		lists.add(4); // auto-boxing index: 3
		lists.add(5); // auto-boxing index: 4

		lists.remove(1); // [1, 3 , 4, 5]
		lists.remove(2); // [1, 3, 5]
		lists.remove(1); // [1, 5]
		System.out.println(lists);
		System.out.println(lists.size());

		// remove(Integer): removes the first matching object, at the same time returns
		// boolean value

		ArrayList<Integer> lists2 = new ArrayList<>();
		lists2.add(1); // auto-boxing index: 0
		lists2.add(2); // auto-boxing index: 1
		lists2.add(3); // auto-boxing index: 2
		lists2.add(4); // auto-boxing index: 3
		lists2.add(5); // auto-boxing index: 4

		// [1, 2, 3, 4, 5]
		Integer a = 8;
		boolean r1 = lists2.remove(a); // [2, 3, 4, 5]

		System.out.println(lists2);
		System.out.println(r1);

		ArrayList<String> city = new ArrayList<>();
		city.add("Miami");
		city.add("Miami");
		city.add("Gotham");
		city.add("Azarbaijan");
		city.add("Istanbul");
		city.add("Urumqi"); // [Miami, Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]

		// city.remove("Miami"); // [Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]

		if (city.remove("Miami")) { // [Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]
			city.remove(2); // [Miami, Gotham, Istanbul, "Urumqi"]
		}

		city.add(3, "Azarbaijan"); // [Miami, Gotham, Istanbul, Azarbaijan,"Urumqi"]
		System.out.println(city);

		ArrayList<Integer> price = new ArrayList<>();
		price.add(1);// auto
		price.add(2);
		price.add(3);
		price.add(4);
		price.add(5);

		price.remove(Integer.parseInt("2")); // parse method retunrs primitive,
		System.out.println(price); // [1, 2, 4, 5]

		boolean r3 = price.remove(Integer.valueOf("3")); // valueOf method returns wrapper class,
		System.out.println(price);
		System.out.println(r3);

	}

}
