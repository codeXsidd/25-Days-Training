/* Return the shortest word given in a string 

i/p= I like programming
o/p= I


*/

class Main {
    public String shortestWord(String s) {
        int min=Integer.MAX_VALUE;
        int count=0;
        int start=0;
        int end=0;
        boolean flag=false;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!=' ' && !flag){
                flag=true;
                count=1;
            }
            else if(ch!=' ' && flag){
                count++;
            }
            else if(ch==' ' && flag){
                if(count<min){
                    min=count;
                    start=i-count;
                    end=i;
                }
                flag=false;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=start; i<end; i++){
            sb.append(s.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
