#include<iostream>
using namespace std;
// Generic Doubly Linear Linked List
template <class T>
struct  node
{
    T data;
    struct node *next;
    struct node *prev;
};

template <class T>
class DoublyLL
{
    public:
    struct node <T> *head;
    int Count;

    DoublyLL();
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
DoublyLL<T>::DoublyLL()
{
    head = NULL;
    Count = 0;
}

template <class T>
void DoublyLL<T>::InsertFirst(T no)
{
     struct node<T> *newn = NULL;

     newn = new node<T>;

     newn-> data = no;
     newn-> next = NULL;

     if(head == NULL)
     {
         head = newn;
     }
     else
     {
         newn->next = head;
         head->prev = newn;
         head = newn;
     }
     Count++;
}

template <class T>
void DoublyLL<T>::InsertLast(T no)
{
     struct node<T> *newn = NULL;
     struct node<T> *temp = NULL;

     newn = new node<T>;

     newn-> data = no;
     newn-> next = NULL;

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
         newn->prev = temp;

     }
     Count++;
}

template <class T>
void DoublyLL<T>::InsertAtPos(T no, int pos)
{
     if((pos <= 0) && (pos > Count+1))
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

     newn-> data = no;
     newn-> next = NULL;

     for(int i = 1; i < pos-1; i++)
     {
         temp = temp->next;
     }
     newn->next = temp->next;
     temp->next->prev = newn;
     newn->prev = temp;
     temp->next = newn;
     }

     Count++;
}

template <class T>
void DoublyLL<T>::DeleteFirst()
{

     if(head == NULL)
     {
         return;
     }
     else
     {
        struct node<T> *temp = head;

        head = head->next;
        head->prev = NULL;
        delete temp;

     }
     Count--;
}

template <class T>
void DoublyLL<T>::DeleteLast()
{

     if(head == NULL)
     {
         return;
     }
     else if(head->next == NULL)
     {
         delete head;
         head = NULL;   
     }
     else
     {
         struct node<T> *temp = head;

         while(temp->next != NULL)
         {
             temp = temp->next;
         }
         temp->prev->next = NULL;
         delete temp;
     }
     Count--;
}
template <class T>
void DoublyLL<T>::DeleteAtPos(int pos)
{
     if((pos <= 0) && (pos > Count))
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

     for(int i = 1; i < pos-1; i++)
     {
         temp = temp->next;
     }
     temp->next = temp->next->next;
     delete temp->next->prev;
     temp->next->prev = temp;
     }

     Count--;
}

template <class T>
void DoublyLL<T>::Display()
{
    cout<<"Elements from Linked List"<<endl;
    struct node<T> *temp = head;
   
    while(temp != NULL)
    {
        cout<<"|"<<temp->data<<"|->";
        temp = temp->next;
    }
    cout<<"NULL"<<endl;
}

template <class T>
int DoublyLL<T>::CountNode()
{
    return Count;
}

