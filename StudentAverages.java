import java.util.*;
import java.io.*;
import java.lang.Math;
public class StudentAverages {
	public static void main(String[] args) throws IOException{
		Scanner sf = new Scanner(new File("E:\\Workspace\\StringsExcercises\\StudentScores.in"));
		String []a = new String[1000];
		int maxIndx = -1;
		while(sf.hasNext()){
			maxIndx++;
			a[maxIndx] = sf.nextLine();}
		sf.close();
		int total;
		int num;
		double average;
		for (int n = 0; n <= maxIndx; n++){
			total = 0;
			num = 0;
			Scanner b = new Scanner(a[n]);
			System.out.print(b.next() + ", average = ");
			while (b.hasNextInt()){
				total += b.nextInt();
				num++;}
			average = (double)total / num;
			System.out.println(Math.round(average));}}}