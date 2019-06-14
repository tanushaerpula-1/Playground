#include <stdio.h>
int main() {
	//Type your code
  int i ,n,sum=0,count=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    
    sum=sum+count;
    count++;
  }
  printf("%d",sum);
	return 0;
}