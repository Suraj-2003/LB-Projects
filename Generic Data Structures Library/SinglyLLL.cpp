#include<iostream>
using namespace std;
// Generic singly Linear Linked List
template <class T>
struct node
{
    T data;
    struct node *next;
};

template <class T>
class SinglyLL
{
    public:
       struct node<T> *head;
       int Count;

       SinglyLL();
       void InsertFirst(T);
       void InsertLast(T);
       void InsertAtPos(T,int);
       void DeleteFirst();
       void DeleteLast();
       void DeleteAtPos(int);
       void Display();
       int CountNode();
};

template <class T>
SinglyLL<T>::SinglyLL()
{
    head = NULL;
    Count = 0;
}

template <class T>
void SinglyLL<T>::InsertFirst(T no)
{
    struct node<T> *newn = NULL;

    newn = new node<T>;

    newn->data = no;
    newn->next = NULL;

    if(head == NULL)
    {
        head = newn;
    }
    else
    {
        newn->next = head;
        head = newn;
    }
    Count++;
}

template <class T>
void SinglyLL<T>::InsertLast(T no)
{
    struct node<T> *newn = NULL;
    struct node<T> *temp = NULL;

    newn = new node<T>;

    newn->data = no;
    newn->next = NULL;

    if(head == NULL)
    {
        head = newn;
    }
    else
    {
        temp = head;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newn;
    }
    Count++;
}

template <class T>
void SinglyLL<T>::InsertAtPos(T no,int pos)
{
    if((pos <= 0) && (pos >= Count+1))
    {
        return;
    }
    if(pos == 1)
    {
        InsertFirst(no);
    }
    else if(pos == Count+1)
    {
        InsertLast(no);
    }
    else
    {
      
      struct node<T> *newn = NULL;
      struct node<T> *temp = head;       
      
       newn = new node<T>;

       newn->data = no;
       newn->next = NULL;

       for(int i = 1; i < pos-1; i++)
       {
             temp = temp->next;
       }
       newn->next = temp->next;
       temp->next = newn;
    }
    Count++;
}

template <class T>
void SinglyLL<T>::DeleteFirst()
{
    struct node<T> *temp = NULL;

    if(head == NULL)
    {
        return;
    }
   else if((head)->next == NULL)
    {
        delete head;
    }
    else
    {
        temp = head;
        head = temp->next;
        delete temp;
        temp = NULL;
    }
    Count--;
}

template <class T>
void SinglyLL<T>::DeleteLast()
{
    struct node<T> *temp = NULL;

    if(head == NULL)
    {
        return;
    }
    if((head)->next == NULL)
    {
        delete head;
    }
    else
    {
        temp = head;

        while(temp->next->next != NULL)
        {
            temp = temp->next;
        }
        delete temp->next;
        temp->next = NULL;
    }
    Count--;
}

template <class T>
void SinglyLL<T>::DeleteAtPos(int pos)
{
    if((pos <= 0) && (pos >= Count))
    {
        return;
    }
    if(pos == 1)
    {
        DeleteFirst();
    }
    else if(pos == Count)
    {
        DeleteLast();
    }
    else
    {
       struct node<T> *temp = head;       
       struct node<T> *temp2 = head;       
      
       for(int i = 1; i < pos-1; i++)
       {
             temp = temp->next;
            
       }
       temp2 = temp->next;
       temp->next = temp->next->next;
       delete temp2;
    }

    Count--;
}

template <class T>
void SinglyLL<T>::Display()
{
    cout<<"Elemenets from Linekd List"<<endl;
    
    struct node<T> *temp = head;

    while(temp != NULL)
    {
        cout<<"|"<<temp->data<<"|->";
        temp = temp->next;
    }
    cout<<"NULL"<<endl;
}

template <class T>
int SinglyLL<T>::CountNode()
{
    return Count;
}
