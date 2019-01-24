class Activity {
  title: string;
  description: string;
  softwareReq: boolean; 
  hardwareReq: boolean; 
  professor: Professor; 

  constructor(
    title: string,
    description: string,
    softwareReq: boolean,
    hardwareReq: boolean,
    professor: Professor
  ) {
      this.title = title;
      this.description = description;
      this.softwareReq = softwareReq;
      this.hardwareReq = hardwareReq;
      this.professor = professor;
  }
}
