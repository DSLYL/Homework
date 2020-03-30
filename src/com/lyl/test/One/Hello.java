package com.lyl.test.One;


public class Hello {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        A a=new A();
        a.ConvexHull();
    }

}
class Date{
    float x[]= {0,1,1,1,2};
    float y[]= {1,2,0,1,1};
    float flag[]= {0,0,0,0,0};
}
class A{
    Date date=new Date();
    float a,b,c;
    int n=date.x.length;
    int i,j,k;
    void ConvexHull() {
        //System.out.println(n);
        for(i=0;i<n;i++) {
            for(j=i+1;j<n;j++) {
                a=date.y[j]-date.y[i];
                b=date.x[i]-date.x[j];
                c=date.x[i]*date.y[j]-date.y[i]*date.x[j];
                int sign1=0;
                int sign2=0;
                for(k=0;k<n;k++) {
                    if( k==j  ||  k==i )
                        continue;
                    if((a*date.x[k]+b*date.y[k])==c) {
                        sign1++;
                        sign2++;
                    }
                    if((a*date.x[k]+b*date.y[k])>c) {
                        sign1++;
                    }
                    if((a*date.x[k]+b*date.y[k])<c) {
                        sign2++;
                    }
                }
                if( sign1==(n-2) || sign2==(n-2) ) {
                    date.flag[i]=1;
                    date.flag[j]=1;
                }
                sign1=0;
                sign2=0;
            }
        }
        for(i=0;i<n;i++) {
            if(date.flag[i]==1) {
                System.out.println(date.x[i]+" "+date.y[i]);
            }
        }
    }
}