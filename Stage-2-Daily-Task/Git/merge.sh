# 1) Display the current branch name to ensure you are in the master branch
git branch

# 2) Pull the DEV_payment branch from the remote origin
git fetch origin
git pull origin DEV_payment




# 3) Switch to the DEV_payment branch (this will track the remote branch and add its files locally)
git checkout DEV_payment

# 4) Switch to the DEV_feature branch
git checkout DEV_feature

# 5) Merge the DEV_payment branch into the DEV_feature branch
git merge DEV_payment