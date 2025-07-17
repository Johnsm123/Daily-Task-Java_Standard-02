
Description
Write a shell script to find the largest among three numbers. Get user inputs and display the result.

Sample Input 1:

10

20

30

Sample Output 1:

30 is largest number

Sample Input 2:

10

10

10

Sample Output 2:

All the three numbers are equal

Sample Input 3:

10

10

 1

Sample Output 3:

I cannot figure out which number is largest

#!/bin/bash

# Read three numbers from the user
read -p "Enter first number: " num1
read -p "Enter second number: " num2
read -p "Enter third number: " num3

# Check if all three numbers are equal
if [[ "$num1" -eq "$num2" && "$num2" -eq "$num3" ]]; then
    echo "All the three numbers are equal"
# Check if we can clearly find the largest number
elif [[ "$num1" -gt "$num2" && "$num1" -gt "$num3" ]]; then
    echo "$num1 is largest number"
elif [[ "$num2" -gt "$num1" && "$num2" -gt "$num3" ]]; then
    echo "$num2 is largest number"
elif [[ "$num3" -gt "$num1" && "$num3" -gt "$num2" ]]; then
    echo "$num3 is largest number"
else
    # Covers cases where there is no clear "largest" number, e.g. two equal largest values
    echo "I cannot figure out which number is largest"
fi


Description
Write a shell script to print numbers as 5 4 3 2 1 using while loop.

Sample output:

5

4

3

2

1





#!/bin/bash

num=5

while [ $num -ge 1 ]
do
  echo $num
  ((num--))
done



Description
Write a shell script to print the given number in reverse order.  Get input from user and display the result. In case of negative number is given as input, display "Not a positive number" as output.



Sample Input 1:

123

Sample Output 1:

Reverse number is 321

Sample Input 1:

-123

Sample Output 1:

Not a positive number

#!/bin/bash

read -p "Enter a number: " num

# Check if number is positive (greater than or equal to 0)
if [[ "$num" =~ ^- ]]; then
    echo "Not a positive number"
else
    # Reverse the number
    reversed=$(echo "$num" | rev)
    echo "Reverse number is $reversed"
fi




#!/bin/bash

# Read input number from user
echo "Enter a number:"
read num

# Check if the number is negative
if [ $num -lt 0 ]; then
    echo "Not a positive number"
