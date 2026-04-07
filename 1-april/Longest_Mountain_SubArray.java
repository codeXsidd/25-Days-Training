public class main{
    public static void main(String[] args){
        int start=-1;
        int end=-1;
        int maxlen=0;
        int[] arr={2,1,4,7,3,2,1};
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int left=i;
                int right=i;
                while((left>0 && arr[left]>arr[left-1])&&(right<arr.length-1 && arr[right]>arr[right+1])){
                    left--;right++;
                }
                int len=right-left+1;
                if(len>maxlen){
                    maxlen=len;
                    start=left;
                    end=right;
                }
            }
        }
        if(start==-1){
            System.out.print(new int[0]);
            return;
        }
        int l=end-start+1;
        int[] res=new int[l];
        for(int i=0;i<l;i++){
            res[i]=arr[start+i];
        }
        System.out.print(Arrays.toString(res));
    }
}
