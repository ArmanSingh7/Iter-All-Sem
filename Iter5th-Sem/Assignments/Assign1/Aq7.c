#include<stdio.h>
int main(){
    float minavg ,curravg, req;
    char c;
    printf("Enter desired grade: \n");
    scanf("%c",&c);
    printf("Enter min average required: \n");
    scanf("%f",&minavg);
    printf("Enter current average in course:\n ");
    scanf("%f",&curravg);
    printf("Enter how much the final counts as a percentage of the course grade: ");
    scanf("%f",&req);
    float e;
    e= (minavg - (curravg * (1-(req/100))))/(req/100);
    printf("Required is %.2f: \n",e);
    return 0;
}