#include <stdio.h>
int main() {
	//Type your code
  int i,n,sum=0,rem;
  scanf("%d",&n);
  while(n>0)
  {
    rem=n%10;
    sum=sum+rem;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}