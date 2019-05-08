

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dictation {

	 
	 public static void main(String[] args) throws InterruptedException {
		
		DictationData myData = new DictationData();  
		 
		List<Japanese> dictationList = new ArrayList<Japanese>();
		 
		//Option 1: hiragana
		//dictationList = myData.getHiraganas();
		
		//Option 2: katakana
		dictationList = myData.getKatakanas();
		
		//Option 3
		//dictationList = myData.getMyList();
			
		int visitRecords = 0;
		
		String answer = "";
			
		while(visitRecords<dictationList.size()) {
			Random rand = new Random();
				
			// Obtain a random number between [0 - dictationList.size()].
			int n = rand.nextInt(dictationList.size());
			if(!dictationList.get(n).getIsVisited()) {
				Thread.sleep(dictationList.get(n).getSpeed());
				dictationList.get(n).print();
				answer = answer + dictationList.get(n).getAnswer()+"\n";
				dictationList.get(n).visit();
				visitRecords++;
			}
					
		}
		System.out.println("\nCheck your answer:\n"+answer);
	}
	 
	 
	
}

