package Solution;

public class roman {
    public int romanToInt(String s) {
        char symbol,tempSymbol=' ';
        int add=0;
        for(int i=(s.length()-1);i>=0;i--) {
            symbol=s.charAt(i);
            if(i>0)
                tempSymbol=s.charAt(i-1);
            if(symbol=='I')
                add+=1;
            if(symbol=='V') {
                if(tempSymbol=='I') {
                    i-=1;
                    add+=4;
                }
                else {
                    add+=5;
                }
            }
            if(symbol=='X') {
                if(tempSymbol=='I') {
                    i-=1;
                    add+=9;
                }
                else {
                    add+=10;
                }
            }
            if(symbol=='L') {
                if(tempSymbol=='X') {
                    i-=1;
                    add+=40;
                }
                else {
                    add+=50;
                }
            }
            if(symbol=='C') {
                if(tempSymbol=='X') {
                    i-=1;
                    add+=90;
                }
                else {
                    add+=100;
                }
            }
            if(symbol=='D') {
                if(tempSymbol=='C') {
                    i-=1;
                    add+=400;
                }
                else {
                    add+=500;
                }
            }
            if(symbol=='M') {
                if(tempSymbol=='C') {
                    i-=1;
                    add+=900;
                }
                else {
                    add+=1000;
                }
            }
            tempSymbol=' ';
        }
        return add;
    }
}