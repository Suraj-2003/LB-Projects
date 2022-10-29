import java.lang.*;
import java.util.*;

// create table student(RID int, Name varchar(255), Salary int, Age int, City varchar(255));
// Database table / schema
class Student
{
    public int RID;
    public String Name;
    public int Salary;
    public int Age;
    public String City;
    
    private static int Generator;

    static
    {
        Generator = 0;
    }

    public Student(String str, int value, int no, String str1)
    {
        this.RID = ++Generator;
        this.Name = str;
        this.Salary = value;
        this.Age = no;
        this.City = str1;
    }

    public void DisplayData()
    {
          
        System.out.println("|\t"+this.RID+"\t|\t"+this.Name + "\t|\t" + this.Salary+"\t|\t"+this.Age+"\t|\t"+this.City+"\t|");
        
    	System.out.println("---------------------------------------------------------------------------------");
      
      
    }
}

class DBMS
{
   public LinkedList <Student> lobj;

    public DBMS()
    {
        lobj = new LinkedList<>();
    }

    // Insert into student Piyush 1000;
    // select * from student
    public void StartDBMS()
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Marvellous customised DBMS started succesfully....");
        String Query = "";

        while(true)
        {
            System.out.print("Marvellous DBMS console >");
            Query = scanobj.nextLine();
            
            Query = Query.toLowerCase();

            String tokens[] = Query.split(" ");
            int QuerySize = tokens.length;

            if(QuerySize == 1)
            {
                
                if("help".equals(tokens[0]))
                {
                   
                    System.out.printf("This application is used to demonstrates the customised DBMS\n\n");
                    
                    System.out.println("Description : Insert new Record  :");
                    System.out.println("Query : Insert into student Name Salary Age City\n");
                   
                    System.out.println("Description : Select All Records : ");
                    System.out.println("Query : Select * from student\n");
                    
                    System.out.println("Description : Select Specific Record using Name :");
                    System.out.println("Query : Select * from student where name = Student_Name\n");
                    
                    System.out.println("Description : Select Specific Record using RID :");
                    System.out.println("Query : Select * from student where RID = Student_RID\n");
                    
                    System.out.println("Description : Select Specific Record using Age :");
                    System.out.println("Query : Select * from student where Age = Student_Age\n");
                    
                    System.out.println("Description : Select Specific Record using City  :");
                    System.out.println("Query : Select * from student where city = Student_City\n");
                    
                    System.out.println("Description : Select less RID");
                    System.out.println("Query : Select * from student where RID < Bigger_RID\n");
                    
                    System.out.println("Description : Select less than or equal to RID");
                    System.out.println("Query : Select * from student where RID <= Bigger_RID\n");
                    
                    System.out.println("Description : Select greater RID");
                    System.out.println("Query : Select * from student where RID > Smaller_RID\n");
                    
                     System.out.println("Description : Select greater than or equal to  RID");
                    System.out.println("Query : Select * from student where RID >= Smaller_RID\n");
                    
                    System.out.println("Description : Select less Salary");
                    System.out.println("Query : Select * from student where Salary < Bigger_Salary\n");
                    
                    System.out.println("Description : Select less than or equal to Salary");
                    System.out.println("Query : Select * from student where Salary <= Bigger_Salary\n");
                    
                    System.out.println("Description : Select greater Salary");
                    System.out.println("Query : Select * from student where Salary > Smaller_Salary\n");
                    
                    System.out.println("Description : Select greater than or equal to Salary");
                    System.out.println("Query : Select * from student where Salary >= Smaller_Salary\n");
                    
                    System.out.println("Description : Select less Age");
                    System.out.println("Query : Select * from student where Age < Bigger_Age\n");
                    
                    System.out.println("Description : Select less than or equal to Age");
                    System.out.println("Query : Select * from student where Age <= Bigger_Age\n");

                    System.out.println("Description : Select greater Age");
                    System.out.println("Query : Select * from student where Age > Smaller_Age\n");
                    
                    System.out.println("Description : Select greater than or equal to Age");
                    System.out.println("Query : Select * from student where Age >= Smaller_Age\n");
                    
                    System.out.println("Description : Select Specific Record using Name AND Age :");
                    System.out.println("Query : Select * from student where name = Student_Name and age = Student_Age\n");
                    
                    System.out.println("Description : Select Specific Record using Name AND City :");
                    System.out.println("Query : Select * from student where name = Student_Name and age = Student_City\n");
                    
                    System.out.println("Description : Select Specific Record using Name OR Age :");
                    System.out.println("Query : Select * from student where name = Student_Name OR age = Student_Age\n");
                    
                    System.out.println("Description : Select Specific Record using Name OR City :");
                    System.out.println("Query : Select * from student where name = Student_Name OR city = Student_City\n");
                    
                    System.out.println("Description : Select Salary Using BETWEEN  :");
                    System.out.println("Query : Select * from student where Salary BETWEEN Bigger_Amount and Smaller_Amount\n");
                    
                    System.out.println("Description : Select Age Using BETWEEN  :");
                    System.out.println("Query : Select * from student where Age BETWEEN Bigger_Age and Smaller_Age\n");
                    
                    System.out.println("Description : Update Specific Name using RID :");
                    System.out.println("Query : Update table student set name = Student_Name where RID = Student_RID\n");
                    
                    System.out.println("Description : Update Specific Age using RID :");
                    System.out.println("Query : Update table student set age = Student_Age where RID = Student_RID\n");
                    
                    System.out.println("Description : Update Specific City using RID :");
                    System.out.println("Query : Update table student set city = Student_City where RID = Student_RID\n");
                    
                    System.out.println("Description : Update Specific Name using oldName :");
                    System.out.println("Query : Update table student set Name = Updated_Name where Name = Old_Name\n");
                    
                    System.out.println("Description : Delete specific Record using name :");
                    System.out.println("Query : Delete from student where name = Student_Name\n");
                   
                    System.out.println("Description : Delete specific Record using RID :");
                    System.out.println("Query : Delete from student where RID = Student_RID\n");
                    
                    System.out.println("Description : Display Maximum Salary :");
                    System.out.println("Query : Select max Salary\n");
                    
                    System.out.println("Description : Display Minimum Salary :");
                    System.out.println("Query : Select min Salary\n");
                    
                    System.out.println("Description : Display Sum of Salary :");
                    System.out.println("Query : Select sum Salary\n");
                    
                    System.out.println("Description : Display Average of Salary :");
                    System.out.println("Query : Select avg Salary\n");
                    
                    System.out.println("Description : Display Count of City:");
                    System.out.println("Query : Select count City_Name\n");
                    
                    System.out.println("Count : Count Records\n");
                    
                    System.out.println("Clear : Clear Console\n");
                
                    System.out.println("Exit : Terminate DBMS\n");
                    
                }
                else if("clear".equals(tokens[0]))
                {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
                else if("count".equals(tokens[0]))
                {
                    AggregateCount();
                }
                else if("exit".equals(tokens[0]))
                {
                    System.out.println("Thank you for using Marvellous DBMS");
                    break;
                }
                else
                {
                    System.out.println("ERROR : Command not found");
                }
            }
            else if(QuerySize == 3)
            {
                if("select".equals(tokens[0]))
                {
                   if("max".equals(tokens[1]))
                   {
                        if("salary".equals(tokens[2]))
                        {
                            AggregateMax();
                        }
                        else
                        {
                            System.out.println("ERROR : at word 3, after max use 'salary' as a word");
                        }
                   }
                    else if("min".equals(tokens[1]))
                   {
                        if("salary".equals(tokens[2]))
                        {
                            AggregateMin();
                        }
                        else
                        {
                            System.out.println("ERROR : at word 3, after min use 'salary' as a word");
                        }
                   }
                   else if("sum".equals(tokens[1]))
                   {
                        if("salary".equals(tokens[2]))
                        {
                            AggregateSum();
                        }
                        else
                        {
                            System.out.println("ERROR : at word 3, after sum use 'salary' as a word");
                        }
                   }
                   else if("avg".equals(tokens[1]))
                   {
                        if("salary".equals(tokens[2]))
                        {
                            AggregateAvg();
                        }
                        else
                        {
                            System.out.println("ERROR : at word 3, after avg use 'salary' as a word");
                        }
                   }
                   else if("count".equals(tokens[1]))
                   {
               	          CountCity(tokens[2]);
                   }
                   else
                   {
                       System.out.println("ERROR : Check at word 2, only use this words('max','min','sum','avg','count')");
                   }
                }
                else
                {
                    System.out.println("ERROR : at word 1, use 'select' as a word");
                }
            }
            else if(QuerySize == 4)
            {
            	if("select".equals(tokens[0]))
            	{
            		if("*".equals(tokens[1]))
                   	{
            			if("from".equals(tokens[2]))
                    	{
            			    if("student".equals(tokens[3]))
            	            {
            		            DisplayAll();
            	            }
            	            else
                            {
                                System.out.println("ERROR : at word 4, after 'form' use 'student' as a word");
                            }
            	        }
            	        else
                        {
                            System.out.println("ERROR : at word 3, after '*' use 'from' as a word");
                        }
            	    }
            	    else
                    {
                        System.out.println("ERROR : at word 2, after 'select' use '*' Symbol");
                    }
            	}
            	else
                {
                    System.out.println("ERROR : at word 1, use 'select' as a word");
                }
            }
            else if(QuerySize == 8)
            {
                if("select".equals(tokens[0]))
                {
                    if("*".equals(tokens[1]))
                    {
                        if("from".equals(tokens[2]))
                        {
                            if("student".equals(tokens[3]))
                            {
                                if("where".equals(tokens[4]))
                                {
                                    if("name".equals(tokens[5]))
                                    {
                                        if("=".equals(tokens[6]))
                                        {
                                            DisplaySpecificName(tokens[7]);
                                        }
                                        else
                                        {
                                            System.out.println("ERROR : at word 7, after 'name' use '=' ");
                                        }
                                    }
                                    else if("rid".equals(tokens[5]))
                                    {
                                        if("=".equals(tokens[6]))
                                        {
                                            DisplaySpecificRid(Integer.parseInt(tokens[7]));
                                        }
                                       else if("<".equals(tokens[6]))
               	                    {
               		                        LessRidDis(Integer.parseInt(tokens[7]));
                                       }
                                       else if("<=".equals(tokens[6]))
               	                    {
               		                        LessRidDis1(Integer.parseInt(tokens[7]));
                                       }
                                       else if(">".equals(tokens[6]))
                                      {
               	                            MoreRidDis(Integer.parseInt(tokens[7]));
                                       }
                                       else if(">=".equals(tokens[6]))
                                      {
               	                            MoreRidDis1(Integer.parseInt(tokens[7]));
                                       }
                                       else
                                       {
                                       	   System.out.println("ERROR : at word 7, check entered symbols are '=' , '<' , '>' ");
                                       }
                                    }
                                    else if("city".equals(tokens[5]))
                                    {
                                        if("=".equals(tokens[6]))
                                        {
                                            DisplaySpecificCity(tokens[7]);
                                        }
                                       
                                       else
                                       {
                                       	   System.out.println("ERROR : at word 7, after 'city' use '=' symbol  ");
                                       }
        
                                    }
                                    else if("age".equals(tokens[5]))
                                    {
                                        if("=".equals(tokens[6]))
                                        {
                                            DisplaySpecificAge(Integer.parseInt(tokens[7]));
                                        }
                                         else if("<".equals(tokens[6]))
               	                        {
               		                        LessAgeDis(Integer.parseInt(tokens[7]));
                                           }
                                           else if("<=".equals(tokens[6]))
               	                        {
               		                        LessAgeDis1(Integer.parseInt(tokens[7]));
                                           }
                                          else if(">".equals(tokens[6]))
                                      	{
               	                            MoreAgeDis(Integer.parseInt(tokens[7]));
                                          }
                                          else if(">=".equals(tokens[6]))
                                      	{
               	                            MoreAgeDis1(Integer.parseInt(tokens[7]));
                                          }
                                           else
                                          {
                                       	   System.out.println("ERROR : at word 7, check entered symbols are '=' , '<' , '<=', '>', '>=' ");
                                          }
                                    }
                                    else if("salary".equals(tokens[5]))
                                    {
                                           if("=".equals(tokens[6]))
               	                        {
               		                        DisplaySpecificSalary(Integer.parseInt(tokens[7]));
                                           }
                                           else if("<".equals(tokens[6]))
               	                        {
               		                        LessSalaryDis(Integer.parseInt(tokens[7]));
                                           }
                                           else if(">".equals(tokens[6]))
                                           {
               	                            MoreSalaryDis(Integer.parseInt(tokens[7]));
                                           }
                                           else if("<=".equals(tokens[6]))
               	                        {
               		                        LessSalaryDis2(Integer.parseInt(tokens[7]));
                                           }
                                            else if(">=".equals(tokens[6]))
                                           {
               	                            MoreSalaryDis1(Integer.parseInt(tokens[7]));
                                           }
                                          else
                                          {
                                              System.out.println("ERROR : at word 7, check entered symbols are '=', '<' , '<=', '>', '>=' ");
                                          }
                                    }
                                    else
                                    {
                                        System.out.println("ERROR : at word 6, check words are between 'name', 'rid', 'city','salary', 'age' ");
                                    }
                                }
                                else
                                {
                                     System.out.println("ERROR : at word 5, after 'student' use 'where' as a word");
                                }
                            }
                            else
                            {
                                System.out.println("ERROR : at word 4, after 'form' use 'student' as a word");
                            }
                        }
                        else
                        {
                            System.out.println("ERROR : at word 3, after '*' use 'from' as a word");
                        }
                    }
                    else
                    {
                       System.out.println("ERROR : at word 2, after 'select' use '*' Symbol"); 
                    }
                }
                else
                {
                    System.out.println("ERROR : at word 1, use 'select' as a word");
                }
            }
            else if(QuerySize == 10)
            {
            	if("select".equals(tokens[0]))
            	{
            		if("*".equals(tokens[1]))
                   	{
            			if("from".equals(tokens[2]))
                    	{
            			    if("student".equals(tokens[3]))
                        	{
            		            if("where".equals(tokens[4]))
            		            {
            		                if("salary".equals(tokens[5]))
                                    {
                                	    if("between".equals(tokens[6]))
                                	    {
                                	  	    if("and".equals(tokens[8]))
                                	     	{
                                	  		    BetweenSalaryDis(Integer.parseInt(tokens[7]),Integer.parseInt(tokens[9]));
                                	     	}
                                	     	else
                                            {
                                                System.out.println("ERROR : at word 9, use 'and' ");
                                            }
                                	    }
                                	    else
                                        {
                                            System.out.println("ERROR : at word 7, use 'between' as a word");
                                        }
                                    }
            		                else if("age".equals(tokens[5]))
                                    {
                                	    if("between".equals(tokens[6]))
                                	    {
                                	  	    if("and".equals(tokens[8]))
                                	  	    {
                                	  		    BetweenAgeDis(Integer.parseInt(tokens[7]),Integer.parseInt(tokens[9]));
                                	  	    }
                                	  	    else
                                            {
                                                System.out.println("ERROR : at word 9, use 'and' ");
                                            }
                                	    }
                                	    else
                                        {
                                            System.out.println("ERROR : at word 7, use 'between' as a word");
                                        }
 
                                    }
                                    else if("rid".equals(tokens[5]))
                                    {
                                	    if("between".equals(tokens[6]))
                                	    {
                                	  	    if("and".equals(tokens[8]))
                                	  	    {
                                	  		    BetweenRIDDis(Integer.parseInt(tokens[7]),Integer.parseInt(tokens[9]));
                                	  	    }
                                	  	    else
                                            {
                                                System.out.println("ERROR : at word 9, use 'and' ");
                                            }
                                	    }
                                	    else
                                        {
                                            System.out.println("ERROR : at word 7, use 'between' as a word");
                                        }
 
                                    }
                                    else
                                    {
                                        System.out.println("ERROR : at word 6, check entered words are 'salary' or 'age' or 'rid'");
                                    }
            		            }
                                else
                                {
                                     System.out.println("ERROR : at word 5, after 'student' use 'where' as a word");
                                }
                            }
                            else
                            {
                                System.out.println("ERROR : at word 4, after 'form' use 'student' as a word");
                            }
                        }
                        else
                        {
                            System.out.println("ERROR : at word 3, after '*' use 'from' as a word");
                        }
                    }
                    else
                    {
                       System.out.println("ERROR : at word 2, after 'select' use '*' Symbol"); 
                    }
                }
                else
                {
                    System.out.println("ERROR : at word 1, use 'select' as a word");
                }
            }
            else if(QuerySize == 11)
            {
            	if("update".equals(tokens[0]))
            	{
            		if("table".equals(tokens[1]))
            		{
            			if("student".equals(tokens[2]))
            			{
            				if("set".equals(tokens[3]))
            				{
            					if("name".equals(tokens[4]))
            					{
            						if("=".equals(tokens[5]))
            						{
            							if("where".equals(tokens[7]))
            							{
            								if("rid".equals(tokens[8]))
            								{
            									if("=".equals(tokens[9]))
            									{
            										Update(Integer.parseInt(tokens[10]),tokens[6]);
            									}
            									else
                                                {
                                                    System.out.println("ERROR : at word 10, use '=' symbol");
                                                }
            								}
            								else if("name".equals(tokens[8]))
            								{
            									if("=".equals(tokens[9]))
            									{
            										NUpdate((tokens[10]),tokens[6]);
                                                }
                                                else
                                                {
                                                    System.out.println("ERROR : at word 10, use '=' symbol");
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("ERROR : at word 9, after 'where' use 'name'");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("ERROR : at word 8, use 'where'");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("ERROR : at word 6, use '=' symbol");
                                    }
            					}
                            	else if("age".equals(tokens[4]))
            					{
            						if("=".equals(tokens[5]))
            						{
            							if("where".equals(tokens[7]))
            							{
            								if("rid".equals(tokens[8]))
            								{
            									if("=".equals(tokens[9]))
            									{
            										UpdateAge(Integer.parseInt(tokens[10]),Integer.parseInt(tokens[6]));
                                                    
                                                }
                                                else
                                                {
                                                    System.out.println("ERROR : at word 10, use '=' symbol");
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("ERROR : at word 9, after 'where' use 'rid'");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("ERROR : at word 8, use 'where'");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("ERROR : at word 6, use '=' symbol");
                                    }
            					}
            					else if("city".equals(tokens[4]))
            					{
            						if("=".equals(tokens[5]))
            						{
            							if("where".equals(tokens[7]))
            							{
            								if("rid".equals(tokens[8]))
            								{
            									if("=".equals(tokens[9]))
            									{
            										UpdateCity(Integer.parseInt(tokens[10]),(tokens[6]));
            									}
            									else
                                                {
                                                    System.out.println("ERROR : at word 10, use '=' symbol");
                                                }
            								}
            								else
                                            {
                                                System.out.println("ERROR : at word 9, after 'where' use 'rid'");
                                            }
            							}
            							else
                                        {
                                            System.out.println("ERROR : at word 8, use 'where'");
                                        }
            						}
            						else
                                    {
                                        System.out.println("ERROR : at word 6, use '=' symbol");
                                    }
            					}
            					else
                                {
                                    System.out.println("ERROR : at word 5, check entered word are 'name' , 'age' , city");
                                }
                            }
                            else
                            {
                                System.out.println("ERROR : at word 4, after 'student' use 'set'");
                            }
            			}
            			else
                        {
                            System.out.println("ERROR : at word 3, after 'table' use 'student' ");
                        }
            		}
            		else
                    {
                        System.out.println("ERROR : at word 2, after 'update' use 'table' ");
                    }
            	}
            	else
                {
                    System.out.println("ERROR : at word 1, use 'update' as a word");
                }
            }
            else if(QuerySize == 12)
            {
                if("select".equals(tokens[0]))
                {
                    if("*".equals(tokens[1]))
                    {
                        if("from".equals(tokens[2]))
                        {
                            if("student".equals(tokens[3]))
                            {
                                if("where".equals(tokens[4]))
                                {
                                    if("name".equals(tokens[5]))
                                    {
                                        if("=".equals(tokens[6]))
                                        {
                                            if("and".equals(tokens[8]))
                                            {
                                                if("age".equals(tokens[9]))
                                                {
                                                    if("=".equals(tokens[10]))
                                                    {
                                                        DisplaySpecificNaANDAg(tokens[7],Integer.parseInt(tokens[11]));
                                                    }
                                                    else
                                                    {
                                                        System.out.println("ERROR : at word 11, use '=' symbol");
                                                    }
                                                }
                                                else if("city".equals(tokens[9]))
                                                {
                                                    if("=".equals(tokens[10]))
                                                    {
                                                        DisplaySpecificNAANDCi(tokens[7],tokens[11]);
                                                    }
                                                    else
                                                    {
                                                        System.out.println("ERROR : at word 11, use '=' symbol");
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("ERROR : at word 10, use 'city'");
                                                }
                                            }
                                            else if("or".equals(tokens[8]))
                                            {
                                                if("age".equals(tokens[9]))
                                                {
                                                    if("=".equals(tokens[10]))
                                                    {
                                                        DisplaySpecificNaORAg(tokens[7],Integer.parseInt(tokens[11]));
                                                    }
                                                    else
                                                    {
                                                        System.out.println("ERROR : at word 11, use '=' symbol");
                                                    }
                                                }
                                                else if("city".equals(tokens[9]))
                                                {
                                                    if("=".equals(tokens[10]))
                                                    {
                                                        DisplaySpecificNaORCi(tokens[7],tokens[11]);
                                                    }
                                                    else
                                                    {
                                                        System.out.println("ERROR : at word 11, use '=' symbol");
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("ERROR : at word 10, use 'city'");
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("ERROR : at word 9, check entered symbol are 'and' , 'or' ");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("ERROR : at word 7, use '=' symbol");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("ERROR : at word 6, check words are between 'name','rid','city','salary'");
                                    }
                                }
                                else
                                {
                                     System.out.println("ERROR : at word 5, after 'student' use 'where' as a word");
                                }
                            }
                            else
                            {
                                System.out.println("ERROR : at word 4, after 'form' use 'student' as a word");
                            }
                        }
                        else
                        {
                            System.out.println("ERROR : at word 3, after '*' use 'from' as a word");
                        }
                    }
                    else
                    {
                       System.out.println("ERROR : at word 2, after 'select' use '*' Symbol"); 
                    }
                }
                else
                {
                    System.out.println("ERROR : at word 1, use 'select' as a word");
                }
            }
            // Delete from student  where  rid = 3
            else if(QuerySize == 7)
            {
                // Insert into student Piyush 10000 32 Pune;
              
                if("insert".equals(tokens[0]))
                {
                    if("into".equals(tokens[1]))
                    {
                        if("student".equals(tokens[2]))
                        {
                            InsertData(tokens[3],Integer.parseInt(tokens[4]),Integer.parseInt(tokens[5]),tokens[6]);
                        }
                        else
                        {
                        	System.out.println("ERROR : at word 3, after 'into' use 'student' ");
                        }
                    }
                    else
                    {
                    	System.out.println("ERROR : at word 2, after 'insert'' use 'into' ");
                    }
                }
                else if("delete".equals(tokens[0]))
                {
                	if("from".equals(tokens[1]))
                	{
                		if("student".equals(tokens[2]))
                		{
                			if("where".equals(tokens[3]))
                	     	{
                			    if("rid".equals(tokens[4]))
                		        {
                			        if("=".equals(tokens[5]))
                	                {
                			            DeleteSpecific(Integer.parseInt(tokens[6]));
                	                }
                	                else
                	                {
                	                	System.out.println("ERROR : at word 6, use '=' symbol");
                	                }
                           	 }
                           	 else if("name".equals(tokens[4]))
                		        {
                			        if("=".equals(tokens[5]))
                	                {
                			            DeleteSpecific(tokens[6]);
                	                }
                	                else
                	                {
                	                	System.out.println("ERROR : at word 6, use '=' symbol");
                	                }
                		        }
                		        else
                		        {
                		        	System.out.println("ERROR : at word 5, after 'where' use 'name' ");
                		        }
                	     	}
                	     	else
                	     	{
                	     		System.out.println("ERROR : at word 4, after 'student' use 'where' ");
                	     	}
                		}
                		else
                		{
                			System.out.println("ERROR : at word 3, after 'from' use 'student' ");
                		}
                	}
                	else
                	{
                		System.out.println("ERROR : at word 2, after 'delete' use 'from'");
                	}
                }
                else
                {
                	System.out.println("ERROR : at word 1, check entered word are 'insert' , 'delete' ");
                }
            }
            else
            {
    	        System.out.println("ERROR : Query is not correct");
            }
            // update table student set name = updated_name  
        }
        
    }
    
    // Insert into query
    public void InsertData(String str, int value, int age, String str1)
    {
        Student sobj = new Student(str,value,age,str1);
        lobj.add(sobj);
        System.out.println("Query inserted successfully...");
    }
    
    // Update Name using RID
    public void Update(int rid, String name)
    {
        for(Student sref : lobj)
        {
            if(sref.RID == rid)
            {
                sref.Name = name;
            }
        }
        System.out.println("Query updated successfully...");
    }

    // Update Name using name
    public void NUpdate(String Cname,String Uname)
    {
        for(Student sref : lobj)
        {
            if(Cname.equals(sref.Name))
            {
                sref.Name = Uname;
            }
        }
        System.out.println("Query updated successfully...");

    }
    
    // Update Age using RID
     public void UpdateAge(int no1, int no2)
    {
        for(Student sref : lobj)
        {
            if(sref.RID == no1)
            {
                sref.Age = no2;
            }
        }
        
        System.out.println("Query updated successfully...");

    }
    
    // Update City using RID
    public void UpdateCity(int no1, String str)
    {
        for(Student sref : lobj)
        {
            if(sref.RID == no1)
            {
                sref.City = str;
            }
        }
        System.out.println("Query updated successfully...");

    }

   // Display all without condition
    public void DisplayAll()
    {
    	System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
    
        for(Student sref : lobj)
        {
            sref.DisplayData();
        }
    }

    // Display by RID
    public void DisplaySpecificRid(int rid)
    {
       
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
    
        for(Student sref : lobj)
        {
            if(sref.RID == rid)
            {
                sref.DisplayData();
                break;
            }
        }
    }
    
    // Display by Age
    public void DisplaySpecificAge(int age)
    {
       
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
    
        for(Student sref : lobj)
        {
            if(sref.Age == age)
            {
                sref.DisplayData();
            }
        }
    }

     // Display by Salary
    public void DisplaySpecificSalary(int salary)
    {
       
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
    
        for(Student sref : lobj)
        {
            if(sref.Salary == salary)
            {
                sref.DisplayData();
            }
        }
    }

    // Display by name
    public void DisplaySpecificName(String str)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
    
        for(Student sref : lobj)
        {
            if(str.equals(sref.Name))
            {
                sref.DisplayData();
            }
        }
    }
    


    // Display by less Salary Count
    public void LessSalary1(int no)  // count less salary
    {
        int iCount = 0;
         
        for(Student sref : lobj)
        {
         	if(sref.Salary < no)
         	{
         		iCount++;
         	}
        }
            System.out.println("-------------------------");
            System.out.printf("|\tCount(City)\t|\n");
            System.out.println("-------------------------");
            System.out.println("|\t"+iCount+"\t\t|");
            System.out.println("-------------------------");
    } 
   
   // Display by lessorequal  Salary Count
    public void LessSalaryDis2(int no)  // count less salary
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
         
        for(Student sref : lobj)
        {
         	if(sref.Salary <= no)
         	{
         		sref.DisplayData();
         	}
        }
            
    } 

    
      // Display by less RID Records
     public void LessRidDis(int no)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj)
        {
         	if(sref.RID < no)
         	{
         		sref.DisplayData();
         	}
        }
        
     }
     
     // Display by lessorequal RID Records
     public void LessRidDis1(int no)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj)
        {
         	if(sref.RID <= no)
         	{
         		sref.DisplayData();
         	}
        }
    }
        
     
    
    // Display by More RID Records
    public void MoreRidDis(int no)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj)
        {
         	if(sref.RID > no)
         	{
         		sref.DisplayData();
         	}
        }
    }
    
     // Display by Moreorequal RID Records
    public void MoreRidDis1(int no)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj)
        {
         	if(sref.RID >= no)
         	{
         		sref.DisplayData();
         	}
        }
    }
    
    // Display by less Age Records
     public void LessAgeDis(int no)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj)
        {
         	if(sref.Age < no)
         	{
         		sref.DisplayData();
         	}
        }
           
    }
    
    // Display by lessorequal Age Records
     public void LessAgeDis1(int no)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj)
        {
         	if(sref.Age <= no)
         	{
         		sref.DisplayData();
         	}
        }
           
    }
    
    // Display by More Age Records
    public void MoreAgeDis(int no)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj)
        {
         	if(sref.Age > no)
         	{
         		sref.DisplayData();
         	}
        }
    }
    
    // Display by Moreorequal Age Records
    public void MoreAgeDis1(int no)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj)
        {
         	if(sref.Age >= no)
         	{
         		sref.DisplayData();
         	}
        }
    }
    
    //  Display by less Salary Records
    public void LessSalaryDis(int no)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj)
        {
         	if(sref.Salary < no)
         	{
         		sref.DisplayData();
         	}
        }
           
    }

    // Display by More Salary Records
    public void MoreSalaryDis(int no)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj)
        {
         	if(sref.Salary > no)
         	{
         		sref.DisplayData();
         	}
        }
    }
    
    // Display by Moreorequal Salary Records
    public void MoreSalaryDis1(int no)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj)
        {
         	if(sref.Salary >= no)
         	{
         		sref.DisplayData();
         	}
        }
    }
    
    // Display Salary (Use Between)
    public void BetweenSalaryDis(int no1, int no2)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
        for(Student sref : lobj)
        {
         	if((sref.Salary <= no1)&&(sref.Salary >= no2 ))
         	{
         		sref.DisplayData();
         	}
        }
    }
    
    // Display Age (Using Between)
    public void BetweenAgeDis(int no1, int no2)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
         
            for(Student sref : lobj)
            {
             	if((sref.Age <= no1)&&(sref.Age >= no2 ))
         	    {
         		    sref.DisplayData();
         	    }
            }
    }
    
    // Display RID (Using Between)
    public void BetweenRIDDis(int no1, int no2)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
         
            for(Student sref : lobj)
            {
             	if((sref.RID <= no1)&&(sref.RID >= no2 ))
         	    {
         		    sref.DisplayData();
         	    }
            }
    }
    
    // Display by City
    public void DisplaySpecificCity(String str)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
    
        for(Student sref : lobj)
        {
            if(str.equals(sref.City))
            {
                sref.DisplayData();
            }
        }
    }

    // Display Specific Name and Age
    public void DisplaySpecificNaANDAg(String str, int age)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
    
         for(Student sref : lobj)
        {
            if((str.equals(sref.Name)) && (sref.Age == age))
            {
                sref.DisplayData();
            }
        }
    }

    // Display specific Name And City (Using AND)
    public void DisplaySpecificNAANDCi(String str, String city)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
    
        for(Student sref : lobj)
        {
            if((str.equals(sref.Name)) &&(city.equals(sref.City)))
            {
                sref.DisplayData();
            }
        }
    }

    // Display specific Name or Age (Using OR)
    public void DisplaySpecificNaORAg(String str, int age)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
    
        for(Student sref : lobj)
        {
            if((str.equals(sref.Name)) || (sref.Age == age))
            {
                sref.DisplayData();
            }
        }
    }

    // Display specific Name or City (Using OR)
    public void DisplaySpecificNaORCi(String str, String city)
    {
         
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
    
        for(Student sref : lobj)
        {
            if((str.equals(sref.Name)) || (city.equals(sref.City)))
            {
                sref.DisplayData();
            }
        }
    }

    // Delete by RID
    public void DeleteSpecific(int rid)
    {
        int index = 0;

        for(Student sref : lobj)
        {
            if(sref.RID == rid)
            {
                lobj.remove(index);
                break;
            }
            index++;
        }
        System.out.println("Query deleted successfully...");
    }

    // Delete by Name
    public void DeleteSpecific(String str)
    {
        int index = 0;

        for(Student sref : lobj)
        {
            if(str.equals(sref.Name))
            {
                lobj.remove(index);  //* */
                break;
            }
            index++;
        }
        System.out.println("Query deleted successfully...");
    }
    
    // Display by Maximum  Salary 
    public void AggregateMax()
    {
        int iMax = 0;
        Student temp = null;
         
        for(Student sref : lobj)
        {
            if(sref.Salary > iMax)
            {
                iMax = sref.Salary;
                temp = sref;
            }
        }

        System.out.println("Information of student having maximum salary : ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
        System.out.println("---------------------------------------------------------------------------------");
       
        temp.DisplayData();
    }
    
    // Display by Minimum  Salary
    public void AggregateMin()
    {
        int iMin = (lobj.getFirst()).Salary;
        Student temp = lobj.getFirst();

        for(Student sref : lobj)
        {
            if(sref.Salary < iMin)
            {
                iMin = sref.Salary;
                temp = sref;
            }
        }

            System.out.println("Information of student having minimum salary : ");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.printf("|\tRID\t|\tName\t|\tSalary\t|\tAge\t|\tCity\t|\n");
            System.out.println("---------------------------------------------------------------------------------");
        
            temp.DisplayData();
    }

    // Display by Sum of Salary
    public void AggregateSum()
    {
        long iSum = 0;
      
        for(Student sref : lobj)
        {
            iSum = iSum + sref.Salary;
        } 

            System.out.println("-------------------------");
            System.out.printf("|\tSalary(sum)\t|\n");
            System.out.println("-------------------------");
            System.out.println( "|\t"+iSum+"\t\t|");
            System.out.println("-------------------------");
    }

    // Display by Average of Salary
    public void AggregateAvg()
    {
        long iSum = 0;
         
        for(Student sref : lobj)
        {
            iSum = iSum + sref.Salary;
        }
        
            System.out.println("-------------------------");
            System.out.printf("|\tSalary(Avg)\t|\n");
            System.out.println("-------------------------");
            System.out.println("|\t"+iSum / (lobj.size())+"\t\t|");
            System.out.println("-------------------------");
    }
    
    // Display count of Records
    public void AggregateCount()
    {
         System.out.println("-------------------------");
        System.out.printf("|\tCount(Record)\t|\n");
         System.out.println("-------------------------");
         System.out.println("|\t"+lobj.size()+"\t\t|");
         System.out.println("-------------------------");
    }
    
    // Display count of city
    public void CountCity(String city)
    {
         int iCount = 0;
         
         for(Student sref : lobj)
         {
         	if(city.equals(sref.City))
         	{
         		iCount++;
         	}
         }
         
         System.out.println("-------------------------");
         System.out.printf("|\tCount(City)\t|\n");
         System.out.println("-------------------------");
         System.out.println("|\t"+iCount+"\t\t|");
         System.out.println("-------------------------");
    }
}

class CVDB
{
    public static void main(String arg[])
    {
        DBMS dobj = new DBMS();

        dobj.StartDBMS();
    }
}
