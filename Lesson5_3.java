import java.util.*;
public class Lesson5_3{
	public static void main(String[] args){
		int[] values=new int[10];
		for(int i=0;i<10;i++){
			values[i]=new Scanner(System.in).nextInt();
			if ((values[i] %2)==0)
				System.out.print("guusuu"+values[i]);
			else 
				System.out.print("kisuu"+values[i]);
		}	 
	}
}
