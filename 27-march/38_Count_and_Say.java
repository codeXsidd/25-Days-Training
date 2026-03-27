class Solution {
    public String countAndSay(int n) {
        String res="1";
		for(int k=2;k<=n;k++){
		    StringBuilder sb=new StringBuilder();
		    int count=1;
		    for(int i=1;i<res.length();i++){
		        if(res.charAt(i)==res.charAt(i-1)){
		            count++;
		        }
		        else{
		            sb.append(count);
		            sb.append(res.charAt(i-1));
		            count=1;
		        }
		    }
		    
		sb.append(count);
		sb.append(res.charAt(res.length()-1));
		res=sb.toString();
        }
        return res;
    }
}

// ----------------------------------Explanation-----------------------------------------------------------

/*
 i/p: n=4
    i   -> "1";     //initial
    ii  -> "11";    // from the prev str, onetimes one
    iii -> "21";    // from the prev str, twotimes one
    iv  -> "1211"; ==> O/P   // from the prev str, onetimes two and onetime one
*/

//-----------------------------------------------------------------------------------------------------------
