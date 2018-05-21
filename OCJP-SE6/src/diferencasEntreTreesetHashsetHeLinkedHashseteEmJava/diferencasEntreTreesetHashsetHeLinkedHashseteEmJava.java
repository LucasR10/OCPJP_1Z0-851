package diferencasEntreTreesetHashsetHeLinkedHashseteEmJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class diferencasEntreTreesetHashsetHeLinkedHashseteEmJava {
	
	
	// diferenca entre set
	public static void main(String[] args) {

		/**
		 * 
		 * HashSet: Os elementos n�o s�o ordenados.
		 * LinkedHashSe :(muito pr�ximo ao HashSet). os elementos s�o ordenados n� ordem que s�o inseridos.:
		 * TreeSet: os elementos s�o ordenaso por isso � mais lento.
		 * ordena��o).
		 */
		//elementos n�o s�o ordenados
		HashSet<String> dset = new HashSet<String>();
		dset.add("1");
		dset.add("24");
		dset.add("3");
		dset.add("4");
		dset.add("55");
		Iterator<String> iterator = dset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		///

		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(63);
		tree.add(34);
		tree.add(45);
		 
		Iterator<Integer> iterator2 = tree.iterator();
		System.out.print("Tree set data: ");
		while (iterator.hasNext()) {
		    System.out.print(iterator.next() + " ");
		}
		
		//Os elementos continuam na ordem que s�o inseridos � um pouco mai rapida do que o TreeSet
		LinkedHashSet<Integer> dset1 = new LinkedHashSet<Integer>();
		dset1.add(2);
		dset1.add(1);
		dset1.add(3);
		dset1.add(5);
		dset1.add(4);
		Iterator<Integer> iterator3 = dset1.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	} 
	
	
}