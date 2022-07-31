class BinarySearch{
	public static void bSearch(int a[],int first,int last,int key){
		int mid=(first+last)/2;
		while(first<last){
			if(a[mid]<key){
				first=mid+1;
			}
			else if(a[mid]==key){
				System.out.println("Element found at "+mid);
			    break;
			}
			else{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		
		if(first>last){
			System.out.println("Element not found");
		}
    }
	public static void main(String[] args) {
		int[] a={10,20,30,40,50};
		int key=40;
		int last=a.length-1;
		bSearch(a,0,last,key);
		
	}
}