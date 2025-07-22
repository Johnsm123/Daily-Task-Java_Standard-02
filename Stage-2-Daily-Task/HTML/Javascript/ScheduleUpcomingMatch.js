// Function to determine if the match date is the second Saturday of the month
function displayDay(matchDate) {
    // Validate the date
    let date;
    try {
        date = new Date(matchDate);
        // Check if the date is valid by comparing with its ISO string
        if (date.toISOString().split('T')[0] !== matchDate || isNaN(date.getTime())) {
            return "Invalid date. Please provide a valid date";
        }
    } catch (error) {
        return "Invalid date. Please provide a valid date";
    }

    // Check if the date is a Saturday (getDay() returns 6 for Saturday)
    if (date.getDay() !== 6) {
        return "The scheduled cricket match doesn't fall on the second Saturday of the month";
    }

    // Determine if it's the second Saturday
    const dayOfMonth = date.getDate();
    // Second Saturday falls between day 8 and 14 (first Saturday is 1-7, second is 8-14)
    if (dayOfMonth >= 8 && dayOfMonth <= 14) {
        return "The cricket match is scheduled on the second Saturday of a month";
    }

    return "The scheduled cricket match doesn't fall on the second Saturday of the month";
}