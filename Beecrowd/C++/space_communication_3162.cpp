#include <iostream>
#include <cmath>
#include <limits>

using namespace std;

// Function to calculate the signal strength based on the distance
char getSignalStrength(double distance) {
    if (distance <= 20) {
        return 'A';
    } else if (distance <= 50) {
        return 'M';
    } else {
        return 'B';
    }
}

// Function to calculate the distance between two points in 3D space
double distance(int x1, int y1, int z1, int x2, int y2, int z2) {
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2) + pow(z2 - z1, 2));
}

int main() {
    int N;
    cin >> N;

    int ships[N][3];

    // Read the coordinates of each ship
    for (int i = 0; i < N; i++) {
        cin >> ships[i][0] >> ships[i][1] >> ships[i][2];
    }

    // Calculate the signal strength for each ship
    for (int i = 0; i < N; i++) {
        double minDistance = numeric_limits<double>::max(); // Initialize with a very large value
        char signalStrength;

        // Compare the distance with all other ships to find the nearest one
        for (int j = 0; j < N; j++) {
            if (i != j) {
                double dist = distance(ships[i][0], ships[i][1], ships[i][2], ships[j][0], ships[j][1], ships[j][2]);
                minDistance = min(minDistance, dist);
            }
        }

        // Get the signal strength based on the minimum distance
        signalStrength = getSignalStrength(minDistance);

        cout << signalStrength << endl;
    }

    return 0;
}
