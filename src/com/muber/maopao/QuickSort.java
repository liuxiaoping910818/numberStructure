package com.muber.maopao;

/**
 * 
 * ���������㷨
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

		int tmp = list[low]; // ����ĵ�һ����Ϊ���ᣬҲ����list[0],��ʱhigh��ֵΪ7��Ҳ�������� ���һ��ֵ������

		while (low < high) {

			while (low < high && list[high] >= tmp) {

				high--;

			}
			//{49,38,65,97,76,13,27,49};
			list[low] = list[high]; // ������С�ļ�¼�Ƶ��Ͷ�,��һ��ִ�е�����ʱ��list[low]=27

			while (low < high && list[low] <= tmp) {

				low++;

			}

			list[high] = list[low]; // �������ļ�¼�Ƶ��߶�

		}

		list[low] = tmp; // �����¼��β

		return low; // ���������λ��

	}

	public void _quickSort(int[] list, int low, int high) {//�˴���һ��ʼִ��ʱlow�����ֵ Ϊ0��high�����ֵΪ�������һ��ֵ������

		if (low < high) {

			int middle = getMiddle(list, low, high); // ��list�������һ��Ϊ��

			_quickSort(list, low, middle - 1); // �Ե��ֱ���еݹ�����

			_quickSort(list, middle + 1, high); // �Ը��ֱ���еݹ�����

		} 

	}

	public void quick(int[] a2) {

		if (a2.length > 0) { // �鿴�����Ƿ�Ϊ��

			_quickSort(a2, 0, a2.length - 1);

		}

	}


	public static void main(String[] args) {
		
		QuickSort q=new QuickSort();
		
	}
	
}
