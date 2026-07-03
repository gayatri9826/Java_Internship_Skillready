#include <iostream>
using namespace std;
int main() {
    cout << "Enter the size for array: ";
    int size;
    cin >> size;
    int a[size];
    cout << "Enter " << size << " numbers for array: ";
    for (int i = 0; i < size; i++) {
        cin >> a[i];
    }
    int addition = 0;
    for (int i = 0; i < size; i++) {
        addition = addition + a[i];
    }
    cout << "Addition = " << addition;
    return 0;
}