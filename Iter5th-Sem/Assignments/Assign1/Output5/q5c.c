 #include<stdio.h>
 int main(){
 char ch='A';
 printf("%d\n",sizeof(ch+6.2));
 printf("%d\n",sizeof('A'));
 char c=97;
 printf("%d", sizeof(c+4));
 return(0);
 }