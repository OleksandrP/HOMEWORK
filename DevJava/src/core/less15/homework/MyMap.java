package core.less15.homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyMap<K,V>{
	
	private Set<MyEntry<K,V>> entrySet =  new HashSet<>();

//	�������� �ᒺ�� ���� �� ���������(�������� �ᒺ��� ������������ ������� ������, ��� ����� ���������� ����)
//	�������� �� ����� Set ������
//	�������� �� ����� List �������
//	�������� �� ����� ���� ���� 
//
	
	public void put(K key, V value){       //�������� ����� �ᒺ�� � ����
		entrySet.add(new MyEntry<K,V>(key,value));
	}
	
	public void remove(K key){			   //�������� �ᒺ�� ���� �� ������(����� ���� � ����� � ��������)
		 Iterator<MyEntry<K, V>> iterator = entrySet.iterator();
		    while(iterator.hasNext()) {
		        MyEntry<K, V> myEntry = iterator.next(); // ����� ����� myEntry
		        if(myEntry.getKey().equals(key)){      // ����� myEntry.getKey() �� ����������� �����.
		            iterator.remove();
		        }
		    }
    	}
	
	public  void delete(K key, V value){
		Iterator<MyEntry<K, V>> iterator = entrySet.iterator();
	    while(iterator.hasNext()) {
	        MyEntry<K, V> myEntry = iterator.next(); // ����� ����� myEntry
	        if( myEntry.getValue().equals(value)){ 	// ����� myEntry.getKey() �� ����������� �����.
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