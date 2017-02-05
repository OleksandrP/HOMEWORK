package core.less13;

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
import java.util.List;

import core.less7.Gender;
import core.less7.Person;

public class Controller {

	private List<Person> persons = restore();

	public void restore(String fileName) {
		File file = new File(fileName + ".txt");
		if (file.exists()) {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(file)))) {
				List <Person> list =new ArrayList<>();
				while (br.ready()) {
					String line = br.readLine();
					if (!line.isEmpty()){
						String[] array =line.split("\\ ");
						Person p = new Person(array[0],Integer.valueOf(array[1]),Gender.valueOf(array[2]));
						list.add(p);
					}
				}
				persons = list;
				save();
			} catch (IOException e) {
			}
		}
	}

	public void write(String fileName) {
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(
				new FileWriter(fileName + ".txt")))) {
			for (Person person : persons) {
				pw.println(person.getName() + " " + person.getAge() + " "
						+ person.getGender());
			}
			pw.flush();
		} catch (IOException e) {

		}
	}

	private void save() {
		File file = new File("save.bf");
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file))) {
			oos.writeObject(persons);
			oos.flush(); // заставити дописати що є в буфері.
		} catch (IOException e) {
		}
	}

	@SuppressWarnings("unchecked")
	private List<Person> restore() {
		File file = new File("save.bf"); // class File це робота з файлом, i не
											// являється файлом.
		if (file.exists()) {
			try (ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream(file))) {
				return (List<Person>) ois.readObject();
			} catch (IOException | ClassNotFoundException e) {

			}
		}

		return new ArrayList<>(); // повертається пуста колеція
	}

	public void add(Person p) {
		persons.add(p);
		save();
	}

	public void print() {
		persons.forEach(System.out::println);

	}
}
