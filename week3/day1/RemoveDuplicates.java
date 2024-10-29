package week3.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		 
		String text = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		String temp = " ";
		
		String[] split = text.split(" ");
		System.out.println(split[1]);
		
		for (int i = 0; i < split.length; i++) {
			for (int j = i+1; j < split.length; j++) {
				
				  if(split[i].equalsIgnoreCase(split[j])) {
					  count = count+1;
					  split[j]=" ";
					  
				  }
			}
			
		}
		if(count>1) {
			for(int i = 0; i<split.length ;i++) {
				temp = temp + split[i]+" ";	
				
			}
			System.out.println(temp);
		}

	}

}
