package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class array {
	public static void main(String args[])
	{
		
		Integer a[]= {1,3,3,4};
		Integer b[]= {2,4,5,5};
		
		//1,2
		
		Set<Integer> set1  = new HashSet<Integer>(Arrays.asList(a));
		System.out.println(set1);
		Set<Integer> set2  = new HashSet<>(Arrays.asList(b));
		System.out.println(set2);
		Set<Integer> set3  = new HashSet<>(Arrays.asList(a));
		System.out.println(set3);
		
		
		set1.removeAll(set2);
		System.out.println(set1);
		set2.removeAll(set3);
		System.out.println(set2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int a[]= {1,2,3,4};
//		int b[]= {2,3,5,9};
//		int c[]=new int[4];
//		int d[]=new int[4];
//		
//		
//		List<Integer> li=new ArrayList<>();
//		List<Integer> lis=new ArrayList<>();
//		List<Integer> list=new ArrayList<>();
////		
////		
//		for(int j=0;j<b.length;j++)
//			{
//					li.add(a[j]);
//				
//			}
//		for(int i=0;i<4;i++) {
//			lis.add(b[i]);
//		}
//		System.out.print(li);
//		System.out.print(lis);
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4;j++) {
//				if(li.get(i)==lis.get(j))
//				{
//					list.add(li.get(i));
//				}
//			}
//		}
//		li.stream().filter(i->list.contains(i)).map(i->i).toList();
////		li.remove(list);
////		
////			
////		
////		
////		
//			System.out.print(list);
////		
////		
////		System.out.println("");
//		
////		for(int i=0;i<4;i++) {
////			for(int j=0;j<4;j++) {
////				if(a[i]!=b[j]) {
////					for(int k=0;k<4;k++) {
////						System.out.print(a[i]);
//////						d[k]=b[j];
////					}
////				}
////			}
////		}
////		for(int i=0;i<4;i++) {
////			System.out.println(d[i]);
////		}
	}

}
