package PracticeExamples;

import java.util.ArrayList;

public class ClearMyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        arrl.clear();
        System.out.println("After clear ArrayList:"+arrl);
    }
}


	


