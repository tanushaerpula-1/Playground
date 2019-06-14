#include<stdio.h>
int main()
{
  //Type your code here
  int n,second;
  scanf("%d",&n);
  second=n%100;
  second=second/10;
  printf("%d",second);
  return 0;
}