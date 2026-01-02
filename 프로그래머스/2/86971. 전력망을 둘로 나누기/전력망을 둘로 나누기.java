import java.util.*;
class Solution {
    static private int[] unf;
    public static int Find(int v){
        if(v==unf[v]) return v;
        else return unf[v]=Find(unf[v]);
    }
    public static void Union(int a, int b){
        int fa=Find(a);
        int fb=Find(b);
        if(fa!=fb) {
            if(fa>fb) unf[fa] = fb;
            else unf[fb] = fa;
    	}
	}

    public static int getRemainder(int n) {
    	int lt=0, rt=0;
    	for(int i=1; i<=n; i++) 
    		if(Find(unf[i])==1) lt++;
    	rt = n-lt;
    	return Math.abs(lt-rt);
    }
        
    public int solution(int n, int[][] wires) {
        int answer = n;
        for(int i=0;i<wires.length;i++){
            unf = new int[n+1];
            for(int p=0;p<=n;p++)unf[p]=p;
            for(int j=0; j<wires.length; j++) {
        		if(i==j) continue;
                
                Union(wires[j][0],wires[j][1]);
            }
            int tmp = getRemainder(n);
            answer = Math.min(answer,tmp);
        }
        
        return answer;
    }
}