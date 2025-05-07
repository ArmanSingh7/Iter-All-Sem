package Demoo;
import java.util.*;
class job{
	int start,finish,profit;
	job(int start,int finish,int profit){
		this.start=start;
		this.finish=finish;
		this.profit=profit;
		
	}
	
}
class jobcomparator implements Comparator<job>{
	public int compare(job a , job b) {
		return a.finish<b.finish? -1:a.finish==b.finish?0:1;
	}
}
public class ad {
 static public int binarysearch(job jobs[],int index) {
	 int lo=0;
	int hi=index-1;
	while(lo<=hi) {
		int mid=(lo+hi)/2;
		if(jobs[mid].finish<=jobs[index].start) {
			lo=mid+1;
		}
		else
			return mid;
		
	}
	return lo;
 }
}
