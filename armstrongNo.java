class armstrongNo{
public static void main (String args[]){
int c=0,temp,a;
int n=370;
 temp=n;
while(n>0)
{
 a=n%10;
n=n/10;
c=c+(a*a*a);
}
if(temp==0);
system.out.println("armstrong number");
else
system.out.println("not a armstrong number");
}
}
}
