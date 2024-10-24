#include <cstdio>
#include <vector>
#define MAXN 101
using namespace std;
vector<int> graph[MAXN];
int processed[MAXN], pay[MAXN], lvl[MAXN], N, A, B, C;
void dfs(int x) {
    processed[x] = 1;
    for (int i = 0; i < graph[x].size(); i++) {
        int v = graph[x][i];
        if (!processed[v]) {
            pay[v] = x;
            lvl[v] = lvl[x] + 1;
            dfs(v);
        }
    }
}
int LCA(int u, int v) {
    while (u != v) {
        if (lvl[u] > lvl[v]) {
            u = pay[u];
        } else {
            v = pay[v];
        }
    }
    return u;
}
int main() {
    while (scanf("%d %d %d %d", &N, &A, &B, &C) != EOF) {
        for (int i = 1; i <= N; i++) {
            graph[i].clear();
            pay[i] = -1;
            processed[i] = 0;
            lvl[i] = -1;
        }
        for (int i = 1; i < N; i++) {
            int u, v;
            scanf("%d %d", &u, &v);
            graph[u].push_back(v);
            graph[v].push_back(u);
        }
        lvl[A] = 0;
        pay[A] = 0;
        dfs(A);
        int ancestry = LCA(B, C);
        int distb = lvl[B] - lvl[ancestry];
        int distc = lvl[C] - lvl[ancestry];
        double prob = double(distc) / double(distb + distc);
        printf("%.6lf\n", prob);
    }
    return 0;
}