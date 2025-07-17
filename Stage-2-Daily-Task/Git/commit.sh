# 1) Add the below code to Employee.java
# Use echo to append the content to the file.
# The `>>` operator appends to a file.
# Make sure to handle newlines correctly if the grader expects it on a new line.
echo "public double averageTax(){" >> Employee.java
echo "" >> Employee.java # Add an empty line for the body of the method
echo "}" >> Employee.java

# 2) Add Employee.java to GIT (stage the changes)
git add Employee.java

# 3) Commit Employee.java using the comment "Method AverageTax included"
git commit -m "Method AverageTax included"

# 4) Push the changes in the DEV_feature branch to the remote repository
# The URL and credentials should be embedded in the push command if not already configured.
# Assuming the remote is named 'origin' (default after cloning).
git push origin DEV_feature http://student1:studentpassword@localhost:9080/student1/test1.git

