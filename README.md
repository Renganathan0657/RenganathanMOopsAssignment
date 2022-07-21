# RenganathanMOopsAssignment



Problem Statement

→ The assignment will contain 4 departments as four different object classes

                i) Super Department
               ii) Admin Department
               iii) Hr Department
               iv) Tech Department

→ Super Department class will be the superclass and all other departments must extend it.

→ Super department will contain 4 methods of return type String and will not accept any parameter
               i)  departmentName 
              ii)  getTodaysWork  
              iii) getWorkDeadline
              iv) isTodayAHoliday

departmentName will return “ Super Department “
getTodaysWork will return  “ No Work as of now”
getWorkDeadline will return “ Nil “
isTodayAHoliday will return “ Today is not a holiday”

→ Admin department will contain 3 methods of return type String and will not accept any parameter
               i)  departmentName 
              ii)  getTodaysWork  
              iii) getWorkDeadline
              
departmentName will return “ Admin Department “
getTodaysWork will return “Complete your documents Submission”
getWorkDeadline will return “ Complete by EOD “


→ Hr department will contain 4 methods of return type String and will not accept any parameter
               i)  departmentName 
              ii)  getTodaysWork  
              iii) getWorkDeadline
              iv) doActivity

departmentName will return “ Hr Department “
getTodaysWork will return  “ Fill today’s worksheet and mark your attendance”
getWorkDeadline will return “ Complete by EOD “
doActivity “team Lunch”

→ Tech department will contain 4 methods of return type String and will not accept any parameter
               i)  departmentName 
              ii)  getTodaysWork  
              iii) getWorkDeadline
              iv) getTechStackInformation

departmentName will return “ Tech Department “
getTodaysWork will return  “ Complete coding of module 1”
getWorkDeadline will return “ Complete by EOD “
getTechStackInformation will return “core Java”

→ Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment
→ Each department will display all its functionalities.
→ Each department  will display whether today is a holiday or not with the help of the Super Department. (SuperDepartment will act as a super class for all the departments)
