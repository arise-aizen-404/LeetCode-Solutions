class Solution {
public:
    int minBitFlips(int start, int goal) {
        int nx=0;
        for(int i=0;i<32;i++)
        {
            int x=start&(1<<i);
            int y=goal&(1<<i);

            if(x!=y)
            nx++;

        }
        return nx;
    }
};