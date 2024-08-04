function getDayName(dayNumber) {
    let dayName;
    
    switch (dayNumber) {
        case 0:
            dayName = 'Sunday';
            break;
        case 1:
            dayName = 'Monday';
            break;
        case 2:
            dayName = 'Tuesday';
            break;
        case 3:
            dayName = 'Wednesday';
            break;
        case 4:
            dayName = 'Thursday';
            break;
        case 5:
            dayName = 'Friday';
            break;
        case 6:
            dayName = 'Saturday';
            break;
        default:
            dayName = 'Invalid day number';
    }
    
    return dayName;
}

console.log(getDayName(0)); 
console.log(getDayName(3)); 
console.log(getDayName(6)); 
console.log(getDayName(7));
