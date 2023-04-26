# validation-Assignment

## Framework -  **Spring boot**   
## language used - **java**

## Data Flow-
          * controller, model, repositry, service this packages create.
          * using @Autowired create object of perticular class.
          *first @Autowired TodoServices class and @Service is added.
          *after service packages Userservice class Autowired with userDao class which is present in repositry.
  
  
## 1.Controller-
                1.controller have all end point to call api.
                2.controller Autowired with UserService class which is present in service class.
                3. we call get,put,push,delete using annotation
  
  ## 2.service-
              1.service have bussiness logic.
              2.Userservice class Autowired with TodoDao.
              3. we create method-addNew,getAll,getUserByid,updateUser,deleteUserById in service class which has proper working.
   
 ## 3.repositry-
               1. in this we have TodoList ArrayList whic store data in User formate.
               2.using UserDao contructor we add one user object when we call UserDao class .
               3.in this we have -getTodosFromDataSource,save,remove,update implementation.
     
 ## 4.model-
           1. model package has User class.
           2. which User class have all atrributes that we want .
           3. validations used in user class like- @Not null,@Not empty,@email,@size,@Pattern
           3. model package which have User class has all attributes -
              1.userid
              2.username
              3.DateOfBirth
              4.email
              5.Phone_Number
              6.Date
              7.Time
           
   
  ## Summary-
           * In this project i have add user object using postmapping
           * using getmapping i get all data of the list,
           * using delete mapping i delete a one todo object.
           * using putmapping i have change address using userId.
           * ToDo class has all geters and setters of its properties and also constructor is call when ToDo ArrayList call.
  
 
 
 ## DataStructure used-
            * equal method used when putMapping and deleteMapping used .
            * using if condition i checked userid is equal to .getuserid present in databases and change or get or delete them.
            * Validation used Not null,Pattern regex date and time,email and size.
