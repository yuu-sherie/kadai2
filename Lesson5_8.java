import java.util.*;
public class Lesson5_8{
	public static void main(String[] args){
int values[] = new int[10];

for( int i = 0 ; i < 10 ; i++ )
    values[i] =new Scanner(System.in).nextInt(); 

for( int i = 0 ; i < 10 ; i++ )
{
    for( int j = i + 1 ; j < 10 ; j++ )
    {
        if( values[i] > values[j] ){
            int t = values[i];
            values[i] = values[j];
            values[j] = t;
        }
    }
}

for( int i = 0 ; i < 10 ; i++ )
    System.out.print( values[i] + " " );
	}
}
