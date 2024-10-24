#include <iostream>
#include <stack>

using namespace std;

int main() {
 int n, m, shutdowns;
 while (scanf("%d %d", &n, &m) && (n || m)){
     getchar();
     shutdowns= 0;
     stack<char> pile, answer;
     for (int i=0; i<n; i++){
         char da;
         scanf("%c", &da);
         while(!pile.empty() && shutdowns < m && da > pile.top()){
             pile.pop();
                 shutdowns++;
                 
         }
         if (pile.size()< n - m) pile.push(da);
     }
         while (!pile.empty()){
             answer.push(pile.top());
             pile.pop();
         }
         while (!answer.empty()){
             printf("%c", answer.top());
             answer.pop();
         }
         printf("\n");
 }
     
     return 0;
 }