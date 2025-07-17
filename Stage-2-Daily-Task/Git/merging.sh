# 1) Display the current branch name (assuming we start in DEV_feature, not master)
git branch

# 2) Merge the master branch into DEV_feature
git merge master

# 3) Display the difference in Employee.java to identify the conflict
git diff Employee.java





# 1) Modify Employee.java (manual step; edit the file to resolve conflicts)
# Resolved Employee.java should include both empid and name:
# public class Employee {
#     int empid;
#     String name;
# }

# 2) Add Employee.java to Git staging area
git add Employee.java

# 3) Commit the resolved Employee.java with the specified message
git commit -m "Employee is in sync with branch"

# 4) No additional merge command needed, as the commit completes the merge
# If required by the assessment, explicitly continue the merge
git merge --continue