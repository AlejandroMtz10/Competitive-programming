#include<iostream>
#include<stdio.h>

using namespace std;

int main(){
	int nLinea;
	double n[12][12];
	char p;
	double suma = 0.0;
	
	cin>>nLinea;
	cin>>p;
	
	for(int i=nLinea; i<=nLinea;i++){
		for(int j=0;j<12;j++){
			cin>>n[i][j];
			if(i<j){
				suma+=n[i][j];
			}
		}
	}
	
	if(p=='S')
		printf("%.1f\n",suma);
	else
		printf("%.1f\n",suma/66.0);

	return 0;
}
