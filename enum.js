const DaysOfWeek = {
    MONDAY: 'Monday',
    TUESDAY: 'Tuesday',
    WEDNESDAY: 'Wednesday',
    THURSDAY: 'Thursday',
    FRIDAY: 'Friday',
    SATURDAY: 'Saturday',
    SUNDAY: 'Sunday'
};

function getDayName(day) {
    switch (day) {
        case DaysOfWeek.MONDAY:
            return "Start of the work week.";
        case DaysOfWeek.FRIDAY:
            return "End of the work week.";
        case DaysOfWeek.SATURDAY:
        case DaysOfWeek.SUNDAY:
            return "Weekend!";
        default:
            return "Not a valid day.";
    }
}

console.log(getDayName(DaysOfWeek.MONDAY)); 
console.log(getDayName(DaysOfWeek.SATURDAY)); 