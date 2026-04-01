/* Find the second most occuring character in a string

i/p=aabbbbca
o/p=a


*/

class Second_most {
    public char secondMostOccuring(String s) {
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        char max_char=' ';
        char second_max_char=' ';
        
        for(int i=0; i<s.length(); i++){
            boolean flag=false;
            for(int j=0; j<i; j++){
                if(s.charAt(i)==s.charAt(j)){
                    flag=true;
                    break;
                }
            }

            if(flag) continue;
            int count=0;

            for(int j=i; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)) count++;
            }

            if(count>max){
                second_max=max;
                max=count;
                second_max_char=max_char;
                max_char=s.charAt(i);
            }
            else if(count>second_max && count!=max){
                second_max=count;
                second_max_char=s.charAt(i);
            }

        }

        return second_max_char;
    }
}
