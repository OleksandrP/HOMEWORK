package core.less15.homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyMap<K,V>{
	
	private Set<MyEntry<K,V>> entrySet =  new HashSet<>();

//	видаляли об’єкт мапи за значенням(значенню об’єкта присвоюється нульова спилка, при цьому зберігається ключ)
//	виводили на екран Set ключів
//	Виводили на екран List значень
//	Виводили на екран цілу мапу 
//
	
	public void put(K key, V value){       //додавали новий об’єкт в мапу
		entrySet.add(new MyEntry<K,V>(key,value));
	}
	
	public void remove(K key){			   //видаляли об’єкт мапи за ключем(тобто немає ні ключа ні значення)
		 Iterator<MyEntry<K, V>> iterator = entrySet.iterator();
		    while(iterator.hasNext()) {
		        MyEntry<K, V> myEntry = iterator.next(); // назва змінної myEntry
		        if(myEntry.getKey().equals(key)){      // назва myEntry.getKey() де знаходиться змінна.
		            iterator.remove();
		        }
		    }
    	}
	
	public  void delete(K key, V value){
		Iterator<MyEntry<K, V>> iterator = entrySet.iterator();
	    while(iterator.hasNext()) {
	        MyEntry<K, V> myEntry = iterator.next(); // назва змінної myEntry
	        if( myEntry.getValue().equals(value)){ 	// назва myEntry.getKey() де знаходиться змінна.
	        	myEntry.setValue(null);
	        	
	        }
	    }
	}
	public void printSet(){
	Iterator<MyEntry<K, V>> iter = entrySet.iterator();
		while (iter.hasNext()){
		MyEntry<K, V> myEntry = iter.next();
		System.out.println(myEntry.getKey());
			}
		}
	
	public void printList(){
		Iterator<MyEntry<K, V>> iter = entrySet.iterator();
			while (iter.hasNext()){
			MyEntry<K, V> myEntry = iter.next();
			System.out.println(myEntry.getValue());
				}
			}
	
	public void printAll(){
		Iterator<MyEntry<K, V>> iter = entrySet.iterator();
			while (iter.hasNext()){
			MyEntry<K, V> myEntry = iter.next();
			System.out.println(myEntry);
				}
			}

		
}