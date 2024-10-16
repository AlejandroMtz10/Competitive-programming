#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main()

{
	int A, B, C;
	char winner;

	scanf("%d %d %d", &A, &B, &C);

	do
	{
		if (A==B && A==C && B==C) 
			winner = '*';
		else
			if (A!=B && B==C) 
				winner = 'A';
			else
				if (A==C && B!=A)
					winner = 'B';
				else
					if (A==B && C!=A)
						winner = 'C';

	printf("%c\n", winner);

	} while ( (scanf("%d %d %d", &A, &B, &C)!=EOF));





	return 0;
}
