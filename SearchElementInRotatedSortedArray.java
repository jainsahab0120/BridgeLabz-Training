
public class Main
{
	public static void main(String[] args) {
		 
		int[] nums = {4,5,6,7,0,1,2};  
	
		int target = 0;
		
		// second
// 		int nums[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; int  target= 3;
		int ans = FindElement(nums , target);
		
		System.out.println(ans);
		
	}
	
	public static int FindElement(int[] arr , int target){
	    
	    int n = arr.length;
	    
	    int hi = n-1;
	    int lo = 0;
	    
	    while(lo <= hi){
	        
	        int mid = (lo + hi ) / 2;
	        
	        if(arr[mid] == target) return mid;
	        
	        if(arr[mid] > arr[hi] ){
	            if(arr[mid] > target){
	                lo = mid + 1;}
	            else {
	                
	                hi = mid - 1;
	                
	            }
	        }
	        else   {
	            if(arr[mid] > target){
	                hi = mid -1 ;
	            }else{
	                lo = mid +1;
	            }
	            
	        }
	    }
	    
	    return -1;
	    
	    
	}
	
}




