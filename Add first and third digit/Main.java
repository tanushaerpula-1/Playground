#include<stdio.h>
int main()
{
  //Type your code here
  int num,first,third,sum;
  scanf("%d",&num);
  first=num/100;
  third=num%100;
  third=third%10;
  sum=first+third;
  printf("%d",sum);
  return 0;
}