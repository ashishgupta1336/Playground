#include<stdio.h>
int main()
{
  int num,sum,first,last;
  scanf("%d",&num);
  first=num/100;
  last=num%10;
  sum=first+last;
  printf("%d",sum);
  return 0;
}