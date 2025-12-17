/*Write a program to define a class Student with data members for name,
 roll number, and marks. Create and display details of a student.*/
#include <iostream>
using namespace std;

class Student
{
public:
    string name;
    int roll;
    float marks;

public:
    Student() {}
    Student(string n, int r, float m)
    {
        name = n;
        roll = r;
        marks = m;
    }
    void display()
    {
        cout << "Name: " << name << endl;
        cout << "Roll Number: " << roll << endl;
        cout << "Marks: " << marks << endl;
    }
};
int main()
{
    Student s1;
    s1.name = "Prajjwal";
    s1.roll = 410;
    s1.marks = 99.8;
    s1.display();
    Student s2("aman", 411, 98.5);
    s2.display();
    return 0;
}