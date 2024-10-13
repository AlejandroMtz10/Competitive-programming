#include<iostream>
#include<stdio.h>

using namespace std;

int main(){
	double matrix[12][12];
	char operation;
	double suma = 0.0;
	int count = 0;
	
	cin>>operation;
	
	for(int i=0; i<12;i++){
		for(int j=0;j<12;j++){
			cin>>matrix[i][j];
			if(i > 11 - j){
				suma+=matrix[i][j];
				count++;
			}
		}
	}
	
	double result;
	
	if(operation == 'S'){
		result = suma;
	}else{
		result = suma / count;
	}
		
	printf("%.1f\n",result);

	return 0;
}
