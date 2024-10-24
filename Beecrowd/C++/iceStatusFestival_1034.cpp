#include <algorithm>
#include <cstdio>
#include <cstring>
#define LIMIT 9999999
using namespace std;
int tab[1001000], coins[25];
int main() {
    int instances, value, number;
    scanf("%d", &instances);
    while (instances--) {
        memset(tab, LIMIT, sizeof(tab));
        scanf("%d %d", &number, &value);
        for (int i = 0; i < number; i++) scanf("%d", &coins[i]);
        tab[0] = 0;
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < number; j++) {
                tab[i + coins[j]] = min(tab[i + coins[j]], tab[i] + 1);
            }
        }
        printf("%d\n", tab[value]);
    }
    return 0;
}
