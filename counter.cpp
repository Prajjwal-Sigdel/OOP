
#include <iostream>
using namespace std;

class Counter
{
public:
    static int count;
    Counter()
    {
        count++;
    }
    static void getcount()
    {
        cout << "The count is: " << count << endl;
    }
};
int Counter::count = 0;
int main()
{
    Counter c1, c2, c3;
    Counter::getcount();
    return 0;
}