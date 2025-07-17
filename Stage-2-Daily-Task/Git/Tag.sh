#!/bin/bash

# 1) Initialize git
git init

# 2) Add ONLY Employee.java and Driver.java to git
git add Employee.java Driver.java

# 3) Commit these 2 files using the comment "Initial commit Employee and Driver.java"
git commit -m "Initial commit Employee and Driver.java"






#!/bin/bash

# 4) Create a branch named "DEV_feature"
git branch DEV_feature

# 5) Switch to the new branch using checkout
git checkout DEV_feature

# 6) Add the specified code to Employee.java (manual step; assuming the file is edited separately)
# The code to add to Employee.java is:
# public class Employee {
#     String name;
#     int id;
#     String designation;
#     double salary;
#     long phoneNo;
# }

# 7) Add Employee.java to Git
git add Employee.java

# 8) Commit Employee.java with the comment "Employee with additional attributes"
git commit -m "Employee with additional attributes"

# 9) Create a tag named projectv1.1 with the tag message "Project Starter Code"
git tag -a projectv1.1 -m "Project Starter Code"

# 10) Create a new file EmployeeUtil.java (manual step; assuming the file is created separately)
# The code to add to EmployeeUtil.java is:
# public class EmployeeUtil {
#     public void sortEmployee(List<Employee> empList){
#     }
# }

# 11) Add EmployeeUtil.java ONLY to Git
git add EmployeeUtil.java

# 12) Commit EmployeeUtil.java with the comment "Added EmployeeUtil"
git commit -m "Added EmployeeUtil"

# 13) Create a tag named projectv1.2 with the tag message "Project With EmployeeUtil"
git tag -a projectv1.2 -m "Project With EmployeeUtil"