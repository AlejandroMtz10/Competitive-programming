/*In C++ 20*/

#include <bits/stdc++.h>

using namespace std;

typedef unsigned long long int ull;

string solve(string num){
    sort(num.begin(), num.end());

    string ans = "";

    for(int i = 0; i < num.size(); ++i)
        if(num[i] != '0'){
            ans += num[i];
            num.erase(num.begin() + i);
            break;
        }

    for(int i = 0; i < num.size(); ++i)
            ans += num[i];
    

    return ans;
}

int main(){
    ios_base::sync_with_stdio(false); 
    cin.tie(NULL);
  
    int t;

    cin >> t;

    string num;
    while(t--){
        cin >> num;
        cout << solve(num) << '\n';
    }


    return 0;
}
