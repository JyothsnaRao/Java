package PracticeExamples;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class MyArrayListNewCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        arrl.addAll(list);
        System.out.println("After Copy: "+arrl);
    }
}



	


