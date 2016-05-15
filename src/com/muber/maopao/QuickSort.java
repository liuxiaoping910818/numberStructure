package com.muber.maopao;

/**
 * 
 * 快速排序算法
 * @author Administrator
 *
 */
public class QuickSort {

	int a[]=
	{49,38,65,97,76,13,27,49};

	public 	QuickSort(){  
	  
	    quick(a);  
	  
	    for(int i=0;i<a.length;i++)  
	  
	       System.out.print(a[i]+",");  
	  
	}

	public int getMiddle(int[] list, int low, int high) {

		int tmp = list[low]; // 数组的第一个作为中轴，也就是list[0],此时high的值为7，也就是数组 最后一个值的索引

		while (low < high) {

			while (low < high && list[high] >= tmp) {

				high--;

			}
			//{49,38,65,97,76,13,27,49};
			list[low] = list[high]; // 比中轴小的记录移到低端,第一次执行到这里时，list[low]=27

			while (low < high && list[low] <= tmp) {

				low++;

			}

			list[high] = list[low]; // 比中轴大的记录移到高端

		}

		list[low] = tmp; // 中轴记录到尾

		return low; // 返回中轴的位置

	}

	public void _quickSort(int[] list, int low, int high) {//此处在一开始执行时low传入的值 为0，high传入的值为数组最后一个值的索引

		if (low < high) {

			int middle = getMiddle(list, low, high); // 将list数组进行一分为二

			_quickSort(list, low, middle - 1); // 对低字表进行递归排序

			_quickSort(list, middle + 1, high); // 对高字表进行递归排序

		} 

	}

	public void quick(int[] a2) {

		if (a2.length > 0) { // 查看数组是否为空

			_quickSort(a2, 0, a2.length - 1);

		}

	}


	public static void main(String[] args) {
		
		QuickSort q=new QuickSort();
		
	}
	
}
