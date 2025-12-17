#include <iostream>
using namespace std;

class Rectangle
{
private:
    int length;
    int breadth;

public:
    area(int length, int breadth)
    {
        return length * breadth;
    }
    perimeter(int length, int breadth)
    {
        return 2 * (length + breadth);
    }
};
int main()
{
    Rectangle r;
    int l, b;
    cout << "Enter the length and breadth of the rectangle:";
    cin >> l >> b;
    cout << "Area of the rectangle is :" << r.area(l, b) << endl;
    cout << "Perimeter of the rectangle is :" << r.perimeter(l, b) << endl;
    return 0;
}