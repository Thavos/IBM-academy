import { Component, Input, OnInit } from '@angular/core';
import { GreetingService } from '../greeting.service';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent implements OnInit {

  @Input()
  message!: string;

  greeting!: string;

  constructor(private greetingService: GreetingService) {
  }

  ngOnInit(): void {
    //throw new Error('Method not implemented.');
    this.greeting = this.greetingService.getGreetingMessage();
  }
  
}
