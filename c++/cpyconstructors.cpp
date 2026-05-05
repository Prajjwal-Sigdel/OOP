/*Study constructors and its types*/

#include <iostream>
#include <string.h>
using namespace std;

class Student
{
public:
    int id;
    string name;
    float marks;

    // default constructor
    Student()
    {
        id = 0;
        name = "No name";
        marks = 0.0;
    }

    // Parameterized constructor
    Student(int a, string b, float c)
    {
        id = a;
        name = b;
        marks = c;
    }

    // Copy constructor
    Student(const Student &s)
    {
        this->id = s.id;
        this->name = s.name;
        this->marks = s.marks;
    }

    void display()
    {
        cout << "ID : " << id << endl;
        cout << "Name : " << name << endl;
        cout << "Marks : " << marks << endl;
    }
};
int main()
{
    Student s1;
    s1.display();
    Student s2(101, "Ram", 99.00);
    s2.display();
    Student s3 = s2;
    s3.display();
    return 0;
}