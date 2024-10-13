#include<iostream>
using namespace std;

int main() {
    int N;
    while(cin >> N) {
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                int v = i==N/2 and j==N/2      ? 4 :
                        i>=N/3 and i<N-N/3 and 
                        j >= N/3 and j < N-N/3 ? 1 :
                        i == j                 ? 2 :
                        i+j+1 == N             ? 3 : 0;
                cout << v;
            }
            cout << endl;
        }
        cout << endl;

    }
}
