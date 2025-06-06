mkdir git-demo-project
cd git-demo-project
git init

echo "Initial content in main branch" > feature.txt
git add feature.txt
git commit -m "Initial commit on main branch"

git checkout -b feature-branch   # Create and switch to feature branch
echo "Added new feature from feature-branch" >> feature.txt
git add feature.txt
git commit -m "Added new feature"

git checkout main
echo "Conflicting change from main branch" >> feature.txt
git add feature.txt
git commit -m "Conflicting change on main branch"

git merge feature-branch

git add feature.txt
git commit -m "Resolved merge conflict"

git diff HEAD~1 HEAD  # Compare last commit with previous

echo "Temporary changes not ready to commit" > temp.txt
git add temp.txt
git stash  # Save uncommitted changes

git stash list       # View stash list
git stash pop        # Apply and remove latest stash

echo "Another change" > another.txt
git stash            # Another stash

git stash list       # Check stash IDs
git stash apply stash@{1}   # Apply a specific stash

git stash clear

ls
# Output:
# feature.txt
# temp.txt
# another.txt
