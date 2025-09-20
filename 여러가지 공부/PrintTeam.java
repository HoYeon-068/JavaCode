package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintTeam {

	public static void main(String[] args) {
		
		String fileName=".//src//days25//1차_팀편성.txt";
		String line=null;
		String[] tInfo;
		
		Map<String, ArrayList<String>> hmap=new LinkedHashMap<>();
		ArrayList<String> tName;
		
		try(FileReader fr=new FileReader(fileName);
				BufferedReader br=new BufferedReader(fr);) {
			
			while ((line=br.readLine())!=null) {
				
				String regex="[:/]";
				tInfo=line.split(regex);
				
				tName=new ArrayList<String>();
				for (int i = 1; i < tInfo.length; i++) {
					tName.add(tInfo[i]);
				}
				
				hmap.put(tInfo[0], tName);
				
			}
			
			printTeam(hmap);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void printTeam(Map<String, ArrayList<String>> hmap) {
		// TODO Auto-generated method stub
		
		Set<Entry<String, ArrayList<String>>> entry=hmap.entrySet();
		
		Iterator<Entry<String, ArrayList<String>>> ir=entry.iterator();
		
		while (ir.hasNext()) {
			Map.Entry<java.lang.String, java.util.ArrayList<java.lang.String>> entry2 = (Map.Entry<java.lang.String, java.util.ArrayList<java.lang.String>>) ir
					.next();
			
			System.out.printf("[%s]\n",entry2.getKey());
			
			ArrayList<String> temp=entry2.getValue();
			
			for (int i = 0; i < temp.size(); i++) {
				System.out.printf("%c. %s\n",i+'A',temp.get(i));
			}
			
		}
		
	}

}
