package java8prog;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.StyledEditorKit.BoldAction;

public class ExampleFunctionalInterface {

	public static void main(String[] args) {
		
		Calculator calcuate = (a,b) ->  a+b;
		
		 Scanner scanner = new Scanner(System.in);
		 int n1 = scanner.nextInt();
		 int n2 = scanner.nextInt();
		System.out.println("Addition of 2 No.:  "+calcuate.add(n1, n2));
		
		
		int lastfebonucciNo = scanner.nextInt();
		
		FebonucciSeriesGenerator generator = (int t) -> generate(t);
		
		List<Integer> list = generator.generateFebonucci(lastfebonucciNo);
		
		list.forEach(System.out :: println);
		
		System.out.println("Print Pallindrome Series: ");
		int lastpalindromNo = scanner.nextInt();
		generatePallindrome(lastpalindromNo);
		
		
	}

	private static void generatePallindrome(int lastpalindromNo) {
		
		List<Integer> listpalidrom = Stream.iterate(0,n -> n+1).filter(n -> ispalidrom(n)).limit(lastpalindromNo).collect(Collectors.toList());
		
		System.out.println(listpalidrom);
	}

	private static boolean ispalidrom(Integer n) {
		// TODO Auto-generated method stub
		String str = String.valueOf(n);
		int left = 0;
		int right = str.length() - 1;
		
		while (left < right) {
			if(str.charAt(left) != str.charAt(right))
				return false;
			left++;
			right--;
		}
		
		return true;
	}

	private static List<Integer> generate(int t) {
		
		List<Integer> febbonucciSerieslist = Stream.iterate(new int[] {0 , 1 } , feb -> new int[] {feb[1] , feb[0] + feb[1]} )
				.limit(t).map(feb -> feb[0])
				.collect(Collectors.toList());
		
		return febbonucciSerieslist;
	}
}
