package core.less11.homework;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



import core.less11.homework.Controller.*;


public  class ZooClub {
	
	private static final Scanner sc = new Scanner(System.in);
	private static Map<Person, List<Pet>> map = new HashMap<>();
//	private static Controller controller = new Controller();
	public static void all() {
		boolean isRun=true;
		
		while (isRun) {
			Menu.menu();
			switch (sc.next()) {
			case "1":
				task1();
				break;
			case "2":
				task2();
				break;
			case "3":
				task3();
					break;
			case "4":
				task4();
				break;
			case "5":
				task5();
				break;
			case "6":
				task6();
				break;
			case "7":
				System.out.println("¬вед≥ть члена «ооклубу.");
				String personName=sc.next(); 
				System.out.println("¬вед≥ть кличку тваринки");
				String namePet=sc.next().toUpperCase(); 
				System.out.println("¬вед≥ть к≥льк≥сть рок≥в тваринки");
				int agePet=sc.nextInt(); 
				System.out.println("¬вед≥ть вид тваринки.");
				String classPet8=sc.next(); 
				Controller.add(new Person(personName), new Pet (namePet, agePet, classPet8 )); 
				break;
			case "8":
				Controller.print();
				break;
			case "9":
				System.out.println("¬ведыть назву файлу."); 
				Controller.write(sc.next()); 
				break;
			case "10":
				System.out.println("Enter file name"); 
				Controller.restore(sc.next()); 
				break;	
			case "11":
				isRun=false;
				break;
			default:
				sc.close();
				break;
			}
			}
		}
	public static void task1(){
	System.out.println("¬вед≥ть нового члена «ооклубу.");
	map.put(new Person(sc.next()), new ArrayList<>());
	}
	
	public static void task2(){
	System.out.println("¬вед≥ть члена «ооклубу.");
	String Person=sc.next(); 
	Person person2 = new Person(Person);
	if(map.containsKey(person2)){
	System.out.println("¬вед≥ть кличку тваринки");
	String NamePet=sc.next().toUpperCase(); 
	System.out.println("¬вед≥ть к≥льк≥сть рок≥в тваринки");
	int AgePet=sc.nextInt(); 
	System.out.println("¬вед≥ть вид тваринки.");
	String ClassPet=sc.next(); 
	map.get(person2).add(new Pet(NamePet, AgePet, ClassPet));
	}else{
		System.out.println("“акоњ людини не ≥снуЇ");
	}
	}
	public static void task3(){
	System.out.println("¬вед≥ть члена «ооклубу.");
	String person3 = sc.next();
	Person person1 = new Person(person3); 
	if(map.containsKey(person1)){ 
		System.out.println("¬вед≥ть кличку тваринки");
		String NamePet=sc.next(); 
		System.out.println("¬вед≥ть к≥льк≥сть рок≥в тваринки");
		int AgePet=sc.nextInt(); 
		System.out.println("¬вед≥ть вид тваринки.");
		String ClassPet=sc.next(); 
	Pet pet = new Pet (NamePet, AgePet,ClassPet); 
	if(map.get(person1).contains(pet)){ 
	map.get(person1).remove(pet); 
	}else{ 
	System.out.println("“ака людина немаЇ такоњ тваринки."); 
	} 
	}else{ 
	System.out.println("“акий ”часник не заЇЇстрований в нашому клуб≥"); 
	} 
	}
	public static void task4(){
	System.out.println("¬вед≥ть члена «ооклубу.");
	String persoN = sc.next();
	Person person4 = new Person(persoN); 
//	if (map.containsKey(person4))
			map.remove(person4);
	map.forEach((key, value)->value
			.forEach(pet->System.out.println(key+" -> "+pet)));
	}
	
	public static void task5(){
	System.out.println("¬вед≥ть тваринку котру треба видалити"); 
	String animalName = sc.next(); 
	System.out.println("¬вед≥ть к≥льк≥сть рок≥в тваринки"); 
	int animalAge = sc.nextInt(); 
	System.out.println("¬вед≥ть вид тваринки.");
	String ClassPet=sc.next(); 
	Pet pet1 = new Pet (animalName, animalAge, ClassPet); 
	Set<Person> keySet = map.keySet(); 
	for (Person key: keySet){ 
	if (map.get(key).contains(pet1)){ 
	map.get(key).remove(pet1); 
			} 
		}
	}
	public static void task6(){
	map.forEach((key, value)->value
			.forEach(pet->System.out.println(key+" -> "+pet)));
	}
	
}

	