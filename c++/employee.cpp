#include <iostream>
using namespace std;

class Employee
{
private:
    int id;
    char name[100];
    float salary;

public:
    void getData()
    {
        cout << "Enter ID: ";
        cin >> id;
        cout << "Enter Name: ";
        cin >> name;
        cout << "Enter Salary: ";
        cin >> salary;
    }
    void displayData()
    {
        cout << "ID: " << id << endl;
        cout << "Name: " << name << endl;
        cout << "Salary: " << salary << endl
             << endl;
    }
};
int main()
{
    Employee e[10];
    for (int i = 0; i < 10; i++)
    {
        cout << "Enter details for Employee " << i + 1 << ":" << endl;
        e[i].getData();
    }

    for (int i = 0; i < 10; i++)
    {
        cout << "The details of Employee " << i + 1 << " is:" << endl;
        e[i].displayData();
    }
    return 0;
}