class TrimAvailability {
    dayRangeAvailability: dayRange;
    unavailability: Date; //!
  
    constructor(
      dayRangeAvailability: dayRange,
      unavailability: Date
    ) {
      this.dayRangeAvailability = dayRangeAvailability;
      this.unavailability = unavailability;
    }
  }
  
  enum dayRange{
      morning = 1,
      afternoon = 2,
      allDay = 3,
  }
  