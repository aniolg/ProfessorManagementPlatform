 //!
class Trimester {
    name: string;
    periodStart: Date;
    periodEnd: Date;
  
    constructor(
      name: string,
      periodStart: Date,
      periodEnd: Date,

    ) {
      this.name = name;
      this.periodStart = periodStart;
      this.periodEnd = periodEnd;
    }

  }