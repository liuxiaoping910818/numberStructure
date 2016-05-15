package com.muber.maopao;

/**
 * 
 * 冒泡排序:就是相邻的两个数行排序
 * @author Administrator
 *
 */
public class MaoPao {
	public static void bubble(int [] unsorted){
		
		for(int i=0;i<unsorted.length;i++){
			
			for(int j=0;j<unsorted.length;j++){
				
				if(unsorted[j]>unsorted[i]){
					
					int temp=unsorted[i];
					unsorted[i]=unsorted[j];
					unsorted[j]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int [] a={1,2,33,22,42,12,123,};
		bubble(a);
		for (int i : a) {
			
			System.out.print(i+",");
		}
	}

}
