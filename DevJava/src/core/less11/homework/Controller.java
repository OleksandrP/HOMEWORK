package core.less11.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Controller {

	private Scanner sc = new Scanner(System.in);
	private static Map<Person, List<Pet>> map = restore();
	
	public static void restore(String fileName) {
				File file = new File(fileName + ".txt");
				if (file.exists()) {
					try (BufferedReader br = new BufferedReader(new InputStreamReader(
							new FileInputStream(file)))) {
						Map<Person, List<Pet>> map1 = new HashMap<>();
						while (br.ready()) {
							String line = br.readLine();
							if (!line.isEmpty()) {
								String[] array = line.split("\\ ");
								Person p = new Person(array[0]);
								Pet pet = new Pet(array[1], Integer.valueOf(array[2]),
										array[3]);
								map1.put(p, new ArrayList<>());
								map1.get(p).add(pet);
							}
						}
						map = map1;
						save();
					} catch (IOException e) {
					}
				}
			}
	// Робота з файлами. Серіалізація.
		public static void write(String fileName){
			try (PrintWriter pw = new PrintWriter(new BufferedWriter(
						new FileWriter(fileName + ".txt")))) {
					Set<Person> keySet = map.keySet();
					for (Person key : keySet) {
						pw.print(key.getName() + " ");
						for (Pet pet : map.get(key)) {
							pw.println(pet.getNamePet() + " " + pet.getAgePet() + " "
									+ pet.getClassPet());
						}
					}pw.flush();
				} catch (IOException e) {
				}
			}

	public static void add(Person person, Pet pet) {
			map.put(person, new ArrayList<>());
			map.get(person).add(pet);
			save();
		}

			

			private static void save() {
				File file = new File("saveZoo.bf");
				try (ObjectOutputStream oos = new ObjectOutputStream(
						new FileOutputStream(file))) {
					oos.writeObject(map);
					oos.flush();
				} catch (IOException e) {

				}
			}

			@SuppressWarnings("unchecked")
			private static Map<Person, List<Pet>> restore() {
				File file = new File("saveZoo.bf");
				if (file.exists()) {
					try (ObjectInputStream ois = new ObjectInputStream(
							new FileInputStream(file))) {
						return (Map<Person, List<Pet>>) ois.readObject();
					} catch (IOException | ClassNotFoundException e) {

					}
				}
				return new HashMap<>();
			}
			
			public static void print() {
				map.forEach((key, value)->value
						.forEach(pet->System.out.println(key+" -> "+pet)));

			}	
		
		

}
