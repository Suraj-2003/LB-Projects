#include<iostream>
using namespace std;
// Generic Doubly Circular Linked List
template <class T>
struct node
{
    T data;
    struct node *next;
    struct node *prev;
};

template <class T>
class DoublyCLL
{
    private:
        struct node<T> *Head;
        struct node<T> *Tail;
        int Count;

     public:
        DoublyCLL();

        void InsertFirst(T);
        void InsertLast(T);
        void InsertAtPos(T, int);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int);

        int CountNode();
        void Display();
};

template <class T>
DoublyCLL<T>::DoublyCLL()
{
    Head = NULL;
    Tail = NULL;
    Count = 0;
}

template <class T>
void DoublyCLL<T>::InsertFirst(T iNo)
{
    struct node<T> *newn = NULL;
    newn = new node<T>;

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;

    if(Count == 0)
    {
        Head = newn;
        Tail = newn;
    }
    else
    {
        newn->next = Head;
        Head -> prev = newn;
        Head = newn;
    }

    Head->prev = Tail;
    Tail->next = Head;

    Count++;
}

template <class T>
void DoublyCLL<T>::InsertLast(T iNo)
{
    struct node<T> *newn = NULL;
    newn = new node<T>;

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;

    if(Count == 0) 
    {
        Head = newn;
        Tail = newn;
    }
    else
    {
           Tail->next = newn;
           newn->prev = Tail;

           Tail = newn;
    }

    Head->prev = Tail;
    Tail->next = Head;

    Count++;
}

template <class T>
void DoublyCLL<T>::InsertAtPos(T iNo, int iPos)
{
        if((iPos < 1) || (iPos > Count+1))
        {
            cout<<"Invalid position\n";
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(iNo);
        }
        else if(iPos == Count+1)
        {
            InsertLast(iNo);
        }
        else
        {
            struct node<T> *newn = NULL;
            newn = new node<T>;

            newn->data = iNo;
            newn->next = NULL;
            newn->prev = NULL;

            struct node<T> *temp = Head;

            for(int i = 1; i<iPos-1; i++)
            {
                temp = temp->next;
            }

                newn->next = temp->next;
                temp->next->prev = newn;
                temp->next = newn;
                newn->prev = temp;

                Count++;
        }
}

template <class T>
void DoublyCLL<T>::DeleteFirst()
{
    if(Count == 0)
    {
            return;
    }
    else if(Count == 1)
    {
            delete Head;
            Head = NULL;
            Tail = NULL;
    }
    else
    {
            Head = Head->next;
            delete Tail->next;          // delete Head->prev;
    }

    Tail->next = Head;
    Head->prev = Tail;
    Count--;
}

template <class T>
void DoublyCLL<T>::DeleteLast()
{
  if(Count == 0)
    {
            return;
    }
    else if(Count == 1)
    {
            delete Tail;
            Head = NULL;
            Tail = NULL;
    }
    else
    {
            Tail = Tail->prev;
            delete Tail->next;          // delete Head->prev;
    }

    Tail->next = Head;
    Head->prev = Tail;
    Count--;
}

template <class T>
void DoublyCLL<T>::DeleteAtPos(int iPos)
{
        if((iPos < 1) || (iPos > Count))
        {
            cout<<"Invalid position\n";
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == Count)
        {
            DeleteLast();
        }
        else
        {
            struct node<T> *temp = Head;

            for(int i = 1; i<iPos-1; i++)
            {
                temp = temp->next;
            }

            temp->next = temp->next->next;
            delete temp->next->prev;
            temp->next->prev = temp;

            Count--;
        }
}

template <class T>
void DoublyCLL<T>::Display()
{
       int i = 0;
       struct node<T> *temp = Head;

       for(i = 1; i<= Count; i++)
       {
            cout<<"|"<<temp->data<<"|->";
            temp = temp->next;
       }
       cout<<"NULL\n";
}

template <class T>
int DoublyCLL<T>::CountNode()
{
    return Count;
}

