#include <iostream>
using namespace std;

class Complex
{
public:
    int real, img;

public:
    void read()
    {
        cout << "Enter real and imaginary parts: ";
        cin >> real >> img;
    }
    void display()
    {
        cout << "Complex number: " << real << " + i" << img << endl;
    }
    Complex sum(Complex c)
    {
        Complex temp;
        temp.real = real + c.real;
        temp.img = img + c.img;
        return temp;
    }
};
int main()
{
    Complex c1, c2;
    c1.read();
    c1.display();
    c2.read();
    c2.display();
    Complex c3;
    
    c3 = c1.sum(c2);
    c3.display();
    return 0;
}