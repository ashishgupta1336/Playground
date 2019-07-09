#include<stdio.h>
#include<math.h>
int main()
{
  float o,a;
  float t;
  scanf("%f%f",&o,&a);
  t= hypot(o,a);
  
  printf("%.2f",t);
  return 0;
}