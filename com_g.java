public class com_g {
  public static void main(String[] args) {
	int []a= {10,20,30,40};
	int []res=new int[a.length-1];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value is :");
	int sum=sc.nextInt();
	int index=0;
	for(int i=0;i<a.length;i++) {
     if(a[i]!=sum) {
    	 res[index++]=a[i];
    	 }	
	}
	System.out.println(Arrays.toString(res));
  }
}
