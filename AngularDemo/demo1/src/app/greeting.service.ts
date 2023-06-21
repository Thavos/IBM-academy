import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GreetingService {

  private greetingMessage = "Some Crazy ass message you can't even cope with mate."

  constructor() { }

  getGreetingMessage() {
    return this.greetingMessage;
  }
}
