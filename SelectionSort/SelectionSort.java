public class SelectionSort{
	public static void sort(int []arr){
		int n=arr.length;
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int []arr={34,12,45,24,10};
		System.out.println("Elements after sorting:");
		sort(arr);
		for(int i:arr){
			System.out.print(i+" ");
		}


	}
}