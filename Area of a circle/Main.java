#include<stdio.h>
#define PI 3.14
int main()
{
  float r,a;
  
  scanf("%f",&r);
  a=PI*(r*r)/4;
  printf("%.2f",a);
  return 0;
}