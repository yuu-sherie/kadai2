import java.util.*;
public class Lesson5_5{
	public static void main(String[] args){
		int value=new Scanner(System.in).nextInt();
		int binary[] =new int[16];
		for(int i=15;i>=0;i--,value/=2)
			binary[i]=value%2;
			for(int i=0;i<16;i++)
				System.out.println(binary[i]);
	}
}
