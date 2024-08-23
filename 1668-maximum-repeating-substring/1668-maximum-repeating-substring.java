class Solution {
    public int maxRepeating(String sequence, String word) {
        String x=word;
        if(sequence.indexOf(word)==-1){return 0;}
        int i=1;
        while(sequence.indexOf(x+word)!=-1)
        {
            x+=word;
            i++;
        }
        return i;
    }
}