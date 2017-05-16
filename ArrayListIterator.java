package PracticeExamples;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        Iterator itr = (Iterator) arrl.iterator();
        while(itr.next()){
            char[] arr1;
			System.out.println(arr1);
        }
    }


	}