else
    # Initialize sum
    sum=0

    # Convert number to string to process each digit
    num_str="$num"

    # Loop through each digit
    for ((i=0; i<${#num_str}; i++)); do
        # Extract single digit and add to sum
        digit=${num_str:$i:1}
        sum=$((sum + digit))
    done

    # Display result
    echo "Sum of digit for given number is $sum"
fi


#!/bin/bash

# Check if file name is provided as command line argument
if [ $# -ne 1 ]; then
    echo "Usage: $0 <filename>"
    exit 1
fi

# Store filename from command line argument
filename="$1"

# Check if file exists
if [ ! -f "$filename" ]; then
    echo "Error: File '$filename' does not exist"
    exit 1
fi

# Count characters, words, and lines using wc
char_count=$(wc -m < "$filename")
word_count=$(wc -w < "$filename")
line_count=$(wc -l < "$filename")

# Display results
echo "Number of characters in $filename is $char_count"
echo "Number of words in $filename is $word_count"
echo "Number of lines in $filename is $line_count"


#!/bin/bash

# Check if a file name is given as argument
if [ $# -ne 1 ]; then
    echo "Usage: $0 <filename>"
    exit 1
fi

FILE=$1

# Check write permission
if [ -w "$FILE" ]; then
    echo "Write : yes"
else
    echo "Write : no"
fi

# Check read permission
if [ -r "$FILE" ]; then
    echo "Read : yes"
else
    echo "Read : no"
fi

# Check execute permission
if [ -x "$FILE" ]; then
    echo "Execute : yes"
else
    echo "Execute : no"
fi

# Check if it's a directory
if [ -d "$FILE" ]; then
    echo "Directory : yes"
else
    echo "Directory : no"
fi

#!/bin/bash

# Check if a filename is provided
if [ $# -ne 1 ]; then
    echo "Usage: $0 <filename>"
    exit 1
fi

FILE=$1

# Check if the file exists
if [ -e "$FILE" ]; then
    echo "File Exists!"

    # Check if file has both read and write permissions
    if [ -r "$FILE" ] && [ -w "$FILE" ]; then
        chmod 777 "$FILE"
        echo "File Permission has been changed"
    else
        echo "File does not have both read and write permissions"
    fi
else
    echo "File does not Exist"
fi


```bash
#!/bin/bash

# Create Mercuryproject directory
mkdir -p Mercuryproject

# Create and populate module1 file
cat > Mercuryproject/module1 << EOL
Linux is an open source operating system
Linux is a Unix based operating system
The various Linux distributions are fedora, ubuntu, Debian linux, etc.
EOL

# Create and populate module2 file
cat > Mercuryproject/module2 << EOL
raj:500:admin:/home/raj:/bin/bash
ajay:600:user:/home/ajay:/bin/bash
dane:700:admin:/home/dane:/bin/sh
gokul:800:user:/home/gokul:/bin/sh
EOL

# Check if module1 exists and process it
if [ -f "Mercuryproject/module1" ]; then
    # Copy lines containing "operating system" to OSfile
    grep "operating system" Mercuryproject/module1 > Mercuryproject/OSfile

    # Display content of OSfile
    echo "Content of OSfile:"
    cat Mercuryproject/OSfile

    # Create Unixfile by replacing Linux with Unix in module1
    sed 's/Linux/Unix/g' Mercuryproject/module1 > Mercuryproject/Unixfile
else
    echo "Error: module1 file does not exist"
fi

# Check if module2 exists and process it
if [ -f "Mercuryproject/module2" ]; then
    # Find admin users with bash shell and extract usernames
    grep ":admin:.*:/bin/bash" Mercuryproject/module2 | cut -d':' -f1 > Mercuryproject/Adminusers

    # Display content of Adminusers
    echo -e "\nContent of Adminusers:"
    cat Mercuryproject/Adminusers
else
    echo "Error: module2 file does not exist"
fi








#!/bin/bash

# Function to validate input as a positive integer
validate_input() {
    local input=$1
    if [[ "$input" =~ ^[0-9]+$ ]] && [ "$input" -gt 0 ]; then
        return 0  # Valid input
    else
        return 1  # Invalid input
    fi
}

# Get number of terms from command-line argument or user input
if [ $# -eq 0 ]; then
    echo "Enter the number of terms for the Fibonacci series:"
    read n
else
    n=$1
fi

# Validate input
if ! validate_input "$n"; then
    echo "Error: Please provide a positive integer"
    exit 1
fi

# Initialize first two Fibonacci numbers
a=0
b=1

# Handle special cases for n=1 or n=2
if [ "$n" -eq 1 ]; then
    echo "Fibonacci series: 0"
    exit 0
elif [ "$n" -eq 2 ]; then
    echo "Fibonacci series: 0 1"
    exit 0
fi

# Print first two numbers
echo -n "Fibonacci series: 0 1"

# Generate and print the rest of the series
for ((i=3; i<=n; i++)); do
    c=$((a + b))
    echo -n " $c"
    a=$b
    b=$c
done

# Add newline at the end
echo





#!/bin/bash

# Function to validate input as a non-negative integer
validate_input() {
    local input=$1
    if [[ "$input" =~ ^[0-9]+$ ]]; then
        return 0  # Valid input
    else
        return 1  # Invalid input
    fi
}

# Get number from command-line argument or user input
if [ $# -eq 0 ]; then
    echo "Enter a number to calculate its factorial:"
    read n
else
    n=$1
fi

# Validate input
if ! validate_input "$n"; then
    echo "Error: Please provide a non-negative integer"
    exit 1
fi

# Calculate factorial
factorial=1
for ((i=1; i<=n; i++)); do
    factorial=$((factorial * i))
done

# Display result
echo "Factorial of $n is $factorial"




#!/bin/bash

# Check if exactly 5 arguments are provided
if [ $# -ne 5 ]; then
    echo "Error: Exactly 5 command-line arguments are required"
    exit 1
fi

# Output file
output_file="PositionalParameters.txt"

# Get script name
script_name=$(basename "$0")

# Write output to PositionalParameters.txt
{
    echo "Script for Positional Parameters"
    echo "The Name of the Script is $script_name"
    echo "The first argument is $1"
    echo "The third argument is $3"
    echo "The fifth argument is $5"
    echo "The second and four arguments are $2 and $4"
    echo "The arguments are $1 $2 $3 $4 $5"
} > "$output_file"

# Display the file contents
cat "$output_file"




#!/bin/bash

# 1) Create Script.txt with the specified content
cat > Script.txt << EOL
A shell script is a computer program designed to be run by the Unix/Linux shell which could be one of the following:
The Bourne Shell
The C Shell
The Korn Shell
The GNU Bourne-Again Shell
A shell is a command-line interpreter and typical
EOL

# Calculator functions
add() {
    echo "$(($1 + $2))"
}

subtract() {
    echo "$(($1 - $2))"
}

multiply() {
    echo "$(($1 * $2))"
}

divide() {
    if [ $2 -eq 0 ]; then
        echo "Error: Division by zero is not allowed"
        exit 1
    fi
    echo "$(($1 / $2))"
}

# Function to validate number input
validate_number() {
    local input=$1
    if [[ "$input" =~ ^-?[0-9]+$ ]]; then
        return 0  # Valid integer
    else
        return 1  # Invalid input
    fi
}

# Get input (two numbers and an operation)
if [ $# -eq 3 ]; then
    num1=$1
    num2=$2
    operation=$3
else
    echo "Enter the first number:"
    read num1
    echo "Enter the second number:"
    read num2
    echo "Enter the operation (+, -, *, /):"
    read operation
fi

# Validate numbers
if ! validate_number "$num1" || ! validate_number "$num2"; then
    echo "Error: Please provide valid integers" | tee CalculatorOutput.txt
    exit 1
fi

# Perform calculation and store result
output_file="CalculatorOutput.txt"
case "$operation" in
    "+")
        result=$(add "$num1" "$num2")
        echo "Result of $num1 + $num2 = $result" > "$output_file"
        ;;
    "-")
        result=$(subtract "$num1" "$num2")
        echo "Result of $num1 - $num2 = $result" > "$output_file"
        ;;
    "*")
        result=$(multiply "$num1" "$num2")
        echo "Result of $num1 * $num2 = $result" > "$output_file"
        ;;
    "/")
        result=$(divide "$num1" "$num2")
        echo "Result of $num1 / $num2 = $result" > "$output_file"
        ;;
    *)
        echo "Error: Invalid operation. Use +, -, *, or /" | tee "$output_file"
        exit 1
        ;;
esac

# Display the file contents
cat "$output_file"
