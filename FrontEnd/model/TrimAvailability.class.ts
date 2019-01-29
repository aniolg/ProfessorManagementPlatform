export class TrimAvailability {
    trimester:Trimester;
    dayRangeAvailability: dayRange;
    unavailability: Date; //!
  
    constructor(
      trimester:Trimester,
      dayRangeAvailability: dayRange,
      unavailability: Date
    ) {
      this.trimester = trimester;
      this.dayRangeAvailability = dayRangeAvailability;
      this.unavailability = unavailability;
    }
  }
  
  enum dayRange{
      morning = 1,
      afternoon = 2,
      allDay = 3,
  }
  