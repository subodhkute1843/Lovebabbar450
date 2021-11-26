package SearchingAndSorting;

public class FirstAndLast {

	public static void main(String[] args) {
		
		int a[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
		int n = a.length;
		int x = 5;

		 int Fst = -1;
	     int last = -1;
        for(int i=0;i<n; i++){
            if (x == a[i]){
               if(Fst == -1){
                    Fst = i;   
               }
                last = i;
            }
        }
        System.out.println(Fst+" "+last);
	}

}
