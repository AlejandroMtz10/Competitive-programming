#include <iostream>
#include <iomanip>

using namespace std;

int main(void)
{
    int n, m, q, i;
    int previous, current, rest;

    cin >> q;
    for (i = 0; i < q; ++i) {
        cin >> n >> m;
        previous = n;
        current = m;
        rest = previous % current;
        while (rest != 0) {
            previous = current;
            current = rest;
            rest = previous % current;
        }
        cout << current << endl;
    }
    return 0;
}
