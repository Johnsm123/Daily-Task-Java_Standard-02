#!/bin/bash

# Set the target year and month (August 1987)
YEAR=1987
MONTH=8

# Calculate previous and next months
PREV_MONTH=$((MONTH - 1))
NEXT_MONTH=$((MONTH + 1))

# Adjust year if month wraps around
if [ "$PREV_MONTH" -eq 0 ]; then
    PREV_MONTH=12
    PREV_YEAR=$((YEAR - 1))
else
    PREV_YEAR=$YEAR
fi

if [ "$NEXT_MONTH" -eq 13 ]; then
    NEXT_MONTH=1
    NEXT_YEAR=$((YEAR + 1))
else
    NEXT_YEAR=$YEAR
fi

# Function to get calendar lines and format
get_calendar() {
    local month=$1
    local year=$2
    cal "$month" "$year" | tail -n +3  # Skip header and day names
}

# Get calendar data
july_cal=$(get_calendar $PREV_MONTH $PREV_YEAR)
aug_cal=$(get_calendar $MONTH $YEAR)
sep_cal=$(get_calendar $NEXT_MONTH $NEXT_YEAR)

# Print year and month headers
echo "$YEAR"
echo "        July                 August              September"
echo "Su Mo Tu We Th Fr Sa  Su Mo Tu We Th Fr Sa  Su Mo Tu We Th Fr Sa"

# Print calendar lines side by side
for i in {1..7}; do  # Increased to 7 to accommodate August 30, 31
    # Extract i-th line from each calendar
    july_line=$(echo "$july_cal" | sed -n "${i}p")
    aug_line=$(echo "$aug_cal" | sed -n "${i}p")
    sep_line=$(echo "$sep_cal" | sed -n "${i}p")

    # Pad with blank if empty
    july_line=${july_line:-"                    "}
    aug_line=${aug_line:-"                    "}
    sep_line=${sep_line:-"                    "}

    # Print with fixed-width formatting
    printf "%-22s%-22s%-22s\n" "$july_line" "$aug_line" "$sep_line"
done