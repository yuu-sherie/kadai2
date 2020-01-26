import java.util.*;
public class Lesson5_7{
	public static void main(String[] args){
int kuku[][] = new int[9][9];

for( int i = 0 ; i < 9 ; i++ )
    for( int j = 0 ; j < 9 ; j++ )
        kuku[i][j] = ( i + 1 ) * ( j + 1 );

int p = new Scanner(System.in).nextInt(); 
int q = new Scanner(System.in).nextInt(); 

System.out.println( kuku[p-1][q-1] );
	}
}
