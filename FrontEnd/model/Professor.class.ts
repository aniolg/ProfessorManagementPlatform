import { Person } from "./Person.class";

export class Professor extends Person {
  
    availability: TrimAvailability[] = [];

  constructor(
    dni: string,
    name: string,
    surname: string,
    birthday: Date,
    telephone: number,
    adress: string
  ) {
    super(dni, name, surname, birthday, telephone, adress);
  }

  addAvailability(trimester:Trimester, dayRange:number, unavailability:Date) {
    this.availability.push(new TrimAvailability(trimester, dayRange, unavailability));
}

}